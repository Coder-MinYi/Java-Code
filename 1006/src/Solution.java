import java.util.Stack;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 括号匹配
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] ch = s.toCharArray();
        if (ch.length == 0){
            return true;
        }
        if (ch.length % 2 != 0){
            return false;
        }
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == '(' || ch[i] == '{' || ch[i] == '['){
                stack.push(ch[i]);
            }else {
                if (stack.isEmpty()){
                    return false;
                }
                if (ch[i] == ')' && stack.peek() != '('){
                    return false;
                }
                if (ch[i] == '}' && stack.peek() != '{'){
                    return false;
                }
                if (ch[i] == ']' && stack.peek() != '['){
                    return false;
                }
                stack.pop();
            }
        }
        if (stack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}
