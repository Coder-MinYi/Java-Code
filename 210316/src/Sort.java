import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Sort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()){
            int m = sc.nextInt();
            int[] array = new int[m];
            for (int i = 0; i < m; i++) {
                array[i] = sc.nextInt();
            }
            bubblesort(array);

        }
    }
    //冒泡排序
    public static void bubblesort(int[] array) {
        //进行多少次冒泡
        for (int i = 0; i < array.length - 1; i++) {
            //无序区间[0,array.lenght-i)
            //一次冒泡只在无序区间进行

            //每次冒泡前，都假设无序区间有序
            boolean x = true;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int m = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = m;

                    //有交换，无序区间有序假设不成立
                    x = false;
                }
            }
            //每次冒泡之后假设成立，数组有序
            if (x){
                break;
            }
        }
        System.out.println(Arrays.toString(array));
    }
    //插入排序
    public static void insertSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int key = array[i];

            int j ;
            for (j = i; j >= 0 && array[j] > key; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = key;
        }
    }
    //快速排序

    public static void quickSort(int[] array){
        
    }
}
