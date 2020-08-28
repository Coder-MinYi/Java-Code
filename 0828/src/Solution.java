/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 输入一个整数，输出该数32位二进制表示中1的个数。其中负数用补码表示。
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
    public int NumberOf1(int n) {
        int count = 0;
        while (n != 0){
            count++;
            n &= (n-1);
        }
        return count;
    }

}
