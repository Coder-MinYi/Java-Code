package com.demo.www;

import java.util.Arrays;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class MyArrayList {
    public int[] elem;//数组
    public int usedSize;//有效数据个数
    public static final int intCapacity = 10;//初始容量

    public MyArrayList() {
        this.elem = new int[intCapacity];
        this.usedSize = 0;
    }

    //打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i] + " ");
        }
        System.out.println();
    }

    //
    private boolean isFull() {
        return this.usedSize == this.elem.length;
    }

    private void checkPos(int pos) {
        if (pos < 0 || pos > this.usedSize) {
            throw new RuntimeException("位置不合法");
        }
    }

    //在pos位置插入元素
    public void add(int pos, int data) {
        checkPos(pos);
        if (isFull()) {
            this.elem =
                    Arrays.copyOf(this.elem, 2 * this.elem.length);
        }
        for (int i = this.usedSize - 1; i >= pos; i--) {
            elem[i + 1] = elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }

    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for (int i = 0; i < this.usedSize - 1; i++) {
            if (this.elem[i] == toFind) {
                return true;
            }
        }
        return false;
    }

    // 查找某个元素对应的位置
    public int search(int toFind) {
        for (int i = 0; i < this.usedSize - 1; i++) {
            if (this.elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }

    private boolean isEmpty() {
        return this.usedSize == 0;
    }

    //获取POS位置元素
    public int getPos(int pos) {
        if (isEmpty()) {
            throw new RuntimeException("顺序表为空");
        }
        if (pos < 0 || pos >= this.usedSize) {
            throw new RuntimeException("位置不合法");
        }
        return this.elem[pos];
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if (pos < 0 || pos >= this.usedSize) {
            throw new RuntimeException("位置不合法");
        }
        this.elem[pos] = value;
    }
    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }
    // 清空顺序表
    public void clear() {
        this.usedSize = 0;
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int index = search(toRemove);
        if(index == -1){
            System.out.println("没有该数据");
        }
        for (int i = index; i < this.usedSize - 1; i++) {
            this.elem[i] = this.elem[i + 1];
        }
        this.usedSize--;
    }
}
