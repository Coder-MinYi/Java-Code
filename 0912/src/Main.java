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
public class Main {
    public void Mirror(TreeNode root) {
        if (root != null){
            TreeNode node = root.left;
            root.left = root.right;
            root.right = node;
            Mirror(root.left);
            Mirror(root.right);
        }
    }
    /**
     *
     * @param root TreeNode类
     * @param o1 int整型
     * @param o2 int整型
     * @return int整型
     */
    //在二叉树中找到两个节点的最近公共祖先节点
    public int lowestCommonAncestor (TreeNode root, int o1, int o2) {
        // write code here
        if(root == null){
            return 0;
        }
        if (root.val == o1 || root.val == o2){
            return root.val;
        }
        int left = lowestCommonAncestor(root.left , o1 , o2);
        int right = lowestCommonAncestor(root.right , o1 ,o2);
        if (left != 0 && right != 0){
            return root.val;
        }
        if (left == 0){
            return right;
        }
        if (right == 0){
            return left;
        }
        return 0;
    }
}