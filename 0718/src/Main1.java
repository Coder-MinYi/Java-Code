import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:07.18
 * Time:20:32
 */

/**
 *
 * [编程题]连续最大和
 *
 * 一个数组有 N 个元素，求连续子数组的最大和。
 * 例如：[-1,2,1]，和最大的连续子数组为[2,1]，其和为 3
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] srr = new int[n];
            for (int i = 0; i < n; i++) {
                srr[i] = sc.nextInt();
            }

            int max = srr[0];
            int sum = 0;

            for (int i = 0; i < n; i++) {
                if (sum >= 0){
                    sum += srr[i];
                }else {
                    sum = srr[i];
                }
                if (sum > max){
                    max = sum;
                }
            }
            System.out.println(max);
        }
    }
}
