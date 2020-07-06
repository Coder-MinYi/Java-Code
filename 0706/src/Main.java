import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 大整数排序
 */
class Main {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n  = sc.nextInt();
            BigInteger[] str = new BigInteger[n];
            for (int i = 0; i < n; i++) {
                str[i] = sc.nextBigInteger();
            }
            Arrays.sort(str);
            for (int i = 0; i < n; i++) {
                System.out.println(str[i]);
            }
        }
    }

    private static void func(String[] str) {
        for (int i = 0; i < str.length-1; i++) {
            //长度不同
            if (str[i + 1].length() > str[i].length()){
                String m = str[i];
                str[i] = str[i+1];
                str[i+1] = m;
            }//长度相同时
            else{
                if (str[i].compareTo(str[2]) < 0){
                    String m = str[i];
                    str[i] = str[i+1];
                    str[i+1] = m;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i].toCharArray());
        }
    }
}
