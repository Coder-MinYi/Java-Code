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
     ListNode(int x) { val = x; }
 }
/**
 * 删除排序链表中重复的元素
 * 例：1->1->2->3->3 删除后 1-> 2 -> 3
 */
public class Main {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur != null && cur.next != null){
            if (cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else {
                cur = cur.next;
            }
        }
        return head;
    }
}
