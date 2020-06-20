import java.util.Scanner;
import java.util.Stack;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main {
    public static void func(int[] n,int[] m ,int p){
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();
        Stack<Integer> stack3 = new Stack<>();

        for (int i = n.length; i > 0; i--) {
            stack1.push(n[i]);
        }
        for (int i = m.length; i > 0; i--) {
            stack2.push(m[i]);
        }
        while (!stack1.empty()){
            stack3.push(stack2.pop());
            stack3.push(stack1.pop());
        }
        for (int i = 0; i < 2*p ; i++) {
            System.out.print(stack3.pop());
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int T = sc.nextInt();//T组
        while(T>0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] num1 = new int[n]; //接收前一半
            int[] num2 = new int[n];//接收后半
            for (int i = 0; i < n; i++) {
                num1[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                num2[i] = sc.nextInt();
            }
            //func();
        }
    }
}
