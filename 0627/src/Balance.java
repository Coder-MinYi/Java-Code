/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

import java.util.*;


/**
 * 二叉树平衡检测
 */
 class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}
public class Balance {
    public boolean isBalance(TreeNode root) {
        // write code here
        if (root == null){
            return true;
        }
        int left = depth(root.left);
        int right = depth(root.right);
        if (Math.abs(left - right) > 1){
            return false;
        }
        return isBalance(root.left) && isBalance(root.right);
    }
    public static int depth(TreeNode root){
        if (root == null){
            return 0;
        }
        return Math.max(depth(root.right),depth(root.left))+1;
    }
}