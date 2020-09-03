import java.util.Stack;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main {
    public class Solution {
        /**
         * 反转字符串
         * @param str string字符串
         * @return string字符串
         */
        public String solve (String str) {
            // write code here
            Stack<Character> stack = new Stack<>();
            StringBuffer sb = new StringBuffer();
            char[] chars = str.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                stack.push(chars[i]);
            }
            while (!stack.isEmpty()){
                sb.append(stack.pop());
            }
            return sb.toString();
        }
        public String solve1 (String str) {
            if (str == null && str.length() == 1){
                return str;
            }
            char[] chars = str.toCharArray();
            int left = 0;
            int right = chars.length - 1;
            while (left < right){
                char tmp= chars[left];
                chars[left] = chars[right];
                chars[right] = tmp;
                left++;
                right--;
            }
            return String.valueOf(chars);
        }
    }
}
