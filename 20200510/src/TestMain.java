import com.sun.scenario.effect.Merge;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestMain {
    public static Node Merge(Node list1, Node list2){
        Node node = new Node(-1);
        Node tmp = node;
        if(list1 == null){
            tmp.next = list2;
        }
        if(list2 == null){
            tmp.next = list1;
        }
        while(list1 != null && list2 != null){
            if (list1.data < list2.data){
                tmp.next = list1;
                list1 = list1.next;
            }else{
                tmp.next = list2;
                list2 = list2.next;
            }
            tmp = tmp.next;
        }
        if (list1 == null){
            tmp.next = list2;
        }
        if (list2 == null){
            tmp.next = list1;
        }
        return node.next;
    }
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        MyLinkedList myLinkedList1 = new MyLinkedList();
        myLinkedList.addFirst(9);
        myLinkedList.addFirst(7);
        myLinkedList.addFirst(5);
        myLinkedList.addFirst(3);
        myLinkedList1.addFirst(10);
        myLinkedList1.addFirst(6);
        myLinkedList1.addFirst(4);
        myLinkedList1.addFirst(1);
        myLinkedList.display();
        myLinkedList1.display();
        Node m = Merge(myLinkedList.head, myLinkedList1.head);
        myLinkedList.display2(m);
    }
}
