import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main1 {
    public static void func(int n){
        int m = n*n - n + 1;
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            if (i == n - 1) {
                sb.append(m);
            }else {
                sb.append(m+"+");
            }
            m += 2;
        }
        System.out.println(sb);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            func(n);
        }
    }
}
