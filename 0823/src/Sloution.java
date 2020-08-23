import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 从上而下打印二叉树
 */
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }
}
public class Sloution {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        if (root == null){
            return list;
        }
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);

        while (!queue.isEmpty()){
            list.add(queue.poll().val);
        }
        if (root.left != null){
            queue.add(root.left);
        }
        if (root.right != null){
            queue.add(root.right);
        }
        if (!queue.isEmpty()){
            root = queue.peek();
        }
        return list;
    }
}
