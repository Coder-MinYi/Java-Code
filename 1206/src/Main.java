import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
/*
跟奥巴马一起编程(15)
输入在一行中给出正方形边长N（3<=N<=20）和组成正方形边的某种字符C，间隔一个空格。
输出描述:

输出由给定字符C画出的正方形。但是注意到行间距比列间距大，所以为了让结果看上去更像正方形，
我们输出的行数实际上是列数的50%
（四舍五入取整）。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            char  c = sc.next().charAt(0);

            func(n , c);
        }
    }

    private static void func(int n, char c) {

        int l = (n + 1) / 2;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == l - 1 || j == 0 || j == n - 1){
                    System.out.print(c);
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
