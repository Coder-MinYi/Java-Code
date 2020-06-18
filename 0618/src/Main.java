import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main {
    public static int func3(long a){
        for (int i =1; i < 100000; i++) {
            if (((4*a+3)%1000000007 == 0)||(8*a+7)%1000000007 == 0) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.println(func3(n));
    }
    /**
     * 另类加法
     * @param a
     * @param b
     * @return
     */
    public static int func1(int a,int b){
        int n = 0;
        int m = 0;
        while (b!=0){
            n = a^b;
            m = (a&b) << 1;
            a = n;
            b = m;
        }
        return n;
    }
    public static int func(int a,int b){
        return Math.addExact(a,b);
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(func(a, b));
        System.out.println(func1(a, b));
    }
}
