import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 *
 * 有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶、3阶。
 * 请实现一个方法，计算小孩有多少种上楼的方式。为了防止溢出，请将结果Mod 1000000007
 *
 * 给定一个正整数int n，请返回一个数，代表上楼的方式数。保证n小于等于100000。
 */

/**
 * 递归实现，n越大，时间复杂度越高，
 * 无法在时间内计算出
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();

           // System.out.println(func(n));
            System.out.println(countWays(n));
        }
    }

    private static int func(int n) {
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        if (n == 3){
            return 4;
        }
        return func(n -1) + func(n - 2) + func(n - 3);
    }

    /**
     * 迭代算法 动态规划
     * @param n
     * @return
     */
    public static int countWays(int n) {
        if (n < 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        if (n == 2){
            return 2;
        }
        if (n == 3){
            return 4;
        }
        int[] A = {1,2,4};
        for (int i = 4; i <= n; i++) {
            int tmp = ((A[0] + A[1])%1000000007 + A[2])%1000000007;
            A[0] = A[1];
            A[1] = A[2];
            A[2] = tmp;
        }
        return A[2];
    }
}
