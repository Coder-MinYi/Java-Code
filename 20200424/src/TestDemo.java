/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestDemo {
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
