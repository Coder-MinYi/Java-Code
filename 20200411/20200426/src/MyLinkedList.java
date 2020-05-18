/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int data){
        this.data = data;
    }
}
public class MyLinkedList {
    public Node head; //标志双向链表头
    public Node tail;//标志双向链表尾巴
    public void addFirst(int data){
        Node node = new Node (data);
        if(this.head == null){
            this.head = node;
            this.tail = node;
            return;
        }
        node.next = this.head;
        this.head.prev = node;
        this.head = node;
    }
    public void disPlay(){
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.data+ " ");
            cur = cur.next;
        }
        System.out.println();
    }
    public void addLast(int data){
        Node node = new Node (data);
        if(this.head == null){
            this.head = node;
            this.tail = node;
            return;
        }
        tail.next = node;
        node.prev = tail;
        this.tail = node;
    }
    public boolean contains(int key){
        Node cur = this.head;
        while(cur != null){
            if(cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }
    public  int size (){
        Node cur = this.head;
        int count = 0;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        return count;
    }
    private Node seachIndex(int index){
        Node cur = this.head;
        while(index != 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }
    public void addIndex(int index, int data){
        if(index < 0 || index > size()){
            throw new RuntimeException("输入位置异常");
        }
        if (index == 0){
            addFirst(data);
            return;
        }
        if(size() == index){
            addLast(data);
            return;
        }
        Node node = new Node (data);
        Node cur = seachIndex(index);
        node.next = cur;
        node.prev = cur.prev;
        cur.prev.next= node;
        cur.prev = node;
    }
    public int remove(int key){
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                int oldData = cur.data;
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if(cur.next != null){
                        cur.next.prev = cur.prev;
                    }else{
                        this.tail = cur.prev;
                    }
                }
                return oldData;
            }
            cur = cur.next;
        }
        return -1;
    }
    public void removeAllkey(int key){
        Node cur = this.head;
        while (cur != null) {
            if(cur.data == key) {
                if(cur == this.head) {
                    this.head = this.head.next;
                    if(this.head != null) {
                        this.head.prev = null;
                    }
                }else {
                    cur.prev.next = cur.next;
                    if(cur.next != null){
                        cur.next.prev = cur.prev;
                    }else{
                        this.tail = cur.prev;
                    }
                }
            }
            cur = cur.next;
        }
    }
    public void clear(){
        while(head != null){
            Node cur = this.head.next;
            this.head.next = null;
            this.head.prev = null;
            this.head = cur;
        }
        this.tail = null;
    }
}

