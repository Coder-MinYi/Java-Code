
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Solution {
    //打印菱形
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        for (int i = 0; i < a; i++) {
            for (int j = a - 1 - i; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = a; i >= 0; i--) {
            for (int j = a - i - 1; j >= 0; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    //把数组排成最小的数
    public static String PrintMinNumber(int [] numbers) {
        if (numbers.length < 1){
            return "";
        }
        int num1 = 0;
        int num2 = 0;
        int tmp = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                num1 = Integer.valueOf(String.valueOf(numbers[i]) + String.valueOf(numbers[j]));
                num2 = Integer.valueOf(String.valueOf(numbers[j]) + String.valueOf(numbers[i]));
                if (num1 > num2){
                    tmp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = tmp;
                }
            }
        }
        String str = "";
        for (int n:numbers) {
            str += String.valueOf(n);
        }
        return str;
    }
    //汇编语言中有一种移位指令叫做循环左移（ROL），
    // 现在有个简单的任务，就是用字符串模拟这个指令的运算结果。
    // 对于一个给定的字符序列S，请你把其循环左移K位后的序列输出。
    // 例如，字符序列S=”abcXYZdef”,要求输出循环左移3位后的结果，即“XYZdefabc”。
    public String LeftRotateString(String str,int n) {
        if (n > str.length()){
            return str;
        }
        str = str.substring(n , str.length()) + str.substring(0,n);
        return str;
    }
}
