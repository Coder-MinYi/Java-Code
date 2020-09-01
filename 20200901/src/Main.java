import java.util.Arrays;
import java.util.Stack;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(' || chars[i] == '[' && chars[i] == '{'){
                stack.push(chars[i]);
            } else {
                if (stack.empty()) {
                    return false;
                }
                //char topChar = stack.pop();
               if (chars[i] != stack.peek()){
                   return false;
               }
            }
            stack.pop();
        }

        return stack.isEmpty();
    }
}
