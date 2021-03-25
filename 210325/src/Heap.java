/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Heap {
    private static void swap(long[] array, int i, int j) {
        long t = array[i];
        array[i] = array[j];
        array[j] = t;
    }

    public static void adjustDown(long[] array, int size, int index) {
        while (true) {
            int leftIndex = 2 * index + 1;
            int rightIndex = 2 * index + 2;

            if (leftIndex >= size) {
                return;
            }

            int maxIndex = leftIndex;
            if (rightIndex < size && array[rightIndex] > array[leftIndex]) {
                maxIndex = rightIndex;
            }

            if (array[index] >= array[rightIndex]) {
                return;
            }

            swap(array, index, maxIndex);

            index = maxIndex;
        }
    }

    public static void createHeap(long[] array, int size) {
        int lastIndex = size - 1;
        int lastParentIndex = (lastIndex - 1) / 2;

        for (int i = lastParentIndex; i >= 0; i--) {
            adjustDown(array, size, i);
        }
    }
}
