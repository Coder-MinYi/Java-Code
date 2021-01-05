import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Substr {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            String[] strings = new String[n];
            for (int i = 0; i < n; i++) {
                strings[i] = sc.nextLine();
            }
            String str = sc.nextLine();
            chkSubStr(strings , n , str);
        }
    }
    public static boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] b = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (s.contains(p[i])){
                b[i] = true;
            }
        }
        return b;
    }
}
