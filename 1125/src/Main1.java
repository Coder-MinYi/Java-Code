/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main1 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str = "he" + new String("llo");
        System.out.println(str == str1);
        System.out.println(str.equals(str1));
    }
}
