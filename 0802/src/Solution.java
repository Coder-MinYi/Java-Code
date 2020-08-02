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

/**
 * 给一个链表，若其中包含环，请找出该链表的环的入口结点，否则，输出null。
 */
public class Solution {
    public ListNode EntryNodeOfLoop(ListNode pHead) {
        //定义双指针，一个一次两步，一个一次一步
        ListNode fast = pHead;
        ListNode low = pHead;

        while (fast != null && fast.next != null){
            fast = fast.next.next;
            low = low.next;
            //找到相遇点
            if (fast == low){
                break;
            }
        }
        if (fast == null || fast.next == null){
            return null;
        }
        low = pHead;
        while (fast != low){
            fast = fast.next;
            low = low.next;
        }
        return fast;
    }
}
