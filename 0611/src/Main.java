import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

public class Main {
        public static void main(String[] args) {
            try{
                int i=100/0;
                System. out. print(i);
            }catch(Exception e){
                System. out. print(1);
                throw new RuntimeException();
            }finally {
                System.out.print(2);
            }
                System. out. print(3);
            }

        public static void main8(String[] args) {
        byte b1=1, b2=2,b3, b6;
        final byte b4=4, b5=6;
        b6 = b4 +65;
       //b3= (b1+b2);
        //System.out. println(b3+b6);

    }
    public static void main7(String[] args) {
        //int array[] = new int[10];
        //System.out.println(array[10]);
        class Test {
            public int add(int a, int b) {
                try {
                    return a + b;
                } catch (Exception e) {
                    System.out.println(" catch语句块");
                } finally {
                    System.out.println("finally语句块");
                }
                return 0;
            }

        }
        Test test = new Test();
        System.out.println("和是: " + test.add(9, 34));
    }
    public static void main6(String[] args) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operator(a, b);
        System.out.println(a +","+b);
}
    public static void operator(StringBuffer x,StringBuffer y){
            x. append(y);
            y = x;
        }

private final static native int  s();
        public static void main5(String[] args) {
            Object o= new Object() {
                public boolean equals(Object obj) {
                    return true;
                }
            };
            System. out. println(o. equals("Fred"));
        }

    public static void main4(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        //List<String> list = new ArrayList<>();
        while (n >= 1){
            int m = n % 10;
            System.out.print(m);
            n = n / 10;
        }
    }
    public static void main2(String[] args) {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        int res = 0;
        for(int i = n; i >= 5; i--) {
            int tmp = i;
            while(tmp % 5 == 0) {
                res++;
                tmp /= 5;
            }
        }
        System.out.println(res);
    }
    public static long func(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * func(n - 1);
        }
    }

    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int n = sc.nextInt();
            long h = func(n);
            System.out.println(h);
            int count = 0;
            while (h % 10 == 0) {
                count++;
                h = (h / 10);
            }
            System.out.println(count);
        }
    }
}
