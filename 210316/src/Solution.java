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
//二叉树镜像
public class Solution {
    public TreeNode Mirror (TreeNode pRoot) {
        // write code here
        if (pRoot == null) {
            return pRoot;
        } else {
            TreeNode node = pRoot.left;
            pRoot.left = pRoot.right;
            pRoot.right = node;
            Mirror(pRoot.left);
            Mirror(pRoot.right);
            return pRoot;
        }
    }
}
