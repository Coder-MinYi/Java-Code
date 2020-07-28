/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

import java.util.Scanner;

/**
 * 变态跳台阶问题
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级... .它也可以跳 上n级。
 * 求该青蛙跳上-个n级的台阶总共有多少种跳法。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(func(n));
        }

    }

    private static int func(int n) {
        /**
         * 分析       前提是n个台阶会有一次n阶的跳法。f(n)代表n阶的跳法
         * f(1) = 1;
         * f(2) = f(2-1) + f(2-2)         //f(2-2) 表示2阶一次跳2阶的次数。其他同理
         * f(3) = f(3-1) + f(3-2) + f(3-3)
         * ...
         * f(n) = f(n-1) + f(n-2) + f(n-3) + ... + f(2) + f(1)
         */

        //上述分析可知 f(n -1) = f(n-2) + f(n-3) + ... + f(2) + f(1)
        //故而 f(n) = 2 * f(n -1)

        if (n == 1 ){
            return 1;
        }else {
            return 2 * func(n - 1);
        }
    }
}
