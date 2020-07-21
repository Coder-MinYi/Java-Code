import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 单调栈结构
 */
public class Mian1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
/**
 * 最原始的暴力解法
 */
            int[][] res = new int[n][2];

            for (int i = 0; i < arr.length; i++) {
                int left = -1;
                int right = -1;
                int cur = i - 1;
                while (cur >= 0) {
                    if (arr[cur] < arr[i]) {
                        left = cur;
                        break;
                    }
                    cur--;
                }
                cur = i + 1;
                while (cur < arr.length) {
                    if (arr[cur] < arr[i]) {
                        right = cur;
                        break;
                    }
                    cur++;
                }
                res[i][0] = left;
                res[i][1] = right;
            }
            for (int i = 0; i < n; i++) {
                System.out.println(res[i][0] +" "+res[i][1]);
            }
        }
    }
}
