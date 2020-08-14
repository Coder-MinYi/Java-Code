/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.util.Stack;

/**
 * 两个栈实现一个队列
 */
public class Main {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
//        while (!stack1.isEmpty()){
//            stack2.push(stack1.pop());
//        }
    }

    public int pop() {
        if (!stack1.isEmpty() && !stack2.isEmpty()){
            return -1;
        }else if (!stack2.isEmpty()){
            return stack2.pop();
        }else {
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
