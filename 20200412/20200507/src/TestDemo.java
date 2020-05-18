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
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(2);
        myLinkedList.addLast(2);
        myLinkedList.display();
        System.out.println("====================");

        myLinkedList.addIndex(0,99);
        myLinkedList.display();
        myLinkedList.addIndex(5,199);
        myLinkedList.display();
        myLinkedList.addIndex(2,9999);
        myLinkedList.display();
        myLinkedList.removeAllKey(2);
        myLinkedList.display();


        System.out.println(myLinkedList.contains(4));
        System.out.println(myLinkedList.size());
        myLinkedList.clear();
        System.out.println("====================");
    }
}