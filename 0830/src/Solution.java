/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.util.*;

class ListNode {
    int val;
    ListNode next = null;

    public ListNode(int val) {
        this.val = val;
    }
}

/**
 * 链表指定区间翻转
 */
public class Solution {
    /**
     *
     * @param head ListNode类
     * @param m int整型
     * @param n int整型
     * @return ListNode类
     */
    //1.将原链表分为三部分，m之前，m到n直接，n之后，并切断其联系
    //2.将m,n之间链表反转
    //3.将三部分重新连接
    public ListNode reverseBetween (ListNode head, int m, int n) {
        // write code here
        if (head == null){
            return null;
        }
        ListNode newhead = new ListNode(0);
        newhead.next = head;
        ListNode cur = newhead;

        for (int i = 0; i <m - 1 ; i++) {
            cur = cur.next;
        }
        ListNode start = cur.next;
        ListNode then = start.next;
        for(int i = 0;i < n - m; ++i) {
            start.next = then.next;
            then.next = cur.next;
            cur.next = then;
            then = start.next;
        }
        return newhead.next;
    }
}