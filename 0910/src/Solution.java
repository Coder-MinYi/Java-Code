import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

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
 }
 //二叉树层序遍历
public class Solution {
    public ArrayList<ArrayList<Integer>> levelOrder (TreeNode root) {
        // write code here
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        if (root == null){
            return lists;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = queue.size(); i > 0 ; i--) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            lists.add(new ArrayList<>(list));
        }
        return lists;
    }
    //二叉树最大深度
     public int maxDepth (TreeNode root) {
         // write code here
         if(root == null){
             return 0;
         }
         int left = maxDepth(root.left);
         int right = maxDepth(root.right);
         return 1+(left > right ? left : right);
     }
}
