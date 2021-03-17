/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
//链表
public class MyLinkedList {
    private Node head;
    private Node last;
    private int size;
    //尾插法
    public  boolean add(String e){
        Node node = new Node(e);
        if (head == null){
            head = last = node;
        }else {
            node.prev = last;
            last.next = node;
            last = node;
        }
        size++;
        return true;
    }
    public void add(int index , String e){
        checkIndex(index);
        Node node  = new Node(e);
        if (head == null){
            head = last = node;
        }else if(index == 0){
            node.next = head;
            head.prev = node;
            head = node;
        }else if (index == size()){
            node.prev = last;
            last.next = node;
            last = node;
        }else {
            Node cur = getPrevindex(index);
            Node next = cur.next;
            //cur -> next
            //cur -> node -> next
            node.prev = cur;
            node.next = next;
            cur.next = node;
            next.prev = node;

        }
        size++;
    }

    private void checkIndex(int index) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("下标越界");
        }
    }

    private Node getPrevindex(int index) {
        Node cur = head;
        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }
        return cur;
    }

    public void remove(int index){
        checkIndex(index);
        if (size() == 1){
            head = last = null;
        }else if (index == 0){
            head = head.next;
            head.prev = null;
        }else if (index == size() - 1){
            last = last.prev;
            last.next = null;
        }else {
            Node prev = getPrevindex(index);
            Node node = prev.next;
            Node next = node.next;

            prev.next = next;
            next.prev = prev;
        }
        size--;
    }
    public boolean remove(String e){
        Node cur = head;
        while (cur != null){
            if (cur.val.equals(e)){
                Node prev = cur.prev;
                Node next = cur.next;
                if (prev != null) {
                    prev.next = next;
                }else {
                    head = head.next;
                }
                if (next != null) {
                    next.prev = prev;
                }else {
                    last = last.prev;
                }
                size--;
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    public String get(int index){
        checkIndex(index);
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.val;
    }

    public String set(int index , String e){
        checkIndex(index);

        Node node = head;
        for (int i = 0; i < index; i++) {
        ;    node = node.next;
        }
        String oldVal = node.val;
        node.val = e;
        return oldVal;
    }
    public int size(){
        return size;
    }
}
