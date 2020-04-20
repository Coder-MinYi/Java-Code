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
}
