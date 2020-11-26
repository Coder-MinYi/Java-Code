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
            String n = sc.nextLine();
            String m = sc.nextLine();

            System.out.println(func(n , m));
        }
    }

    private static String func(String str1 , String str2 ) {
        char[] ch = str1.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
           if (!str2.contains(String.valueOf(ch[i]))){
               sb.append(ch[i]);
           }
        }
        return sb.toString();
    }
}
