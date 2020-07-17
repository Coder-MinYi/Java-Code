import java.util.Scanner;
import java.util.Stack;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MinYi
 * Date:15:01 2020/7/17
 * Time:
 */

/**
 * 句子倒叙
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while (sc.hasNext()){
            String str = sc.nextLine();

            String[] strings = str.split(" ");
            func(strings);
        }
    }

    private static void func(String[] strings) {
        Stack<String> stack = new Stack<>();

        for (String str : strings){
            stack.push(str);
        }
        while (stack.size() > 1){
            System.out.print(stack.pop() + " ");
        }
        System.out.println(stack.pop());
    }
}
