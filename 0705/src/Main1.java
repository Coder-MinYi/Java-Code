import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 年会抽奖
 * 今年公司年会的奖品特别给力，但获奖的规矩却很奇葩：
 * 1. 首先，所有人员都将一张写有自己名字的字条放入抽奖箱中；
 * 2. 待所有字条加入完毕，每人从箱中取一个字条；
 * 3. 如果抽到的字条上写的就是自己的名字，那么“恭喜你，中奖了！”
 * 现在告诉你参加晚会的人数，请你计算有多少概率会出现无人获奖？
 *
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            //System.out.println(func(n));
            //System.out.println(count(n));
            double m = (func(n) / count(n)) * 100;
            //System.out.println(m);
            System.out.println(String.format("%.2f", m)+ "%");
        }
    }
    //错拍算法，计算都抽不到的次数
    private static double func(int n) {
        if (n == 1){
            return 0;
        }
        if (n == 2){
            return 1;
        }
        return (n -1 )* (func(n - 1) + func(n-2));
    }

    private static double  count(int n) {
        if (n == 1 || n == 0){
            return 1;
        }
        return n * count(n - 1);
    }
}
