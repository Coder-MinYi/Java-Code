import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 动态规划解决最长子序列问题
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        int m = sc.nextInt();
        int max = 0;
        int index = 0;
        for (int i = 0; i < str.length()-m; i++) {
            int count = 0;
            for (int j = i; j < i + m ; j++) {
                if (str.charAt(j) == 'C' || str.charAt(j) == 'G') {
                    count++;
                }
                if (count > max){
                    index = i;
                    max = count;
                }
            }
        }
        System.out.println(str.substring(index,index + m));
    }
}
