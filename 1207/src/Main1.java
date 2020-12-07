import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
/*
组个最小数 (20)
给定数字0-9各若干个。你可以以任意顺序排列这些数字，但必须全部使用。
目标是使得最后得到的数尽可能小（注意0不能做首位）。例如：
给定两个0，两个1，三个5，一个8，我们得到的最小的数就是10015558。
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int[] m = new int[10];
            for (int i = 0; i < 10; i++) {
                m[i] = sc.nextInt();
            }
            System.out.println(func(m));
        }
    }

    private static String func(int[] m) {
        StringBuilder sb = new StringBuilder();
        int i = 1;
        for (; i < m.length; i++) {
            while (m[i] != 0) {
                sb.append(i);
                m[i] -= 1;
            }
        }
        for (int j = 0; j < m[0]; j++) {
            sb.insert(1,"0");
        }
        return sb.toString();
    }
}
