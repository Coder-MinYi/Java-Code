import java.util.Scanner;
import java.util.Stack;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 说反话
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            String[] str1 = str.split(" ");
            func(str1);
        }

    }

    private static void func(String[] str1) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < str1.length; i++) {
            stack.push(str1[i]);
        }
        while (stack.size() > 1){
            System.out.print(stack.pop()+" ");
        }
        System.out.print(stack.pop());
    }
}
