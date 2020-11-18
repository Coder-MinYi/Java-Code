package util;

public class MyLinkedList {
    private Node head;
    private Node last;
    private int size;

    // O(1)
    public boolean add(String e) {
        // 把元素装到结点对象中
        Node node = new Node(e);
        // 区分链表是否为空的情况
        if (head == null) {
            // 链表为空
            head = last = node;
        } else {
            // 链表不为空
            node.prev = last;
            last.next = node;
            last = node;
        }

        size++;
        return true;
    }

    public void add(int index, String e) {
        if (index < 0 || index > size()) {
            throw new IndexOutOfBoundsException("下标越界: " + index);
        }

        Node node = new Node(e);

        if (head == null) {
            // index 一定是 0
            head = last = node;
        } else if (index == 0) {
            node.next = head;
            head.prev = node;
            head = node;
        } else if (index == size()) {
            node.prev = last;
            last.next = node;
            last = node;
        } else {
            Node prev = getPreviousByIndex(index);

            Node next = prev.next;
            // prev -> next
            // prev -> node -> next
            node.prev = prev;
            node.next = next;
            prev.next = node;
            next.prev = node;
        }

        size++;
    }

    private Node getPreviousByIndex(int index) {
        Node prev = head;
        for (int i = 0; i < index - 1; i++) {
            prev = prev.next;
        }
        return prev;
    }

    public String remove(int index) {
        checkIndex(index);

        String v = null;
        if (size() == 1) {
            v = head.val;
            head = last = null;
        } else if (index == 0) {
            v = head.val;
            head = head.next;
            head.prev = null;
        } else if (index == size() - 1) {
            v = last.val;
            last = last.prev;
            last.next = null;
        } else {
            Node prev = getPreviousByIndex(index);
            Node node = prev.next;
            Node next = node.next;

            prev.next = next;
            next.prev = prev;

            v = node.val;
        }
        size--;
        return v;
    }

    public boolean remove(String e) {
        Node current = head;
        while (current != null) {
            if (current.val.equals(e)) {
                Node prev = current.prev;
                Node next = current.next;

                if (prev != null) {
                    prev.next = next;
                } else {
                    head = head.next;
                }
                if (next != null) {
                    next.prev = prev;
                } else {
                    last = last.prev;
                }

                size--;

                return true;
            }
            current = current.next;
        }

        return false;
    }

    public int size() {
        return size;
    }

    public String get(int index) {
        checkIndex(index);

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        return node.val;
    }

    public String set(int index, String e) {
        checkIndex(index);

        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }

        String oldVal = node.val;
        node.val = e;
        return oldVal;
    }

    public boolean contains(String e) {
        return indexOf(e) != -1;
    }

    public int indexOf(String e) {
        Node node = head;
        for (int i = 0; i < size(); i++) {
            if (node.val.equals(e)) {
                return i;
            }
            node = node.next;
        }

        return -1;
    }

    public int lastIndexOf(String e) {
        Node node = last;
        for (int i = size() - 1; i >= 0; i--) {
            if (node.val.equals(e)) {
                return i;
            }
            node = node.prev;
        }

        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size()) {
            throw new IndexOutOfBoundsException("下标越界: " + index);
        }
    }
}
