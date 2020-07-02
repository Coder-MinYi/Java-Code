import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 找x
 *
 */
public class Main {
    public static int func(int[] m,int tmp){
        for (int i = 0; i < m.length; i++) {
            if (m[i] == tmp){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] m = new int[n];
            for (int i = 0; i < n; i++) {
                m[i] = sc.nextInt();
            }
            int tmp = sc.nextInt();

            System.out.println(func(m, tmp));
        }
    }
}
