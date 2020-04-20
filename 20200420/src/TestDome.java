import java.util.Arrays;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * 单链表的使用
 * User:MINYI
 * Date:
 * Time:
 */
public class TestDome {
    public static void main(String[] args) {
        MyLinkedList c = new MyLinkedList();
        //c.addFrist(5);
        c.addFrist(6);
        c.addFrist(7);
        //c.disPlay();
        c.addList(8);
        c.disPlay();
        System.out.println(c.contains(5));
        System.out.println(c.size());
        c.addIndex(2,3);
        c.disPlay();
    }





    public static void func1(int[] arr1, int[] arr2){
        for (int i = 0; i < arr1.length; i++) {
            int tmp = arr1[i];
            arr1[i] = arr2[i];
            arr2[i] =tmp;
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
    public static int[] func(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j > i; j--) {
                if (arr[j] % 2 == 0 && arr[j-1] % 2 == 1){
                    int tmp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = tmp;
                }
            }
        }
        return arr;
    }

    public static void main1(String[] args) {
        int [] array1 = {1,2,3,4,5,6,7,8};
        int [] array2 = {100,99,98,97,96,95,94,93};
        System.out.println(Arrays.toString(func(array1)));
        func1(array1,array2);
    }

}
