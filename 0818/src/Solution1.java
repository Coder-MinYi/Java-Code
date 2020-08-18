/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 第一个只出现一次的字母，返回下标
 */
public class Solution1 {
    public int FirstNotRepeatingChar(String str) {
        if (str == null || str.length() == 0) {
            return -1;
        }
        char[] chars = str.toCharArray();
        int cou = -1;
        int i = 0;
        int j = 0;
        for (i = 0; i < str.length(); i++) {
            for (j = 0; j < str.length(); j++) {
                if (chars[i] == chars[j] && i != j) {
                    break;
                }
            }
            if (j == str.length()) {
                cou = i;
                break;
            }
        }
        return cou;
    }
}