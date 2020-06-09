import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestDemo {
    public static void main(String[] args) {
        double x = 3.0 ;
        int y = 5;
        x /= --y;
        System.out.println(x);
    }
    public static int deal(int r, int c) {
        int n = 0;
        //如果能整除4 那么蛋糕个数为网格个数的一半
        if (r % 4 == 0 || c % 4 == 0) {
            n = r * c / 2;
        }
        //不能被4整除 将蛋糕每隔一个空放一个 可以放多少 奇数的一半+1
        else {
            n = r * c / 2 + 1;
        }
        return n;
    }

    public static void main5(String args[]) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int r = sc.nextInt();
            int c = sc.nextInt();
            int res = deal(r, c);
            System.out.println(res);
        }
    }
        public static int func2 ( int m, int n){
            int ret = m % n;
            int a = m;
            int b = n;
            while (ret != 0) {
                a = b;
                b = ret;
                ret = a % b;
            }
            return (m * n) / b;
        }
        public static void main4 (String[]args){
            Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int n = sc.nextInt();
            System.out.println(func2(m, n));
        }
        public static void main3 (String[]args){

        }
        public static int func ( int H, int W){
            int count = 0;
            for (int i = 0; i < H - 1; i++) {
                for (int j = 0; j < W - 1; j++) {
                    for (int k = i + 1; k < H - 1; k++) {
                        for (int l = j + 1; l < W - 1; l++) {
                            if (!(Math.sqrt((k - i) ^ 2 - (l - j) ^ 2) == 2)) {
                                count++;
                            }
                        }
                    }
                }
            }
            return count;
        }
        public static void main2 (String[]args){
            Scanner sc = new Scanner(System.in);
            String str = sc.nextLine();
            String[] str1 = str.split(" ");
            System.out.println(func(Integer.parseInt(str1[1]), Integer.parseInt(str1[2])));
        }
        public static void main1 (String[]args){
            System.out.println(Math.round(11.5));
    }
}

