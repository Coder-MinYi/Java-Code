
import com.sun.javaws.jnl.PackageDesc;

import java.util.Scanner;

public class TestDemo {
    public static int fabonaci(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return fabonaci(n -1) +fabonaci(n -2);
    }
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int m = S.nextInt();
        System.out.println(fabonaci(m));
    }
    public static int func(int a){
        if(a < 9){
            return a;
        }
        return (a % 10) + func(a / 10);
    }
    public static void main5(String[] args) {
        int m = 1729;
        System.out.println(func(m));
    }
    public static int sum(int a){
        int sum = 0;
        if(a == 1){
            return sum = 1;
        }
            return sum = a + sum(a-1);
    }
    public static void main4(String[] args) {
        int n = 9;
        System.out.println(sum(n));
    }
    public static int sum(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public static double sum(double n1,double n2,double n3){
        return n1+n2+n3;
    }
    public static void main3(String[] args) {
        int a = 12;
        int b = 15;
        int c = 18;
        System.out.println(sum(a,b,c));
        double m1 = 12.0;
        double m2 = 13.0;
        double m3 = 14.0;
        System.out.println(sum(m1,m2,m3));
    }
    public static int maxNum(int a,int b, int c){
        int tmp = 0;
        if(a < b){
            tmp = b;
            b = a;
            a = tmp;
        }if(b < c){
            tmp = c;
            c = b;
            b = tmp;
        }if(a < c){
            tmp = c;
            c = a;
            a = tmp;
        }
        return a;
    }
    public static void main2(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int ret = maxNum (n1,n2,n3);
        System.out.println(ret);
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 0;
          while(n!=0){
              n = n & (n-1);
              count++;
          }
        System.out.println(count);
    }
}
