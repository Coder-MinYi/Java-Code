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
 * 二叉树镜像
 */
public class Solution1 {
    public void Mirror(TreeNode root) {
        if(root != null){
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right =tmp;
            Mirror(root.left);
            Mirror(root.right);
        }

    }
}
