
import java.util.*;

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
 *题目：编写代码，以给定值x为基准将链表分割成两部分，所有小于x的结点排在大于或等于x的结点之前
 *给定一个链表的头指针 ListNode* pHead，请返回重新排列后的链表的头指针。
 * 注意：分割以后保持原来的数据顺序不变
 *
 * 两个链表，一个小链表，一个大链表，最后小链表的尾指向大链表的头，返回小链表的头；
 */
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if (pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode l1 = new ListNode(-1);
        ListNode l2 = new ListNode(-1);
        ListNode small = l1;
        ListNode big = l2;
        ListNode cur = pHead;
        while (cur != null){
            if (cur.val < x){
                l1.next = cur;
                l1 = l1.next;
            }else {
                l2.next = cur;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        l1.next = big.next;
        l2.next = null;

        return small.next;
    }
}