import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 给定一个字符串，问是否能通过添加一个字母将其变为回文串。
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()){
            String str = sc.next();
            //判断一个字符串添加一个字母能否使其变成回文串
            //1.那么该字符串本身就是回文串
            //2.去掉第一个或者最后一个字母后字符串是回文串
            if (!ispa(str) && !ispa(str.substring(1,str.length())) && !ispa(str.substring(0,str.length()-1))) {
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
            
        }
    }

    private static boolean ispa(String str) {
        int i = 0;
        int j = str.length()-1;
        char[] ch = str.toCharArray();
        while (i <= j){
            if (ch[j] == ch[i]) {
                i++;
                j--;
            }else {
                return false;
            }
        }
        return true;
    }
}
