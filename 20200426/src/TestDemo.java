/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(1);
        myLinkedList.disPlay();
        myLinkedList.addIndex(0 ,99);
        myLinkedList.disPlay();
        myLinkedList.addIndex(2 ,999);
        myLinkedList.disPlay();
        myLinkedList.addIndex(4 ,9999);
        myLinkedList.addIndex(4 ,9999);
        myLinkedList.addIndex(4 ,9999);
        myLinkedList.addIndex(4 ,9999);
        myLinkedList.disPlay();
        System.out.println(myLinkedList.contains(999));
        myLinkedList.remove(9999);
        myLinkedList.disPlay();
        myLinkedList.removeAllkey(9999);
        myLinkedList.disPlay();
        myLinkedList.size();
        myLinkedList.clear();
        System.out.println(myLinkedList.size());
    }
}
