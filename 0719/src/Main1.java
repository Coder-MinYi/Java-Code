import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 计算日期到天数的转换
 *
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int year = sc.nextInt();
            int month = sc.nextInt();
            int day = sc.nextInt();

            days(year,month,day);
        }
    }

    private static void days(int year, int month, int day) {
        //不是闰年的前11个月天数数组
        int[] days1 = {31,28,31,30,31,30,31,31,30,31,30};
        //是闰年的前11个月天数数组
        int[] days2 = {31,29,31,30,31,30,31,31,30,31,30};
        int sum = 0;
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            for (int i = 0; i < month - 1; i++) {
                sum += days2[i];
            }
        }else {
            for (int i = 0; i < month - 1; i++) {
                sum += days1[i];
            }
        }

        sum += day;
        System.out.println(sum);
    }
}
