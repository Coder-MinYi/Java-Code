import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();

            System.out.println(func(n));
        }
    }

    private static int func(int n) {
        int count = 0; //八个装剩余个数
        int num = 0 ;  //总袋数；
        int m = 0 ; //剩余苹果数
        if (n % 2 != 0){
            return -1;
        }
        if(n % 8 == 0){
            return  n / 8;
        }else {
            count = n / 8;
            num = count;
            m = n % 8;
            while (count >= 0){
                if (m % 6 == 0){
                    return num + m /6;
                }else {
                    count--;
                    num--;
                    m = m + 8;
                }
            }
        }
        return -1;
    }
}
