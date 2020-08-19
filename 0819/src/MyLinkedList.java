/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class Node{
    public int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkedList {
    public Node head;

    //头插法
    public void addFrist(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        node.next = head;
        head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
            return;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }

    //打印链表
    public void disPlay() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.data + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //在任意位置插入
    public void addIndex(int index, int data) {
        // Node cur = this.head;
        Node node = new Node(data);
        //插入位置不存在，返回false
        if (index > size()) {
            // return false;
        }
        //在头插入
        if (index == 0) {
            addFrist(data);
            // return true;
        }
        //在尾部插入
        if (index == size()) {
            addLast(data);
            //return true;
        }
        Node cur = searchIndex(index);
        node.next = cur.next;
        cur.next = node;

    }

    //链表长度
    public int size() {
        Node cur = this.head;
        int size = 0;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        return size;
    }

    //查找任意位置的元素
    private Node searchIndex(int index) {
        if (index < 0 || index > size()) {
            System.out.println("查找下标不合法");
        }
        Node cur = this.head;
        while (index - 1 != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }

    //查找链表是否包含key元素
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.data == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //删除第一次出现关键字key的节点
    public void remove(int key) {
        if (head == null) {
            return;
        }
        //删除的是头节点
        if (this.head.data == key) {
            this.head = this.head.next;
        }
        //找到要删除节点的前驱节点
        Node pre = this.head;
        while (pre.next != null) {
            if (pre.next.data == key) {
                Node del = pre.next;
                pre.next = del.next;
                break;
            } else {
                pre = pre.next;
            }
        }
        if (pre == null) {
            System.out.println("没有该节点");
        }
    }

    //删除所有值为key的节点
    public void removeAllkey(int key) {
        if (head == null) {
            return;
        }
        //删除的是头节点
        if (this.head.data == key) {
            this.head = this.head.next;
        }
        //找到要删除节点的前驱节点
        Node pre = this.head;
        while (pre.next != null) {
            if (pre.next.data == key) {
                Node del = pre.next;
                pre.next = del.next;
                break;
            } else {
                pre = pre.next;
            }
        }
    }
    public Node middleNode() {
        Node fast = head;
        Node slow = head;
        while (fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

        }
        return slow;
    }
}
