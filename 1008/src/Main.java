/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.util.ArrayList;
import java.util.Stack;

/**
 * 栈的压入顺序和弹出顺序
 */
public class Main {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        if (pushA.length == 0 || popA.length == 0 || pushA.length != popA.length){
            return false;
        }
        Stack<Integer> s1 = new Stack<>();
        int j = 0;
        for (int i = 0; i < pushA.length; i++) {
            s1.push(pushA[i]);
            while(!s1.empty() && s1.peek() == popA[j]){
                s1.pop();
                j++;
            }
        }
        return s1.empty();
    }
}