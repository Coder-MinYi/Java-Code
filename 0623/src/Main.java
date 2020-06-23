import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

public class Main {
    public static boolean[] chkSubStr(String[] p, int n, String s) {
        // write code here
        boolean[] sub = new boolean[n];
        for (int i = 0; i < n; i++) {
            sub[i] = s.contains(p[i]);
        }
        return sub;
    }
    public static void main(String[] args) {
        String p[] = {"a","b","c","d"};
        String s = "abc";
        int n = p.length;
        System.out.println(Arrays.toString(chkSubStr(p, n, s)));
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String s = sc.nextLine();
            String m = sc.nextLine();

        }
    }
}
