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
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            //int n = sc.nextInt();
            int m = sc.nextInt();
            //printJZT(n);
            printLX(m);
        }

    }

    private static void printLX(int n) {
        //打印上半部分
        // 打印上半部分
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        // 打印中间
        for (int i = 0; i < n + 1; i++) {
            System.out.print("* ");
        }
        System.out.println();
        // 打印下半部分
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printJZT(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i + 1; j++){
                System.out.print(1+ " ");
            }
            System.out.println();
        }
    }

}
