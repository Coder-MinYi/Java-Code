
    class Node{
        public int data;
        public Node next;
        public Node(int data){
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
    }

