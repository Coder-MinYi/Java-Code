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
      TreeNode(int x) { val = x; }
}

public class Solution1 {
    //二叉树深度
    public int maxDepth(TreeNode root) {
        if (root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left ,right) + 1;
    }
    //二叉树是否相同
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        }else if( p == null || q == null){
            return false;
        }else if (p.val != q.val){
            return false;
        }
        return isSameTree(p.left ,q.left) && isSameTree(p.right , q.right);
    }
    //二叉树是否是另一个的子树
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (t == null) {
            return true;
        }
        if (s == null){
            return false;
        }
        return isSubtree(s.left , t) || isSubtree(s.right , t) || isSameTree(s , t);
    }
}
