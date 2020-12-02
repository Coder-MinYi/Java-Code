import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
/*
 输入一个正整数n,求n!(即阶乘)末尾有多少个0？ 比如: n = 10; n! = 3628800,所以答案为2

 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(func1(n));
            System.out.println(func2(n));
        }
    }

    private static int func2(long m) {
        int count = 0;
        while (m != 0){
            count += m / 5;
            m /= 5;
        }
        return count;
    }

    private static long func1(int n) {
        if (n ==1){
            return 1;
        }else {
            return n * func1(n - 1);
        }
    }
}
