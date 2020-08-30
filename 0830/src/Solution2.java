/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.util.*;

class TreeNode {
     int val = 0;
    TreeNode left = null;
    TreeNode right = null;
  }

/**
 * 给定一个二叉树和一个值 sum\ sum sum，
 * 判断是否有从根节点到叶子节点的节点值之和等于 sum\ sum sum 的路径，
 */
public class Solution2 {
    /**
     *
     * @param root TreeNode类
     * @param sum int整型
     * @return bool布尔型
     */
    public boolean hasPathSum (TreeNode root, int sum) {
        // write code here
        if (root == null){
            return false;
        }
        if (root.left == null && root.right == null){
            return root.val == sum;
        }
        return hasPathSum(root.left, sum - root.val) && hasPathSum(root.right,sum - root.val);
    }
}
