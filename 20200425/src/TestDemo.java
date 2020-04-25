/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestDemo {
    public static Node getIntersectionNode(Node headA, Node headB) {
        //1、求长度，走差值步
        Node pl = headA;
        Node ps = headB;
        int lenA = 0;
        int lenB = 0;
        while(pl != null){
            lenA++;
            pl = pl.next;
        }
        while(ps != null){
            lenA++;
            ps = ps.next;
        }
        pl = headA;
        ps = headB;
        int len = lenA - lenB;
        if(len < 0){
            pl = headB;
            ps = headA;
            len = lenB - lenA;
        }
        //pl指向 最长单链表
        while(len != 0){
            pl = pl.next;
            len--;
        }
        //ps和pl一定在同一起跑线
        while(ps != pl && pl != null && ps != null){
            ps = ps.next;
            pl = ps.next;
        }
        if(pl == ps && pl != null){
            return pl;
        }
        return null;
    }
    public Node mergeTwoLists(Node headA, Node headB) {
        Node newHead = new Node(-1);
        Node tmp = newHead;
        while(headA != null && headB != null){
            if(headA.data < headB.data){
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA.next;
            }else
            {
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB.next;
            }
        }
        if(headA == null){
            tmp.next = headB;
        }
        if(headB == null){
            tmp.next = headA;
        }
        return newHead.next;
    }

    public static void main(String[] args) {
        MyLinkedList c = new MyLinkedList();
        c.addFrist(3);
        c.addFrist(2);
        c.addFrist(1);
        c.disPlay();
        c.addList(3);
        c.addList(2);
        c.addList(1);
        //c.disPlay2(c.func());
        c.disPlay();
        // System.out.println(c.contains(5));
        //System.out.println(c.size());
        // c.addIndex(2,3);
        // c.disPlay();
        //c.moveKey(8);
        //System.out.println();
        //c.disPlay();
        //System.out.println(c.middleNode());
        //Node ret = c.partition(7);
        //c.disPlay2(ret);
        Node m = c.deleteDuplication();
        c.disPlay2(m);
        System.out.println(c.chkPalindrome());
    }
}
