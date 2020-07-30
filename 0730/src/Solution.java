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

/**
 * 对称二叉树
 * 请实现一个函数，用来判断一棵二叉树是不是对称的。
 * 注意，如果一个二叉树同此二叉树的镜像是同样的，定义其为对称的。
 */
public class Solution {
    boolean isSymmetrical(TreeNode pRoot) {
        if (pRoot == null){
            return true;
        }
        return isSy(pRoot,pRoot);
    }

    private boolean isSy(TreeNode left, TreeNode right) {
        if (left == null && right == null){
            return true;
        }
        if (left == null || right == null){
            return false;
        }
        if (left.val != right.val){
            return false;
        }
        return isSy(left.left,right.right) && isSy(left.right,right.left);
    }
}
