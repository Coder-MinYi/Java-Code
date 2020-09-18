import java.util.Scanner;
import java.util.Stack;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Solution {
    //字符串逆置
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            System.out.println(func1(str).toCharArray());
            System.out.println(func2(str).toCharArray());
            System.out.println(func3(str));
        }
    }
    //递归实现
    private static String func1(String str) {
        if(str.length() == 0 || str.length() == 1){
            return str;
        }
        return func1(str.substring(1)) + str.charAt(0);
    }
    //栈实现
    private static String func2(String str) {
        Stack<Character> stack = new Stack<>();
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            stack.push(chars[i]);
        }
        String sb = "";
        while (!stack.isEmpty()){
            sb +=(stack.pop());
        }
        return sb;
    }
    //数组实现
    private static String func3(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left <= right){
            char tmp = chars[left];
            chars[left] = chars[right];
            chars[right] = tmp;
            left++;
            right--;
        }
        String sb = "";
        for (char i:chars) {
            sb += i;
        }
        return sb;
    }
}
