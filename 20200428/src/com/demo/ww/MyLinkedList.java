package com.demo.ww;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class Node{
    public  int data;
    public Node next;

    public Node(int data) {
        this.data = data;
    }
}
public class MyLinkedList {
    public Node head;

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if(this.head == null){
            this.head = node;
            return;
        }
        node.next = this.head;
        this.head = node;
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if(this.head == null){
            this.head = node;
            return;
        }
        while(cur.next != null){
            cur = cur.next;
        }
        cur.next = node;
    }
    //打印链表
    public void display(){
        Node cur = this.head;
        while(cur != null){
            System.out.print(cur.data+" ");
            cur = cur.next;
        }
        System.out.println();
    }
    //查找任意位置
    public Node searchIndex(int index){
        if(index < 0 || index > this.size()){
            throw new RuntimeException("index位置不合法");
        }
        Node cur = this.head;
        while(index - 1 != 0){
            cur = cur.next;
            index--;
        }
        return cur;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index , int key){
        if (index == 0){
            addFirst(key);
            return;
        }
        if (index == this.size()){
            addLast(key);
            return;
        }
        Node cur = searchIndex(index);
        Node node = new Node(key);
        node.next = cur.next;
        cur.next = node;
    }

    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key){
        Node cur = this.head;
        while(cur != null){
            if(cur.data == key){
                return true;
            }
            cur = cur.next;
        }
        return  false;
    }
    //寻找删除节点的前驱
    public Node searchPrev(int key){
        Node prev = this.head;
        while(prev.next != null){
            if(prev.next.data == key){
                return prev;
            }else{
                prev = prev.next;
            }
        }
            return null;
    }
    //删除第一次出现关键字为key的节点
    public void remove(int key){
        if(this.head == null){
            return;
        }
        //删除的是头结点
        if (this.head.data == key){
            this.head = this.head.next;
            return;
        }
        Node prev = searchPrev(key);
        if(prev == null){
            System.out.println("该节点不存在");
            return;
        }
        Node cur = prev.next;
        prev.next = cur.next;

    }
    //删除所有值为key的节点
    public void removeAllkey(int key){
        Node prev = this.head;
        Node cur = this.head.next;
        if(this.head.data == key){
            this.head = this.head.next;
        }
        while(cur != null){
            if(cur.data == key){
                prev.next = cur.next;
                cur = cur.next;
            }else{
                prev = prev.next;
                cur = cur.next;
            }
        }
    }
    //得到单链表的长度
    public int size(){
        Node cur = this.head;
        int count = 0;
        while (cur != null){
            count++;
            cur = cur.next;
        }
        return  count;
    }
    //清空链表
    public  void clear(){
        this.head = null;
    }
}

