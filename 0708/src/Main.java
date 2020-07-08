import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 在霍格沃茨找零钱（20）
 *
 * 如果你是哈利·波特迷，你会知道魔法世界有它自己的货币系统 ——
 * 就如海格告诉哈利的：“十七个银西可(Sickle)兑一个加隆(Galleon)，
 * 二十九个纳特(Knut)兑一个西可，很容易。”现在，给定哈利应付的价钱P和他实付的钱A，
 * 你的任务是写一个程序来计算他应该被找的零钱。
 *
 */
public class Main {
    public static void main(String[] args) {
        Count2 count2 = new Count2();
        System.out.println(count2.countNumberOf2s(12));
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String str = sc.next();
            String str1 = sc.next();

            String[] str3 = str.split("\\.");
            String[] str4 = str1.split("\\.");
            func(str3,str4);
        }
    }

    private static void func(String[] str1,String[] str2) {
        //int[] p = new int[str1.length];
        //int[] a = new int[str1.length];

        int[] p = {Integer.parseInt(str1[0])*29*17,Integer.parseInt(str1[1])*29,Integer.parseInt(str1[2])};
        int[] a = {Integer.parseInt(str2[0])*29*17,Integer.parseInt(str2[1])*29,Integer.parseInt(str2[2])};
        int tp = p[0] + p[1] + p[2];
        int ta = a[0] + a[1] + a[2];

        int t = ta - tp;

        if (t < 0){
            System.out.print("-");
            t =-t;
        }
        System.out.println(t/(29*17) + "." + (t%(29*17))/29 + "." +(t%(29*17))%29);
    }
}
