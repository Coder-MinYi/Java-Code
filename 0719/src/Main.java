import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
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
