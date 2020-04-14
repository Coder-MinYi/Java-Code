import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestDemo {
    //计算1+2+3+4+...+n。
    public static int Add(int a){
        if(a == 1){
            return 1;
        }
        return a + Add(a - 1);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(Add(n));
    }

    //写一个递归方法
    // 输入一个非负整数，返回组成它的数字之和
    public static int func14(int a){
        if(a < 10){
            return a;
        }
        return a % 10 + func14(a/10);
    }
    //将一个数每一位按顺序输出
    public static void func13(int a){
        if(a > 9){
            func13(a /10);
        }
        System.out.println(a % 10);
    }
    public static void main13(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        func13(n);
        System.out.println(func14(n));
    }
    //递归求斐波那契数列的第 N 项
    public static int func12(int m){
        if(m == 1 || m == 2){
            return 1;
        }
        return func11(m-1) + func11(m - 2);
    }
    public static void main12(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(func12(n));
    }
    //递归求解汉诺塔问题
    public static void move(char pos1,char pos2){
        System.out.print(pos1+"->"+pos2+" ");
    }
    public static void hanoi(int a,char pos1,char pos2,char pos3){
        if(a == 1){
            move(pos1,pos3);
            return;
        }
        hanoi(a-1,pos1,pos3,pos2);
        move(pos1,pos3);
        hanoi(a-1,pos2,pos1,pos3);
    }
    public static void main11(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        hanoi(n,'A','B','C');
    }
    //简单青蛙跳台阶问题
    public static int func11(int m){
        if(m == 1){
            return 1;
        }else if(m == 2){
            return 2;
        }
        return func11(m-1) + func11(m - 2);
    }
    public static void main10(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.out.println(func11(a));
    }
    //在同一个类中,分别定义求两个整数的方法 和 三个小数之和的方法。
    // 并执行代码，求出结果
    public static int func10(int m,int n){
        return m + n;
    }
    public static double func10(double x,double y,double z){
        return x+y+z;
    }
    public static void main9(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        double c = s.nextDouble();
        double d = s.nextDouble();
        double e = s.nextDouble();
        System.out.println(func10(a,b));
        System.out.println(func10(c,d,e));
    }
    //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，
    //还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
    public static void main8(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        double c = s.nextDouble();
        double d = s.nextDouble();
        System.out.println(func8(a,b));
        System.out.println(func8(c,d));
        System.out.println(func9(a,c,d));
    }
    public static int func8(int m,int n){
        if(m > n){
            return m;
        }
        return n;
    }
    public static double func8(double m,double n){
        if(m > n){
            return m;
        }
        return n;
    }
    public static double func8(int m,double n){
        if(m > n){
            return m;
        }
        return n;
    }
    public static double func9(int x,double y,double z){
        return  func8(func8(x,y),z);
    }
    // 创建方法求两个数的最大值max2，随后再写一个求3个数的最大值的函数max3。
    // 要求：在max3这个函数中，调用max2函数，来实现3个数的最大值计算
    public static double func9(int x,int y,int z){
        return  func8(func8(x,y),z);
    }
    public static void main7(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        int c = s.nextInt();
        System.out.println(func9(a,b,c));
    }
    //调整数组顺序使得奇数位于偶数之前。调整之后，不关心大小顺序。
    public static int[] func7(int[] arr){
        for(int i = 0; i < arr.length; i++) {
            for(int j = arr.length - 1; j > i; j--) {
                if(arr[j] % 2 == 1 && arr [j - 1] % 2 == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
        return arr;
    }
    public static int[] func6(int [] arr){
        int m = 0;
        for (int i = 0; i <= arr.length-1; i++) {
                int tmp = 0;
                if (arr[i] % 2 != 0) {
                    tmp = arr[i];
                    for (int j = i;j > m;j--) {
                        arr[j] = arr[j - 1];
                    }
                    arr[m] = tmp;
                    m++;
                }
        }
        return arr;
    }
    public static void main6(String[] args) {
        int[] array = {2,6,9,7,8,5};
       // int[] ret = func6(array);
        int[] ret1 = func7(array);
        //System.out.println(Arrays.toString(ret));
        System.out.println(Arrays.toString(ret1));
    }
    //求n的阶乘（递归实现）
    public static int func5(int a){
        if(a == 1){
            return 1;
        }
        return a*func5(a -1);
    }
    //求n!的阶乘 (迭代实现)
    public static int func4(int a){
        int ret = 1;
        for (int i = 1; i <= a; i++) {
            ret *= i;
        }
        return ret;
    }
    public static void main4(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(func4(n));
        System.out.println(func5(n));
    }
    //求1！+2！+3！+4！+........+n!的和
    public static int func3(int a){
        int ret = 1;
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            ret *= i;
            sum += ret;
        }
        return sum;
    }
    public static void main3(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(func3(n));
    }
    //求斐波那契数列的第n项。(迭代实现)
    public static int func2(int a){
        if(a == 1 || a == 2){
            return 1;
        }
        int m = 1; int n = 1; int c = 1;
        for (int i = 0; i < a -2; i++) {
         c = m + n;
         m = n;
         n = c;
        }
        return c;
    }
    public static void main2(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(func2(n));
    }
    //有一组数据，只有一个数字是出现一次，其他是两次，请找出这个数字。
    public static int func1(int [] arr){
        int ret = 0;
        for (int i = 0; i < arr.length; i++) {
            ret ^= arr[i];
        }
        return ret;
    }
    public static void main1(String[] args) {
        int [] array = {1,2,3,4,5,4,3,2,1};
        System.out.println(func1(array));
    }
}
