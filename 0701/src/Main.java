import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 数字之和：给定正正数n,计算输出十进制n各个位置数字之和
 * 以及n平方个位置之和
 *
 */

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            int m = (int) Math.pow(n,2);

            String n1 = String.valueOf(n);
            String m1 = String.valueOf(m);

            char[] ch1 = n1.toCharArray();
            char[] ch2 = m1.toCharArray();

            int sum1 = 0;
            int sum2 = 0;
            for (int i = 0; i < ch1.length; i++) {
                sum1 += Integer.parseInt(String.valueOf(ch1[i]));
            }
            for (int i = 0; i < ch2.length; i++) {
                sum2 += Integer.parseInt(String.valueOf(ch2[i]));
            }


            System.out.println(sum1 +" "+ sum2);
        }
    }
}
