/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 百万富翁问题
 */
public class Main {
    public static void main(String[] args) {
        final int n = 30;

        System.out.print(10 * n + " " + func(n));
    }

    private static int func(int n) {
        int tmp = 1;
        int num = 0;
        for (int i = 0; i < n; i++) {
            num = num + tmp;
            tmp *= 2;
        }
        return num;
    }
}
