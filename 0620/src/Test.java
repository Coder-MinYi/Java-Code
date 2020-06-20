/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 百万富翁问题
 */
public class Test {
    public static int func(int n){
        if (n == 1){
            return 1;
        }else {
            return  func(n -1)*2;
        }
    }
    public static void main(String[] args) {
        int a = 30;
        int n = (int) (Math.pow(2,30) -1);
        System.out.println(a*10+" "+n);
    }
}
