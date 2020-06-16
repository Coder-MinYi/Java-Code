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

/**
 * 组个最小数
 * 题目描述
 * 给定数字0-9各若干个。你可以以任意顺序排列这些数字，但必须全部使用。目标是使得最后得到的数
 * 尽可能小（注意0不能做首位）。例如：给定两个0，两个1，三个5，一个8，我们得到的最小的数就是
 * 10015558。现给定数字，请编写程序输出能够组成的最小的数。
 * 输入描述:
 * 每个输入包含1个测试用例。每个测试用例在一行中给出10个非负整数，顺序表示我们拥有数字0、数
 * 字1、……数字9的个数。整数间用一个空格分隔。10个数字的总个数不超过50，且至少拥有1个非0的数字。
 * 输出描述:
 * 在一行中输出能够组成的最小的数。
 * 输入例子:
 * 2 2 0 0 0 3 0 0 1 0
 * 输出例子:
 * 10015558
 */
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                list.add(sc.nextInt());
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 1; i < list.size(); i++) {
                if (list.get(i) != 0) {
                    sb.append(i);
                    list.set(i, list.get(i) - 1);
                    break;
                }
            }

            for (int i = 0; i < list.size(); i++) {
                //if (list.get(i) != 0) {
                    for (int j = 0; j < list.get(i); j++) {
                        sb.append(i);
                  //  }
                }
            }

            System.out.println(sb.toString());
        }
    public static void func(String[] str){
        int[] a = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            a[i] = Integer.parseInt(str[i]);
        }
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length -1 -i; j++) {
                if (a[j] > a[j + 1]){
                    int tmp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = tmp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
        //return a;
        for (int j = 1; j < a.length; j++) {
            if (a[0] == 0) {
                    if (a[j] != 0) {
                        int tmp = a[0];
                        a[0] = a[j];
                        a[j] = tmp;
                    }
                }
            }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
        }
    }
    public static void main1(String[] args) {
        Scanner sc= new Scanner(System.in);

        while (sc.hasNextLine()){
            String str = sc.nextLine();
            String[] str1 = str.split(" ");
            //System.out.println(Arrays.toString(func(str1)));
            func(str1);
        }
    }
}
