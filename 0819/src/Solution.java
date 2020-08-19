/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
//找到链表的中间节点并返回
public class Solution {
    public Node middleNode(Node head) {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    //链表中倒数第K个节点
    public Node FindKthToTail(Node head,int k) {
        if (head == null){
            return null;
        }
        Node fast = head;
        Node slow = head;

        while (k > 0){
            if (fast == null){
                return null;
            }
            fast = fast.next;
            k--;
        }
        while (fast != null){
            slow = slow.next;
            fast = fast.next;

        }
        return slow;
    }
    public Node ReverseList(Node head) {
        if (head == null) {
            return null;
        }
        Node pre = null;
        Node next = null;
        Node cur = head;
        while (cur != null) {
            //next指向下一个节点
            next = cur.next;
            //pre始终指向head的前一个节点
            cur.next = pre;
            pre = cur;
            cur = next;

        }
        return pre;
    }
}
