import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 骆驼命名法
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            char[]  ch = sc.nextLine().toCharArray();

            for (int i = 0; i < ch.length-1; i++) {
                if (ch[i] == '_'){
                    ch[i+ 1] = Character.toUpperCase(ch[i + 1]);
                }
            }
            String str = String.valueOf(ch);
           // System.out.println(str.toCharArray());
            String[] strs = str.split("_");
           StringBuffer sb = new StringBuffer();
            for (int i = 0; i < strs.length; i++) {
                sb.append(strs[i]);
            }
            System.out.println(sb.toString());

        }
    }
}
