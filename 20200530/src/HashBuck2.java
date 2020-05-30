import com.sun.deploy.association.Action;

import java.util.Objects;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class Person{
    public int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}



public class HashBuck2<K,V> {


    static class Node<K,V>{
        public K key;
        public V val;
        public Node<K,V> next;

        public Node(K key, V val) {
            this.key = key;
            this.val = val;
        }
    }

    public Node<K,V>[] array = (Node<K,V>[]) new Node[10];
    public int usedSize;

    public void put(K key,V val) {
        int hash = key.hashCode();
        int index = hash % array.length;

        for (Node cur = array[index]; cur != null; cur = cur.next) {
            if (cur.key.equals(key)){
                cur.val = val;
                return;
            }
        }
        Node<K,V> node = new Node<>(key, val);
        node.next = array[index];
        array[index] = node;
        this.usedSize++;
        if(loadFactor() > 0.75) {
            resize();
        }
    }

    public void resize() {
        HashBuck2.Node<K,V>[] newArray = new HashBuck2.Node[2*this.array.length];
        for (int i = 0; i < array.length; i++) {
            HashBuck2.Node<K,V> cur = array[i];
            while (cur != null) {
                HashBuck2.Node<K,V> curNext = cur.next;
                int hash = cur.key.hashCode();
                int index = hash % array.length;
                cur.next = newArray[index];
                newArray[index] = cur;
                cur = curNext;
            }
        }
        array = newArray;
    }
    public double loadFactor(){
        return this.usedSize*1.0 / this.array.length;
    }
    public V get(K key){
        //找位置
        int hash = key.hashCode();
        int index = hash % array.length;
        Node<K,V> cur = array[index];
        //遍历单链表
        while (cur != null){
            if (cur.key.equals(key)){
                return  cur.val;
            }
            cur = cur.next;
        }
        return null;
    }
    public static void main(String[] args) {

    }
}
