/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 *替换空格
 * 将一个字符串中的每个空格替换成“%20”
 */
public class Soultion {
    public static void main(String[] args) {

    }
    public static String replaceSpace(StringBuffer str) {
        String s = str.toString();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)==' '){
                sb.append('%');
                sb.append('2');
                sb.append('0');
            }else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
