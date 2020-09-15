/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * @description:
 * @author: Tian
 * @time: 2020/9/11 15:11
 */

//两种排序方法

/**
 * 考拉有n个字符串字符串，任意两个字符串长度都是不同的。考拉最近学习到有两种字符串的排序方法： 1.根据字符串的字典序排序。例如：
 * "car" < "carriage" < "cats" < "doggies < "koala"
 * 2.根据字符串的长度排序。例如：
 * "car" < "cats" < "koala" < "doggies" < "carriage"
 *
 * 如果这些字符串是根据字典序排列而不是根据长度排列输出"lexicographically",
 *
 * 如果根据长度排列而不是字典序排列输出"lengths",
 *
 * 如果两种方式都符合输出"both"，否则输出"none"
 */

public class Main1 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] str = new String[n];
        for (int i = 0; i < str.length; i++) {
            str[i] = bf.readLine();
        }
        if (compareOne(str) && compareTwo(str)) {
            System.out.println("both");
        } else if (compareOne(str)) {
            System.out.println("lengths");
        } else if (compareTwo(str)) {
            System.out.println("lexicographically");
        } else {
            System.out.println("none");
        }
    }

    //长度排序
    private static boolean compareOne(String[] str) {
        for (int i = 0; i < str.length - 1; i++) {
            if (str[i + 1].length() < str[i].length()) {
                return false;
            }
        }
        return true;

    }

    //字典排序
    private static boolean compareTwo(String[] str) {
        for (int i = 0; i < str.length - 1; i++) {
            if (str[i].compareTo(str[i + 1]) > 0) {
                return false;
            }
        }
        return true;

    }
}
