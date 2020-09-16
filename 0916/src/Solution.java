/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
//判断树是否相同
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q != null){
            return false;
        }
        if (p != null && q == null){
            return false;
        }
        if (p == null && q == null){
            return true;
        }
        if (p.val == q.val){
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }else {
            return false;
        }
    }
    //翻转二叉树
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
             return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

         root.left = right;
         root.right = left;
         return root;
    }
}
