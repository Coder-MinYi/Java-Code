import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main {
    public static void func2(String str1,String str2){
        List<Character> list1 = new ArrayList<>();
        for (int i = 0; i < str2.length(); i++) {
            list1.add(str2.charAt(i));
        }
        for (char st: str1.toCharArray()) {
            if (!list1.contains(st)){
                System.out.print(st);
            }
        }
        System.out.println();
    }
    public static void func1(int n) {
        if (n >= 1 && n <= 100) {
            int sum = 0;
            int min = 0;
            for (int a = 0; a <= n; a++) {
                for (int b = 0; b <= n; b++) {
                    if (a * 6 + b * 8 == n) {
                        sum = a + b;
                        if (min != 0) {
                            if (min > sum) {
                                min = sum;
                            }
                        } else {
                            min = sum;
                        }
                    }
                }
            }
            if (min == 0) {
                System.out.println("-1");
            } else {
                System.out.println(min);
            }
        }
    }

    public static int func(int n) {
        if (n >= 1 && n <= 100) {

            int sum = 0;
            int min = 0;
            for (int i = 0; i < n % 6 +1; i++) {
                for (int j = 0; j < n % 8 + 1; j++) {
                    if (i * 6 + j * 8 == n) {
                        sum = i + j;
                        if (min != 0) {
                            if (min > sum) {
                                min = sum;
                            }
                        } else {
                            min = sum;
                        }
                    }
                }
            }
            if (min == 0) {
                return -1;
            } else {
                return min;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String str1 =  sc.nextLine();//"they are students";
            String str2 = sc.nextLine();//"aeiou";
            func2(str1, str2);
        }
    }
    public static void main1 (String[]args){
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            System.out.println(func(n));
        }
    }
}
