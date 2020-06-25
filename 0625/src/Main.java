import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 兔子数量问题，实质斐波那契数列
 */
public class Main {
    public static int getNumber(int n){
        if (n == 1 || n == 2){
            return 1;
        }else {
            return getNumber(n-1)+getNumber(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int month = sc.nextInt();
            System.out.println(getNumber(month));
        }
    }
}
