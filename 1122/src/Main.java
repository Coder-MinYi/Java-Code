import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main {
    //字符串拼接
    public static int func1(String str1 , String str2){
        int count = 0;
        for (int i = 0; i <= str1.length(); i++) {
            StringBuilder sb = new StringBuilder(str1);
            sb.insert(i , str2);
            if (func(sb.toString())){
                count++;
            }
        }
        return count;
    }
    //判断是否是回文串
    public static boolean func(String str ){
        int l = 0;
        int r = str.length() - 1;
        while (l <= r){
            if (str.charAt(l) != str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
    public static boolean func3(StringBuilder str ){
        if (str.reverse().equals(str)){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String str1 = sc.nextLine();
            String str2 = sc.nextLine();

            System.out.println(func1(str1, str2));
        }
    }
}
