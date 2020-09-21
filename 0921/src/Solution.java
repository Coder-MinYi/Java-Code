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
     *
     * @param root TreeNode类 the root of binary tree
     * @return int整型二维数组
     */
    private int pre = 0;
    private int index = 0;
    private int postindex = 0;
    //二叉树前中后序遍历
    public int[][] threeOrders (TreeNode root) {
        // write code here
        int n = count(root);
        int[][] res = new int[3][n];
        order(root,res);
        return res;
    }

    private void order(TreeNode root, int[][] res) {
        if (root == null){
            return;
        }
        res[0][pre++] = root.val;
        order(root.left,res);
        res[1][index++] = root.val;
        order(root.right,res);
        res[2][postindex++] = root.val;
    }

    private int count(TreeNode root) {
        if (root == null){
            return 0;
        }
        return 1 + count(root.left) + count(root.right);
    }
    //二叉树是否是平衡树
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null){
            return true;
        }
        return Math.abs(depth(root.left) - depth(root.right)) <=  1;
    }

    private int depth(TreeNode root) {
        if (root == null){
            return 0;
        }
        return 1 + Math.max(depth(root.left),depth(root.right));
    }
    //二叉树是否对称
    public boolean isSymmetric (TreeNode root) {
        // write code here
        if (root == null){
            return true;
        }
        return compare(root.left,root.right);
    }

    private boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right != null){
            return false;
        }
        if (left != null && right == null){
            return false;
        }
        if (left == null && right == null){
            return true;
        }
        return left.val == right.val && compare(left.left,right.right) && compare(left.left,right.left);
    }
}
