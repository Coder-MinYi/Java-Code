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
 * 二叉树的深度
 */
public class Solution2 {
    public int TreeDepth(TreeNode root) {
        if (root == null){
           return 0;
        }
        int left = TreeDepth(root.left);
        int right  = TreeDepth(root.right);

        return left > right ? left+1 : right+1;
    }
}
