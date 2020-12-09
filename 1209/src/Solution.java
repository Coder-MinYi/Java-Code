import java.util.*;


class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
  }
//二叉树之字形遍历
public class Solution {
    /**
     *
     * @param root TreeNode类
     * @return int整型ArrayList<ArrayList<>>
     */
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();

        if(root == null){
            return list;
        }
        boolean reserve = false;
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
}