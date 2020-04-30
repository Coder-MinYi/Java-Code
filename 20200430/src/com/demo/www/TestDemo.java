package com.demo.www;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,1);
        myArrayList.add(0,2);
        myArrayList.add(0,3);
        myArrayList.add(0,4);
        myArrayList.display();
        System.out.println(myArrayList.contains(4));
        System.out.println(myArrayList.search(3));
        System.out.println(myArrayList.getPos(0));
        myArrayList.setPos(1,999999);
        myArrayList.display();
        System.out.println(myArrayList.size());
        myArrayList.remove(4);
        myArrayList.display();
    }
}
