import java.util.Stack;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main {
    public static void main(String[] args) {

    }
    //栈的弹出压入序列
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

    //棒球比赛
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        for (String op:ops) {
            if (op.equals("+")){
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
            }
            else if (op.equals("D")){
                stack.push(2 * stack.peek());
            }
            else if (op.equals("C")){
                stack.pop();
            }else {
                stack.push(Integer.valueOf(op));
            }
        }
        int num = 0;
        for (int sorce: stack) {
            num += sorce;
        }
        return  num;
    }

    // 比较推格的字符串
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '#' && !stack1.isEmpty()){
                stack1.pop();
            }else if(S.charAt(i) != '#' ){
                stack1.push(S.charAt(i));
            }
        }
        for (int i = 0; i < T.length(); i++) {
            if (T.charAt(i) == '#' && !stack2.isEmpty()){
                stack2.pop();
            }else if(T.charAt(i) != '#' ){
                stack2.push(T.charAt(i));
            }
        }
        if (stack1.size() != stack2.size()){
            return false;
        }
        while (!stack1.empty()){
            if (stack1.pop() != stack2.pop()){
                return  false;
            }
        }
        return  true;
    }

}
