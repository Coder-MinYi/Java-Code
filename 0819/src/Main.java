/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.addFrist(1);
        list.addFrist(2);
        list.addLast(5);

        list.addFrist(3);
        list.disPlay();
        list.addLast(4);
        list.addLast(5);
        list.addLast(4);
        list.addFrist(5);

        list.disPlay();
        list.addIndex(2,99);
        list.disPlay();
        System.out.println(list.size());
        System.out.println(list.contains(5));
        System.out.println(list.contains(8));
        list.remove(4);
        list.disPlay();
        //list.remove(89);
        list.removeAllkey(5);
        list.disPlay();
        Node node = list.middleNode();
        System.out.println(node.data);
    }
}
