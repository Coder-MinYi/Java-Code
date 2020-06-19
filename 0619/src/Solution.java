

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
    public void 镜子(TreeNode root) {
        if (root != null){
            TreeNode tmp = root.left;
            root.left = root.right;
            root.right = tmp;
            镜子(root.left);
            镜子(root.right);
        }
    }
}
