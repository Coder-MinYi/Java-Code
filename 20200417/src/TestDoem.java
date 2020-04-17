import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestDoem {

    //实现两数交换的三种方法
    public static void func1(int m,int n){
        int tmp = m;
        m = n;
        n = tmp;
        System.out.println("a = "+m+" "+"b = "+n);
    }
    public static void func2(int m,int n){
        m = m + n;
        n = m - n;
        m = m - n;
        System.out.println("a = "+m+" "+"b = "+n);
    }
    public static void func3(int m,int n){
        m = m ^ n;
        n = m ^ n;
        m = n ^ m;
        System.out.println("a = "+m+" "+"b = "+n);
    }
    public static void main3(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        System.out.println("a ="+a+" "+"b ="+b);
        func1(a,b);
        func2(a,b);
    }
    //自己实现tostring
    public static void toString(int [] arr){
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length - 1){
                System.out.print(arr[i]+"]");
                break;
            }
            System.out.print(arr[i]+", ");
        }
    }
    //自己实现数组复制
    public static int[] copyOf(int[] arr){
        int[] arr1 = new int [arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }
    //二分查找一个有序数组
    public static  int find(int[] arr,int key){
        int left = 0;
        int right = arr.length - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if (key < arr[mid]){
                right = mid - 1;
            }
            if(key > arr[mid]){
                left = mid + 1;
            }
            if(key == arr[mid]){
                return mid;
            }
        }
       return -1;
    }
    public static void main2(String[] args) {
        int [] array = {1,2,3,4,5,6,7,9,10,15};
        System.out.println("该数下标为"+find(array,15));
        System.out.println(Arrays.toString(copyOf(array)));
        toString(array);
    }
    //判断数组是否是递增数列
    public static boolean func(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i + 1] < arr[i]){
               return false;
            }
        }
        return true;
    }
    //冒泡排序实现数组升序排列
    public static int[] isUp(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            boolean flg = true;
            for (int j = 0; j < arr.length - 1- i; j++) {
                if(arr[j] > arr[j + 1]){
                    int tmp = arr[j +1];
                    arr[j + 1] = arr[j];
                    arr[j] = tmp;
                    flg = false;
                }
            }
            if(flg == true){
                break;
            }
        }
        return arr;
    }
    public static void main1(String[] args) {

        int[] array = {25, 5, 48, 6, 1, 99, 24};
        System.out.println(func(array));
        System.out.println(Arrays.toString(isUp(array)));

    }
}
