import java.util.Arrays;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestDemo {

    public static void adjustDown(int[] array,int root,int len) {
        int parent = root;
        int child = 2*parent+1;
        while (child < len) {
            //最起码有左孩子
            if(child+1 < len && array[child] < array[child+1]) {
                child++;
            }
            if(array[child] > array[parent]) {
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
                parent = child;
                child = 2*parent+1;
            }else {
                break;
            }
        }
    }

    public static void createHeap(int[] array) {
        for (int i = (array.length-1-1)/2; i>= 0 ; i--) {
            adjustDown(array,i,array.length);
        }
    }

    /**堆排序
     * 时间复杂度：O(nlogn)   不管有序还是无序都是
     * 空间复杂度：O(1)
     * 稳定性：不稳定
     * @param array
     */
    public static void heapSort(int[] array) {
        createHeap(array);
        int end = array.length-1;
        while (end > 0) {
            int tmp = array[0];
            array[0] = array[end];
            array[end] = tmp;
            adjustDown(array,0,end);
            end--;
        }
    }

    /**冒泡排序
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     * 稳定性：稳定的排序
     * @param array
     */
    public static void bubbleSort(int[] array) {
        //i  表示趟数
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
    }
    //冒泡排序优化算法
    public static void bubbleSort1(int[] array) {
        boolean flg = false;
        //i  表示趟数
        for (int i = 0; i < array.length-1; i++) {
            flg = false;
            for (int j = 0; j < array.length-1-i; j++) {
                if(array[j] > array[j+1]) {
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    flg = true;
                }
            }
            if(flg == false) {
                return;
            }
        }
    }

    /**选择排序
     * 时间复杂度：O（n^2）
     * 空间复杂度：
     *
     * @param array
     */
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }



    /**希尔排序
     *稳定性：不稳定的排序
     * @param array
     * @param gap
     */

    public static void shell(int[] array,int gap) {
        for (int i = gap; i < array.length; i++) {
            int tmp = array[i];
            int j;
            for (j = i - gap; j >= 0 ; j -= gap) {
                if (array[j] > tmp) {
                    array[j + gap] = array[j];
                } else {
                    //array[j + 1] = tmp;
                    break;
                }
            }
            array[j + gap] = tmp;
        }
    }

    public static  void  shellSort(int[] array) {

        int[] drr = {5,3,1};
        for (int i = 0; i < drr.length; i++) {
            shell(array,drr[i]);
        }

    }

    /**
     * 时间复杂度：
     *   最坏情况是：O(n^2)   最好情况(有序的情况)：O(n)
     *   非常重要的5个字：越有序越快。
     * 空间复杂度：O(1)
     * 稳定性：稳定的排序
     * @param array
     */
    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int tmp = array[i];
            int j;
            for (j = i - 1; j >= 0 ; j--) {
                 if (array[j] > tmp) {
                     array[j + 1] = array[j];
                 } else {
                     //array[j + 1] = tmp;
                     break;
                 }
             }
            array[j + 1] = tmp;
        }
    }



    public static void main(String[] args) {
        int[] array = {4,12,5,10,3};
        int[] array1 = {12,5,9,34,6,8,45,98,2,66,33,89,54,31,44,90};
        //insertSort(array);
        System.out.println(Arrays.toString(array));
        shellSort(array1);
        System.out.println(Arrays.toString(array1));
        selectSort(array);
        System.out.println(Arrays.toString(array));

    }
}
