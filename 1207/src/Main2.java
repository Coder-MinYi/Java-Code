import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
/*
验证尼科彻斯定理，即：任何一个整数m的立方都可以写成m个连续奇数之和。
例如：
1^3=1
2^3=3+5
3^3=7+9+11
4^3=13+15+17+19
输入一个正整数m（m≤100），将m的立方写成m个连续奇数之和的形式输出。
 */
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int m = sc.nextInt();
            System.out.println(func(m));
        }
    }
//规律很简单，n的立方必定展开n项连续奇数相加
//假设x为第一个奇数，则m的三次方=x+0+x+2+x+4+...x+(m-1)*2=mx+2*0+2*1+2*2+...+2*(m-1)=mx+m(m-1)=mm+mx-m  所以x=mm+1-m；
// 由m个连续奇数组成，这包含了两个关键信息，足够推出第一个奇数的值了。
    private static String func(int m) {
        StringBuilder sb = new StringBuilder();
        int curNum = (int)Math.pow(m,2) - m + 1;
        for (int i = 0; i < m; i++) {
            if (i == m - 1){
                sb.append(curNum);
            }else {
                sb.append(curNum + "+");
            }
            curNum += 2;
        }
        return sb.toString();
    }
}
