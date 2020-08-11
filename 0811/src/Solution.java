import java.util.Stack;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 最后一个单词的长度
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        int end = s.length() - 1;
        while(end >= 0 && s.charAt(end) == ' ') {
            end--;
            if (end < 0) return 0;
        }
        int start = end;
        while(start >= 0 && s.charAt(start) != ' ') {
            start--;
        }
        return end - start;
    }
    public int lengthOfLastWord1(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }

        String[] str = s.split(" ");
        int len = str.length;
        if (len == 0) {
            return 0;
        }
        return str[len - 1].length();
    }
}
