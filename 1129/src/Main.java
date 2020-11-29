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
        Scanner sc= new Scanner(System.in);

        while (sc.hasNext()){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            func(a , b , x , y);
        }
    }

    private static void func(int a, int b, int x, int y) {
        int A = (a + x) / 2;
        int B = (b + y) / 2;
        int C = (y - b) / 2;
        if ((a + x) % 2 == 0 && (b + y) % 2 == 0 && (A + B == x) ){
            System.out.println(A + " " + B + " " + C);
        } else {
            System.out.println("No");
        }
    }
}
