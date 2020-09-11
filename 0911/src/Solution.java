import java.util.Deque;
import java.util.LinkedList;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class ListNode {
    int val;
    ListNode next = null;
 }
 //判断链表是否是回文
public class Solution {
    /**
     *
     * @param head ListNode类 the head
     * @return bool布尔型
     */
    public boolean isPail (ListNode head) {
        // write code here
        if(head == null || head.next == null){
            return false;
        }
        //双端队列
        Deque<Integer> queue = new LinkedList<>();

        while (head != null){
            queue.addLast(head.val);
            head = head.next;
        }
        while (queue.size() > 1){
            if (!queue.pollFirst().equals(queue.pollLast())){
                return false;
            }
        }
        return true;
    }
}
