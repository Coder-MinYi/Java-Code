import java.util.ArrayList;

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

    public TreeNode(int val) {
        this.val = val;
    }
}


public class Solution {
    /**
     * 二叉树转换成一个双向链表
     */
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree == null){
            return null;
        }
        ArrayList<TreeNode> list = new ArrayList<>();
        midOrder(pRootOfTree , list);
        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).right = list.get(i + 1);
            list.get(i + 1).left = list.get(i);
        }
        return list.get(0);
    }
    //二叉搜索树中序遍历就是有序的
    private void midOrder(TreeNode pRootOfTree, ArrayList<TreeNode> list) {
        if (pRootOfTree.left != null){
            midOrder(pRootOfTree.left , list);
        }
        list.add(pRootOfTree);
        if (pRootOfTree.right != null){
            midOrder(pRootOfTree.right ,list);
        }
    }
    public ArrayList<ArrayList<Integer>> pathSum (TreeNode root, int sum) {
        // write code here
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        dfs(result, new ArrayList<>(), root, sum);
        return result;
    }
    //二叉树中所有根节点到叶子结点总和为sum
    private void dfs(ArrayList<ArrayList<Integer>> result, ArrayList<Integer> list, TreeNode root, int sum) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            if (sum - root.val == 0) {
                list.add(root.val);
                result.add(new ArrayList<>(list));
                list.remove(list.size() - 1);
            }
            return;
        }
        list.add(root.val);
        dfs(result, list, root.left, sum - root.val);
        dfs(result, list, root.right, sum - root.val);
        list.remove(list.size() - 1);
    }
}
