import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
//数字颠倒
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int m = sc.nextInt();
            System.out.println(func(m));
        }
    }

    private static String func(int m) {
        String str = String.valueOf(m);
        StringBuilder sb = new StringBuilder(str);
        //StringBuilder sb1 = sb.reverse();
        return sb.reverse().toString();
    }
}
