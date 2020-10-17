/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.util.Scanner;

/**
 * 1、对输入的字符串进行加解密，并输出。
 *
 * 2加密方法为：
 *
 * 当内容是英文字母时则用该英文字母的后一个字母替换，同时字母变换大小写,如字母a时则替换为B；字母Z时则替换为a；
 *
 * 当内容是数字时则把该数字加1，如0替换1，1替换2，9替换0；
 *
 * 其他字符不做变化。
 *
 * 3、解密方法为加密的逆过程。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();

            jiami(str1);
            jiemi(str2);
        }
    }

    //解密
    private static void jiemi(String str2) {
        char[] ch = str2.toCharArray();
        for (int i = 0; i < str2.length(); i++) {
            if (ch[i] <= 'z' && ch[i] > 'a') {
                ch[i] = (char) (ch[i] - 33);
            } else if (ch[i] == 'a') {
                ch[i] = 'Z';
            } else if (ch[i] <= 'Z' && ch[i] > 'A') {
                ch[i] = (char) (ch[i] + 31);
            }else if (ch[i] == 'A') {
                ch[i] = 'z';
            }else if (ch[i]<= '9' && ch[i] > '0'){
                ch[i] = (char) (ch[i] - 1);
            }else {
                ch[i] = '9';
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            System.out.print(ch[i]);
        }
        System.out.println();
    }

    //加密
    private static void jiami(String str1) {
        char[] ch = str1.toCharArray();
        for (int i = 0; i < str1.length(); i++) {
            if (ch[i] < 'z' && ch[i] >= 'a') {
                ch[i] = (char) (ch[i] - 31);
            } else if (ch[i] == 'z') {
                ch[i] = 'A';
            } else if (ch[i] < 'Z' && ch[i] >= 'A') {
                ch[i] = (char) (ch[i] + 33);
            }else if (ch[i] == 'Z') {
                ch[i] = 'a';
            }else if (ch[i]< '9' && ch[i] >= '0'){
                ch[i] = (char) (ch[i] + 1);
            }else {
                ch[i] = '0';
            }
        }
        for (int i = 0; i < ch.length; i++) {
            System.out.print(ch[i]);
        }
        System.out.println();
    }
}
