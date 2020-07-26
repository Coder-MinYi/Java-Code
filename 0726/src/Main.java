import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 左右最大值
 *
 * 思路：找到最大值  只需要与首尾比较 取最大的就行了，
 * 因为不管怎么划分 只能在首尾是较小值时才能取到最大值，
 * 如：{1,58,55,44,8,89,88,99,2}和{88,1,2,99,100}这样能看出来，
 * 不管怎么取都是对最大值与首尾进行计算。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while (sc.hasNext()){
            int[] arr = {2,7,3,1,1};
            int n = 5;
            System.out.println(findMaxGap(arr, n));
        }
    }
    public static int findMaxGap(int[] A, int n) {
        // write code here
        int max = A[0];
        int min = 0;

        //找到最大值
        for (int i = 0; i < n; i++) {
            if (A[i] > max){
                max = A[i];
            }
        }
        //因为不管怎么划分 只能在首尾是较小值时才能取到最大值，
        // 不管怎么取都是对最大值与首尾进行计算。
        min = A[0] > A[n -1] ? A[n -1] : A[0];
        return max - min;
    }
}
