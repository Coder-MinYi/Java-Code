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
public class Solution {
    public ListNode ReverseList(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode pre = null;
        ListNode next = null;

        while (head != null){
            //next指向下一个节点
            next = head.next;
            //pre始终指向head的前一个节点
            head.next = pre;
            pre = head;
            next = head;

        }
        return pre;
    }
}
