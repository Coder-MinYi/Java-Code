import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main {
    public static boolean func(String sb){
       int i = 0;
       int j = sb.length() -1;
       while (i < j){
           if (sb.charAt(i) != sb.charAt(j)){
               return false;
           }
           i++;
           j--;
       }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();

        int count = 0;
        for (int i = 0; i < str1.length() ; i++) {
            StringBuffer sb = new StringBuffer(str1);
            sb.insert(i,str2);
            if (func(sb.toString())){
                System.out.println(sb);
                count++;
            }
        }
        System.out.println(count);
    }
}
