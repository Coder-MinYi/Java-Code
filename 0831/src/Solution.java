/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
public class Solution {
    //判断链表是否有环
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    //找到链表的入口节点
    public ListNode detectCycle(ListNode head) {
        if (head == null) {
            return null;
        }

        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if(fast == null || fast.next ==null){
            return null;
        }
        slow = head;
        while (slow != fast){
            fast = fast.next;
            slow = slow.next;
        }
        return slow;
    }
    //删除链表的倒数第K个节点
    public ListNode removeNthFromEnd (ListNode head, int n) {
        // write code here
        if (head == null){
            return null;
        }
        ListNode newHead = new ListNode(0);
        newHead.next = head;
        ListNode frist = newHead;
        ListNode end = newHead;
        if(head.next == null && n == 1){
            return null;
        }
        for (int i = 0; i < n; i++) {
            frist = frist.next;
        }
        while (frist != null && frist.next != null){
            frist = frist.next;
            end = end.next;
        }
        end.next = end.next.next;
        return newHead.next;
    }
}