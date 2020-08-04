import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            System.out.println(Fibonacci(n));
            System.out.println(Fibonacci1(n));
        }
    }
    //递归写法
    public static int Fibonacci(int n) {

        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        return Fibonacci (n - 1)+Fibonacci(n - 2);
    }
    //循环实现
    public static int  Fibonacci1(int n){
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int f1=0; //第一数
        int f2=1; //第二数
        int c=0;  //返回结果数

        //这个循环只要i>=3就会执行
        for (int j = 2;j <= n; j++) {
            c=f1+f2;
            f1=f2;
            f2=c;
        }
        return c;
    }
}
