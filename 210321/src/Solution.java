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
//反转链表
public class Solution {
    public ListNode ReverseList(ListNode head) {
        // 判断链表为空或长度为1的情况
        if (head == null || head.next == null){
            return head;
        }
        ListNode pre = null;
        ListNode next = null;
        ListNode cur = head;
        while( cur != null){
            next = cur.next; // 记录当前节点的下一个节点位置；

            cur.next = pre; // 让当前节点指向前一个节点位置，完成反转
            pre = cur; // pre 往右走
            cur = next;// 当前节点往右继续走
        }
        return pre;
    }
}

