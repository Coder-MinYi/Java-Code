import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int m = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(func2(m , n ,func1(m , n)));
        }
    }

    private static int  func2(int m, int n, int b) {
        return (m * n) / b;
    }

    private static int func1(int m, int n) {
        int a = 0;
        while (n != 0){
            a = m % n;
            m = n;
            n = a;
        }
        return m;
    }
}
