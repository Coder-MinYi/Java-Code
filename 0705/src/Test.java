import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 奇偶校验
 */
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String str = sc.nextLine();
            func(str);
        }
    }

    private static void func(String str) {
        char[] ch = str.toCharArray();
        for (char c: ch) {
            int a = c;
            String str1 = Integer.toBinaryString(a);
           // StringBuffer str2 = new StringBuffer();
            while (str1.length() < 7){
                str1 = "0"+ str1;
            }
            int count = 0;
            int b=1;
            for (int i=0;i<7;i++){
                if ((a& b)==b){
                    count++;
                }
                b=(b<<1);

            }
            //System.out.println(count);
            if (count % 2 == 0){
                str1 = "1" + str1;
            }else {
                str1 = "0" + str1;
            }
            System.out.println(str1.toCharArray());
        }
    }
}
