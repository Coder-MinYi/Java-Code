package com.demo.ww;

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
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(3);
        myLinkedList.addFirst(2);
        myLinkedList.addFirst(1);
        myLinkedList.display();
        myLinkedList.addLast(5);
        myLinkedList.addLast(6);
        myLinkedList.addLast(7);
        myLinkedList.addLast(8);
        myLinkedList.display();
        System.out.println(myLinkedList.size());
        //myLinkedList.addIndex(-1,99);
        myLinkedList.addIndex(0,99);
        myLinkedList.addIndex(4,99);
        myLinkedList.addIndex(5,99);
        myLinkedList.addIndex(6,99);
        myLinkedList.addIndex(10,99);
        myLinkedList.display();
        System.out.println(myLinkedList.contains(5));
        System.out.println(myLinkedList.contains(999));
        //myLinkedList.remove(99);
        //myLinkedList.display();
        myLinkedList.removeAllkey(99);
        myLinkedList.display();
        myLinkedList.clear();
        myLinkedList.display();
    }
}
