import java.util.Arrays;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestDemo {
    public static void Func1(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            boolean flag = false;
            for (int j = 0; j < (arr.length - 1 - i); j++) {
                if (arr[j] > arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                      flag = true;
                }
            }
            if(flag == false){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {1977,2111,30,34,50,287};
        Func1(array);
        System.out.println(Arrays.toString(array));
    }
    public static boolean isUp(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
           if(arr[i+1] < arr[i]){
               return false;
           }
        }
        return true;
    }
    public static void main5(String[] args) {
        int[] array = {1,2,3,4,6,5};
        System.out.print(isUp(array));
    }
    //有序数组，二分查找
    public static int binarySearch(int[] array,int key) {
        int l = 0;
        int r = array.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;//int mid = (l + r)>>>1
            if (key < array[mid]) {
                r = mid - 1;
            }
            if (key > array[mid]) {
                l = mid + 1;
            }
            if (key == array[mid]) {
                return mid;
            }
        }
        return -1;
    }
    public static int Max(int[] arr){
        int tmp = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > tmp){
                tmp = arr[i];
            }
        }
        return tmp;
    }
    public static void main4(String[] args) {
        int[] array = {1, 2, 3, 4};
        System.out.println(Max(array));
        System.out.println(binarySearch(array,3));
    }
    /**
     * 数组的拷贝
     * for
     *Arrays.copyOf
     *System.arraycopy
     *clone()
     * 以上本质来说都是浅拷贝
     *
     * @param args
     */
    public static void main3(String[] args) {
        int[] array = {1,2,3,4};
        //int [] arr = Arrays.copyOf(array,array.length);
        //System.out.println(Arrays.toString(arr));
        int[] arr = new int[array.length];
        System.arraycopy(array,0,arr,0,array.length);
        System.out.println(Arrays.toString(arr));
        int[] ret = array.clone();
        System.out.println(Arrays.toString(ret));
    }
    public static int[] copyArray(int [] array){
        int [] arr = new int [array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }
        return arr;
    }
    public static void main2(String[] args) {
        int[] array = {1,2,3,4};
        System.out.println(Arrays.toString(copyArray(array)));
    }
    public static int[] Func(int[] arr){
        for (int i = 0; i < arr.length; i++) {
                arr[i] = i + 1;
            }
        return arr;
    }

    public static void PrintArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int[] TransForm(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
        return arr;
    }
    public static double Avg(int [] arr){
        double m = Sum(arr) / arr.length;
        return m;
    }
    public static int Sum(int [] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main1(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        int [] array1 = new int[100];
        System.out.println(Arrays.toString(Func(array1)));
        System.out.println(Sum(array));
        System.out.println(Avg(array));
        PrintArray(array);
        System.out.println();
        System.out.println(Arrays.toString(TransForm(array)));
    }
}
