import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            long m = sc.nextLong();
            long n = sc.nextLong();
            System.out.println(func(m, n));
        }
    }

    private static long func(long m, long n) {
        long count = 1;
        long tmp = 1;
        for (int i = 0; i < n; i++) {
            count *= (m - i);
        }
        for (int i = 1; i <= n; i++) {
            tmp *= i;
        }
        return count/tmp;
    }
}
