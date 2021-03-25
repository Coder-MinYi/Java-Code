import java.util.NoSuchElementException;

public class MyPriorityQueue {
    private String[] array = new String[100];
    private int size;

    void add(String e) {
        array[size++] = e;

        shiftUp(array, size, size - 1);
    }

    private void shiftUp(String[] array, int size, int i) {
        // TODO
    }

    String remove() {
        if (size <= 0) {
            throw new NoSuchElementException();
        }

        String e = array[0];
        array[0] = array[size - 1];
        size--;
        shiftDown(array, size, 0);

        return e;
    }

    private void shiftDown(String[] array, int size, int i) {
        // TODO
    }

    String element() {
        if (size <= 0) {
            throw new NoSuchElementException();
        }

        return array[0];
    }
}
