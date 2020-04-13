import java.util.Random;
import java.util.Scanner;

public class TestDemo {
    public static void move(char pos1,char pos2){
        System.out.print(pos1+"->"+pos2+" ");
    }
    public static void hanoi(int n,char pos1,char pos2,char pos3){
        if(n == 1){
            move(pos1,pos3);
        } else {
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos2,pos1,pos3);
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        hanoi(n,'A','B','C');
    }

    public static void func10(int a){
        for (int i = 1; i <= a; i++) {
            for(int j = 1;j <= i;j++){
                System.out.print(i + "*" + j +"="+i*j +" ");
            }
            System.out.println();
        }
    }

    public static void main9(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        func10(n);
    }

    public static void func9(int a){
        while(a != 0){
            int c = a % 10;
            System.out.println(c);
            a = a / 10;
        }
    }

    public static void main8(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        func9(n);
    }

    public static void func8(int count){
        Scanner scan = new Scanner(System.in);
        while (count != 0) {
            System.out.println("请输入你的密码：");
            String password = scan.nextLine();
            if(password.equals("123456")) {
                System.out.println("密码正确，登录成功！");
                break;
            }else {
                count--;
                System.out.println("你还有"+count+"次机会！");
            }
        }
    }

    public static void main7(String[] args) {
        int n = 3;
        func8(n);
    }

    public static void func7(int a){
        for (int i = 31; i >= 1; i-=2) {
                System.out.print(((a>>i) & 1)+" ");
            }
                System.out.println();
            for(int j =30;j >= 1;j -=2){
                System.out.print(((a>>j) & 1)+" ");
            }
    }

    public static void main6(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        func7(n);
    }

    public static int func6(int a){
        int count = 0;
        while (a != 0){
            a = a & (a-1);
            count++;
        }
        return count;
    }

    public static int func5(int a){
        int count = 0;
        for (int i = 0; i < 32 ; i++) {
            if(((a>>i) & 1) != 0){
                count++;
            }
        }
        return count;
    }

    public static void main5(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        func5(n);
        func6(n);
        System.out.println(func5(n));
        System.out.println(func6(n));
    }

    public static void func4(int a,int b){
        int c = 0;
        while(a %b != 0){
            c = a % b;
            a = b;
            b = c;
        }
            System.out.println(c);
    }

    public static void main4(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m = s.nextInt();
        func4(m,n);
    }

    public static void func3(int m){
        for(int n = 1;n <= m;n++){
            int count = 0;
            int tem = n;
            while(tem != 0){
                tem = tem/10;
                count++;
            }
            tem = n;
            int sum = 0;
            while(tem !=0){
                sum += Math.pow(tem%10,count);
                tem = tem/10;
            }
            if(sum == n){
                System.out.println(sum);
            }
        }
    }

    public static void main3(String[] args) {
        int a = 99999999;
        func3(a);
    }

    public static void func2(int a) {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("请输入你要猜的数字：");
            int m = s.nextInt();
            if (m < a) {
                System.out.println("你猜的数字小了！");
            } else if (m == a) {
                System.out.println("你猜的数字对了！");
                break;
            } else {
                System.out.println("你猜的数字大了！");
            }
        }
    }

    public static void main2(String[] args) {
        Random r = new Random();
        int ranNum = r.nextInt(1000);
        func2(ranNum);
    }

    public static void func(int a) {
        for (int i = 2; i <= a; i++) {
            int j = 2;
            for (; j <= i; j++) {
                if (i % j == 0 && i != j) {
                    System.out.println(i + "不是素数");
                    break;
                } else if (i == j) {
                    System.out.println(j + "是素数");
                }
            }
        }
    }

    public static void main1(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        func(n);
    }
}
