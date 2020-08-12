import java.util.ArrayList;
import java.util.Stack;

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
 * 请实现一个函数按照之字形打印二叉树，
 * 即第一行按照从左到右的顺序打印，第二层按照从右至左的顺序打印，
 * 第三行按照从左到右的顺序打印，其他行以此类推
 */
public class Main {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        ArrayList<Integer> line = new ArrayList<>();
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        TreeNode temp = null;
        if (pRoot == null) {
            return arr;
        }
        stack1.push(pRoot);
        while (!stack1.isEmpty() || !stack2.isEmpty()) {
            if (!stack1.isEmpty()) {
                while (!stack1.isEmpty()) {
                    temp = stack1.pop();
                    line.add(temp.val);
                    if (temp.left != null) {
                        stack2.push(temp.left);
                    }
                    if (temp.right != null) {
                        stack2.push(temp.right);
                    }
                }
                arr.add(new ArrayList(line));
            }

            if (!stack2.isEmpty()) {
                while (!stack2.isEmpty()) {
                    temp = stack2.pop();
                    line.add(temp.val);
                    if (temp.right != null) {
                        stack1.push(temp.right);
                    }
                    if (temp.left != null) {
                        stack1.push(temp.left);
                    }
                }
                arr.add(new ArrayList(line));
        }
        }

        return arr;
    }
}
