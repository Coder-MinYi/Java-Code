import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
/*
Fibonacci数列
Fibonacci数列是这样定义的：
F[0] = 0
F[1] = 1
for each i ≥ 2: F[i] = F[i-1] + F[i-2]
因此，Fibonacci数列就形如：0, 1, 1, 2, 3, 5, 8, 13, ...，
在Fibonacci数列中的数我们称为Fibonacci数。给你一个N，你想让其变为一个Fibonacci数，
每一步你可以把当前数字X变为X-1或者X+1，现在给你一个数N求最少需要多少步可以变为Fibonacci数。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while (sc.hasNext()){
            int N = sc.nextInt();
            System.out.println(func(N));
          //  System.out.println(fibo(8));

        }
    }

    private static int func(int N) {
        int flag1 = 0;
        int flag2 = 0;
        int i = 0;
        for(;;i++) {//寻找输入值N处于哪两个fibo数之间
            flag2 = fibo(i);
            if (flag2 > N) {
                break;
            } else {
                flag1 = flag2;
            }
        }
        return (flag2 - N) > (N - flag1) ? N -flag1 : flag2 - N;
    }

    private static int fibo(int i) {
        if (i == 0 || i == 1){
            return i;
        }else {
            return fibo(i - 1) + fibo(i - 2);
        }
    }
}
