import java.util.*;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 旧键盘上坏了几个键，于是在敲一段文字的时候，对应的字符就不会出现。
 * 现在给出应该输入的一段文字、以及应该输入的一段文字，请你列出
 * 肯定坏掉的那些键。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str1 = sc.next();//应该输入的一段文字
            String str2 = sc.next();//实际输入的一段文字

            HashSet<Character> setstr2 = new HashSet<>();
            for (char c : str2.toUpperCase().toCharArray()) {
                setstr2.add(c);
            }

            HashSet<Character> setb = new HashSet<>();

            for (char t:str1.toUpperCase().toCharArray()) {
                if (!setstr2.contains(t) && !setb.contains(t)){
                    System.out.print(t);
                    setb.add(t);
                }
            }
        }
    }
}
