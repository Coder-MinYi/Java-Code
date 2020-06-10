import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main {
    public static int func(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * func(n - 1);
        }
    }

    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            int h = func(n);
            for (int i = h; i > 0; i = h / 10) {
                if (i % 10 == 0) {
                    count++;
                } else
                    break;
            }
            System.out.println(count);
        }
    }
}
