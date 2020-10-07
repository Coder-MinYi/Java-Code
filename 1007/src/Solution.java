import java.util.*;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
 }
public class Solution {
    /**
     *  按之字形打印二叉树
     * @param root TreeNode类
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        if(root == null){
            return list;
        }
        boolean reserve = true;
        //层序遍历
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            ArrayList<Integer> arrayList = new ArrayList<>();
            int count = queue.size();
            while (count-- > 0){
                TreeNode node = queue.poll();
                if (node == null){
                    continue;
                }
                arrayList.add(node.val);
                queue.add(node.left);
                queue.add(node.right);
            }
            //逆置
            if (reserve){
                Collections.reverse(arrayList);
            }
            reserve = !reserve;
            if (arrayList.size() != 0){
                list.add(arrayList);
            }
        }
        return list;
    }

    /**
     * 二叉树镜像
     * @param root
     */
    public void Mirror(TreeNode root) {
        if(root != null){
            TreeNode node = root.left;
            root.left = root.right;
            root.right = node;
            Mirror(root.left);
            Mirror(root.right);
        }
    }

    /**
     * 二叉树层序遍历
     * @param root
     * @return
     */
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (root == null){
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = queue.size(); i > 0 ; i--) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            lists.add(new ArrayList<>(list));
        }
        return lists;
    }
}
