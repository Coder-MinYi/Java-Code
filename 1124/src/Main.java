import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main {
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int n = sc.nextInt();
            if (n < 2){
                System.out.println(0);
            }

            int count = 0;
            while (n > 2){
                count += n / 3 ;
                n = n / 3 + n % 3;
                if (n == 2){
                    count = count + 1;
                }
            }
            System.out.print(count);
        }
    }

    private static int func(int n) {
        if (n < 2){
            return 0;
        }

        int count = 0;
        while (n > 2){
            count += n / 3 ;
            n = n / 3 + n % 3;
        }
        if (n == 2){
            count = count + 1;
        }
        return count;
    }
   // private static int blank;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int blank = scan.nextInt();
            int drink = 0;
            int remain;
            if (blank > 0 && blank <= 100) {
                if (blank == 1) {
                    drink = 0;
                } else if (blank == 2) {
                    drink = 1;
                }
                while (blank > 2) {  //10,4,5
                    drink += blank / 3;   //3 drink,4 drink
                    remain = blank % 3;  //1 remain,1 remain
                    blank = blank / 3 + remain;   //4 blank,2 blank
                    if (blank == 2) {
                        drink++;
                    }
                }
            }
            System.out.println(drink + "");
        }
    }
}

