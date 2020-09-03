import java.util.Stack;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 括号序列
 */
public class Solution  {
    public boolean isValid (String s) {
    Stack<Character> sk = new Stack();

        for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
            sk.push(s.charAt(i));

        }
        else{
            if(sk.isEmpty()) {
                return false;
            }
            if(s.charAt(i)==')'&&(char)sk.peek()!='(') {
                return false;
            } else if(s.charAt(i)==']'&&(char)sk.peek()!='[') {
                return false;
            } else if(s.charAt(i)=='}'&&(char)sk.peek()!='{') {
                return false;
            }
            sk.pop();
        }

    }

        if(sk.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
