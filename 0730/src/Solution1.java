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
 * 删除链表中重复的节点
 * 在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，
 * 重复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 */
public class Solution1 {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null){
            return pHead;
        }
        ListNode Head = new ListNode(-1);
        Head.next = pHead;
        //.设置 pre ，cur 指针， pre指针指向当前确定不重复的那个节点
        // 而cur指针相当于工作指针，一直往后面搜索。
        ListNode pre = Head;
        ListNode cur = Head.next;
        while (cur != null){
            if (cur.next != null && cur.val == cur.next.val){
                //找到最后一个相同的数字
                while (cur.next != null && cur.val == cur.next.val){
                    cur = cur.next;
                }
                pre.next = cur.next;
                cur = cur.next;
            }else {
                pre = pre.next;
                cur = cur.next;
            }
        }
        return Head.next;
    }
}
