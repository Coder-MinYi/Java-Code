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
    }
}


class Solution {
    /**
     * 删除链表中的节点
     * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点。
     * 传入函数的唯一参数为 要被删除的节点
     */
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

    /**
     * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
     * k 是一个正整数，它的值小于或等于链表的长度。
     * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
     */
    //按K个元素翻转
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head == null && head.next == null && k == 1){
            return head;
        }
        ListNode cur = head;
        for (int i = 0; i < k; i++) {
            if (cur == null){
                return head;
            }
            cur = cur.next;
        }
        ListNode newHead = reverse(head , k);

        head.next = reverseKGroup(cur , k);

        return newHead;
    }
    private ListNode reverse(ListNode head, int k) {
        ListNode pre = null;
        ListNode next = null;
        while (k > 0){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
            k--;
        }
        return pre;
    }
    //合并两个排序链表
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode newHead = new ListNode(-1);
        ListNode cur = newHead;
        while (l1 != null && l2 != null){
            if (l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }
        if (l1 == null){
            cur.next = l2;
        }else {
            cur.next = l1;
        }
        return newHead.next;
    }
}
