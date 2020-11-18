package 面试题;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public Node reverse(Node head) {
        Node prev = null;
        Node cur = head;

        while (cur != null) {
            Node next = cur.next;
            // 修改逆置关系
            cur.next = prev;

            // 在此之上，prev 就是 cur 的前驱结点
            prev = cur;         // prev = x;
            // cur = cur.next; 由于 cur.next 的值被修改了，所以出错
            cur = next;     // 这个时候，next 是 cur.next 的原来的值
        }

        return prev;
    }

    private int size(Node head) {
        Node cur = head;
        int size = 0;
        while (cur != null) {
            cur = cur.next;
            size++;
        }

        return size;
    }

    public Node 合并多个有序链表(Node[] heads) {
        List<Node> headList = arrayToList(heads);
        if (headList.isEmpty()) {
            return null;
        }

        Node ansHead = new Node(-1);
        Node last = ansHead;

        // 如果 headList 的元素变成 null 了，需要从 list 中 remove 掉
        while (headList.size() >= 2) {
            int index = -1;
            for (int i = 0; i < headList.size(); i++) {
                Node head = headList.get(i);

                if (index == -1 || head.val < headList.get(index).val) {
                    index = i;
                }
            }

            // index 就是目前最小的第一个结点下标
            Node node = headList.remove(index);
            if (node.next != null) {
                headList.add(node.next);
            }

            // 把 node 尾插到结果链表中
            last.next = node;
            last = node;
        }

        // 说明 headList.size() == 1
        last.next = headList.get(0);

        return ansHead.next;
    }

    private List<Node> arrayToList(Node[] heads) {
        List<Node> list = new ArrayList<>();

        for (Node head : heads) {
            if (head != null) {
                list.add(head);
            }
        }

        return list;
    }

    public Node 合并两个有序链表(Node h1, Node h2) {
        // 0. 前提是，两个线性表都还有元素
        // 1. 从两个线性表中依次取出元素进行比较（头删）
        // 2. 将小的放入结果线性表中（尾插）

        Node ansHead = new Node(-1);
        Node last = ansHead;

        Node c1 = h1;
        Node c2 = h2;

        while (c1 != null && c2 != null) {
            Node node;
            if (c1.val <= c2.val) {
                node = c1;
                c1 = c1.next;
            } else {
                node = c2;
                c2 = c2.next;
            }

            // node 是被头删出来的结点
            // 接着把 node 尾插到结果链表中
            last.next = node;
            last = node;
        }

        if (c1 != null) {
            last.next = c1;
        } else {
            last.next = c2;
        }

        return ansHead.next;
    }

    public boolean 回文(Node head) {
        int size = size(head);
        int half = size / 2;

        Node node = head;
        for (int i = 0; i < half; i++) {
            node = node.next;
        }

        Node reverseHead = reverse(node);

        Node c1 = head;
        Node c2 = reverseHead;
        while (c1 != null && c2 != null) {
            if (c1.val != c2.val) {
                return false;
            }

            c1 = c1.next;
            c2 = c2.next;
        }

        return true;
    }
}
