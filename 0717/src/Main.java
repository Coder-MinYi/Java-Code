
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 删除公共字符串
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str = sc.nextLine();
            String str1 = sc.nextLine();
            func(str, str1);
        }
    }

    private static void func(String str, String str1) {
        char[] ch = str.toCharArray();
       // char[] ch1 = str1.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (!str1.contains(String.valueOf(ch[i]))){
                    System.out.print(ch[i]);
                }
        }
    }
}
