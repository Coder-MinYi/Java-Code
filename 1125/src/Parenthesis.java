/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.util.*;
/*
合法序列括号判断
 */
public class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
       if (n % 2 != 0){
           return false;
       }
       Stack<Character> stack = new Stack<>();
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) == '('){
                stack.push(A.charAt(i));
            }else if (A.charAt(i) == ')'){
                if (stack.isEmpty()){
                    return false;
                }else {
                    stack.pop();
                }
            }else {
                return false;
            }
        }
        if (!stack.isEmpty()){
            return false;
        }else {
            return true;
        }
    }
}
