/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.util.Scanner;
/**
 * 守形数
 * 守形数是这样一种整数，它的平方的低位部分等于它本身。 比如25的平方是625，
 * 低位部分是25，因此25是一个守形数。 编一个程序，判断N是否为守形数。
 */

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            //endsWith(String suffix)
            //测试此字符串是否以指定的后缀结尾。
            if (String.valueOf(n * n).endsWith( String.valueOf(n)))
                System.out.println("Yes!");
            else
                System.out.println("No!");
        }
    }
}
