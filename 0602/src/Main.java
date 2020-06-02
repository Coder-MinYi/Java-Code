import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class AntiOrder {
    public int count(int[] A, int n) {
        // write code here
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j =i+1; j < n; j++) {
                if (A[i] > A[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
public class Main {
    public static int func(int n){
        int m = 0;//喝的水的数量
        while (n > 2){
            m += n / 3;
            n = n % 3 + n / 3;
            if (n == 2){
                m++;
            }
        }
        return m;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,6,7,0};
        AntiOrder antiOrder = new AntiOrder();
        System.out.println(antiOrder.count(a, 8));
    }
    public static void main1(String[] args) {
       // System.out.println(func(10));
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            int n = scanner.nextInt();
            if (n == 0){
                break;
            }
            System.out.println(func(n));
        }
        //System.out.println(func(n));
    }
}
