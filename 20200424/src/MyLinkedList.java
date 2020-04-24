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

    public Node(int data) {
        this.data = data;
    }

}
public class MyLinkedList {
    public  Node head;
    public void addFrist(int data){
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
            return;
            }
            node.next = this.head;
            this.head = node;
    }
    public void disPlay(){
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
            }
        System.out.println();
    }
        public void addList(int data){
            Node cur = this.head;
            Node node = new Node(data);
            if(this.head == null){
                this.head = node;
                return;
            }
            while(cur.next != null){
                cur = cur.next;
            }
            cur.next = node;
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
        public int size(){
            Node cur = this.head;
            //if(this.head == null){
            //  return 1;
            //}
            int count = 0;
            while(cur != null){
                count++;
                cur = cur.next;
            }
            return count;
        }
        public void addIndex(int index, int data){
            Node node  = new Node(data);
            if(index == 0){
                addFrist(data);
                return;
            }
            if(index == size()){
                addList(data);
                return;
            }
            Node cur = searchIndex(index);
            node.next = cur.next;
            cur.next = node;
        }
        private Node searchIndex(int index){
            if(index < 0 || index > this.size()){
                throw new RuntimeException("index位置不合法");
            }
            Node cur = this.head;
            while(index - 1 !=0){
                cur = cur.next;
                index--;
            }
            return cur;
        }
        public void moveKey(int key){
            Node prev = this.head;
            Node cur = this.head.next;
            while(cur != null){
                if(cur.data == key){
                    prev.next = cur.next;
                    cur =cur.next;
                }else{
                    prev = cur;
                    cur = cur.next;
                }
            }
            if(this.head.data == key){
                this.head = this.head.next;
            }
        }
        public void clear(){
            this.head = null;
        }
        public Node func(){
            Node cur = this.head;
            Node prev = null;
            Node curNext;
            Node newHead = null;
            while(cur != null){
                curNext = cur.next;
                if(curNext == null){
                    newHead = cur;
                }
                cur.next = prev;
                prev = cur;
                cur = curNext;
            }
            return newHead;
        }
        private Node searchPrev(int key) {
            Node prev = this.head;
            while (prev.next !=null) {
                if(prev.next.data == key) {
                    return prev;
                }else {
                    prev = prev.next;
                }
            }
            return null;
        }
        //删除第一次出现关键字为key的节点
        public void remove(int key){
            if(this.head == null) {
                return;
            }
            //删除的是不是头节点
            if(this.head.data == key) {
                this.head = this.head.next;
                return;
            }
            //找到删除节点的前驱
            Node prev = searchPrev(key);
            if(prev == null) {
                System.out.println("根本没有这个节点！");
                return;
            }
            //开始删除
            Node del = prev.next;
            prev.next = del.next;
        }
        public int middleNode() {
            Node fast = this.head;
            Node slow = this.head;
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow.data;
        }
        public void disPlay2(Node newHead){
            Node cur = newHead;
            while(cur != null){
                System.out.print(cur.data+" ");
                cur = cur.next;
            }
            System.out.println();
        }
        public Node partition(int x) {
            Node bs = null;
            Node be = null;
            Node as = null;
            Node ae = null;
            Node cur = this.head;
            while (cur != null) {
                if(cur.data < x) {
                    //第一次插入
                    if(bs == null) {
                        bs = cur;
                        be = cur;
                    }else {
                        be.next = cur;
                        be = be.next;
                    }
                }else {
                    //第一次插入
                    if(as == null) {
                        as = cur;
                        ae = cur;
                    }else {
                        ae.next = cur;
                        ae = ae.next;
                    }
                }
                cur = cur.next;
            }
            //1.判断bs是否为空  如果bs == null 返回as
            if (bs == null){
                return as;
            }
            //2、如果bs不为空  需要进行拼接
            be.next = as;
            //3、如果ae不为空    ae的next需要置为空
            if (ae != null){
                ae.next = null;
            }
            return bs;
        }
        public Node deleteDuplication() {
            Node cur = this.head;
            Node newHead = new Node (-1);
            Node tmp = newHead;
            while(cur != null){
                if(cur.next != null &&cur.data == cur.next.data){
                    while(cur.next != null &&cur.data == cur.next.data){
                        cur = cur.next;
                    }
                    cur = cur.next;
                }else{
                    tmp.next = cur;
                    tmp = tmp.next;
                    cur = cur.next;
                }
            }
            tmp.next = null;
            return newHead.next;
        }
        public boolean chkPalindrome() {
            //单链表为空  那么肯定不是回文结构
            if(this.head == null) {
                return false;
            }
            //这是只有头节点自己 必然是回文结构
            if(this.head.next == null) {
                return true;
            }
            //1、找到单链表的中间节点
            Node fast = this.head;
            Node slow = this.head;

            while (fast!=null && fast.next!=null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            //2、反转单链表的后半部分  slow肯定在中间位置
            Node cur = slow.next;
            while (cur != null) {
                Node curNext = cur.next;
                cur.next = slow;
                slow = cur;
                cur = curNext;
            }
            //slow 是最后一个节点了
            //3、开始一个从头走 一个从尾走
            while (slow != this.head) {
                if(slow.data != this.head.data) {
                    return false;
                }
                //判断偶数的情况
                if(this.head.next == slow) {
                    return true;
                }
                slow = slow.next;
                this.head = this.head.next;
            }
            return true;
        }

    }

