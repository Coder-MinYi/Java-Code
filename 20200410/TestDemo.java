

import java.util.Scanner;

public class TestDemo{
	public static void main2(String[] args) {
		Scanner s= new Scanner(System.in);
        System.out.print("输入第一个数：");
        int a=s.nextInt();
        System.out.print("输入第二个数：");
        int b=s.nextInt();
        System.out.print("输入第三个数：");
        int c=s.nextInt();
        int tem = 0;
        if(a < b){
        	tem = b;
        	b = a;
        	a = tem;
        }
        if(b < c){
        	tem = c;
        	c = b;
        	b = tem;
        }
        if(a < c){
        	tem = c;
        	c = a;
        	a = tem;
        }
        System.out.println("最大值是："+a+"最小值是："+c);
	}
}

	public static void main1(String[] args) {
	    Scanner s= new Scanner(System.in);
        System.out.print("输入第一个数：");
        int a=s.nextInt();
        System.out.print("输入第二个数：");
        int b=s.nextInt();

		int tem = a;
		a = b;
		b = tem;
		System.out.println("a="+a+"b="+b);
	}