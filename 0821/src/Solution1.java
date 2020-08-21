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
 * 树的子结构，输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class Solution1 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root1 ==null || root2 == null){
            return false;
        }
        boolean flag = doHasSubtree(root1,root2);

        if (flag){
            return true;
        }else {
            return HasSubtree(root1.left,root2)&&HasSubtree(root1.right,root2);
        }
    }

    private boolean doHasSubtree(TreeNode root1, TreeNode root2) {
        if (root2 == null){
            return true;
        }
        if (root1 == null){
            return false;
        }
        if (root1.val == root2.val){
            return doHasSubtree(root1.left,root2.left) && doHasSubtree(root1.right,root2.right);
        }else {
            return false;
        }
    }
}
