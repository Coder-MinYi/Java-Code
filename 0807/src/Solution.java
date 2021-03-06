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
public class Solution {
    public ListNode Merge(ListNode list1,ListNode list2) {
        if(list1 == null && list2 == null) return null;
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        ListNode dummy = new ListNode(-1);
        ListNode list = dummy;
        while(list1 != null && list2 != null) {
            if(list1.val > list2.val) {
                list.next = list2;
                list = list.next;
                list2 = list2.next;
            } else {
                list.next = list1;
                list = list.next;
                list1 = list1.next;
            }
        }
        while(list1 != null) {
            list.next = list1;
            list = list.next;
            list1 = list1.next;
        }
        while(list2 != null) {
            list.next = list2;
            list = list.next;
            list2 = list2.next;
        }
        return dummy.next;

        }
    }
}
