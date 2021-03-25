/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Solution {
    public static void adjustDown(int[] array, int size ,int index){
        while (true){
            int leftIndex = 2 * index + 1;
            int rightIndex = 2 * index + 2;

            if (leftIndex >= size){
                return;
            }

            int maxIndex = leftIndex;

            if (rightIndex < size && array[rightIndex] > array[leftIndex]){
                maxIndex = rightIndex;
            }

            if (array[index] >= array[rightIndex]) {
                return;
            }

            swap(array, index , maxIndex);

            index = maxIndex;
        }
    }

    private static void swap(int[] array, int index, int maxIndex) {
        int n = index;
        index = maxIndex;
        maxIndex = n;
    }
}
