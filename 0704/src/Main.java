import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 守形数
 * 守形数是这样一种整数，它的平方的低位部分等于它本身。 比如25的平方是625，
 * 低位部分是25，因此25是一个守形数。 编一个程序，判断N是否为守形数。
 */
public class Main {
    public static String func(int n){
        int m = (int) Math.pow(n,2);
        if (m % 10 == n || m % 100 == n || m % 1000 ==n){
            return "YES!";
        }

        return "NO!";
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(func(n));
        }
    }
}
