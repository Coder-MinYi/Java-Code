import java.util.Scanner;
import java.util.Stack;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class Parenthesis {
    public boolean chkParenthesis(String A, int n) {
        // write code here
        if (n % 2!= 0){
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < n; i++) {
            char ch = A.charAt(i);
            if (ch == '('){
                stack.push(A.charAt(i));
            }else if (ch == ')'){
                if(stack.empty()){
                    return false;
                }else {
                    stack.pop();
                }
            }
        }
        if (!stack.empty()){
            return false;
        }
        return true;
    }
}
public class Main {
    public static  void func(String str){
        int count = 0;
        int end = 0;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                count++;
                if (count > max) {
                    max = count;
                    end = i;
                    }
                }else {
                    count = 0;
                }
            }
            System.out.println(str.substring(end - max + 1, end + 1));
    }

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "he" + new String("llo");
        System.out.println(str1 == str2);
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String str = sc.nextLine();
            func(str);
        }
    }
}
