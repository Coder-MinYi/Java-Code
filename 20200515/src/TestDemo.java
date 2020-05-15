import java.util.Stack;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。（注意：这两个序列的长度是相等的）
 */
class Solution3 {
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
        //for (int j = 0; j < popA.length; j++) {
        //    if (s1.peek() != popA[j]){
        //        break;
        //    }else {
        //        s1.pop();
        //    }
        //}
        return s1.empty();
    }
}


/**
 *给定 S 和 T 两个字符串，当它们分别被输入到空白的文本编辑器后，判断二者是否相等，并返回结果。 # 代表退格字符。
 *注意：如果对空文本输入退格字符，文本继续为空。
 */
class Solution1 {
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
/**
 * 给定一个字符串列表，每个字符串可以是以下四种类型之一：
 * 1.整数（一轮的得分）：直接表示您在本轮中获得的积分数。
 * 2. "+"（一轮的得分）：表示本轮获得的得分是前两轮有效 回合得分的总和。
 * 3. "D"（一轮的得分）：表示本轮获得的得分是前一轮有效 回合得分的两倍。
 * 4. "C"（一个操作，这不是一个回合的分数）：表示您获得的最后一个有效 回合的分数是无效的，应该被移除。
 */
class Solution {
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
}
public class TestDemo {
    public static void main(String[] args) {
        int[] m = {1,2,3,4,5};
        int[] n = {4,5,3,2,1};
        Solution3 solution3 = new Solution3();
        System.out.println(solution3.IsPopOrder(m, n));
    }
    public static void main2(String[] args) {
        String s1 = "asdfg####w";
        String s2 = "akjhg####w";
        Solution1 solution = new Solution1();
        System.out.println(solution.backspaceCompare(s1, s2));
    }
    public static void main1(String[] args) {
        String[] s = new String[]{"5","2","C","D","+"};
        String[] s1 = new String[]{"5","-2","4","C","D","9","+","+"};
        Solution solution = new Solution();
        System.out.println(solution.calPoints(s));
        System.out.println(solution.calPoints(s1));
    }
}
