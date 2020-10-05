import java.util.List;

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

    ListNode(int val) {
        this.val = val;
    }
}
public class Main {
    public ListNode ReverseList(ListNode head) {
        if (head == null || head.next == null){
            return head;
        }
        ListNode pre = null;
        ListNode next = null;
        ListNode cur = head;
        while (cur != null){
            next = cur.next;

            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
    public boolean hasCycle(ListNode head) {
        if (head == null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow){
                return true;
            }
        }
        return false;
    }
    public ListNode removeNthFromEnd (ListNode head, int n) {
        if (head == null){
            return head;
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
