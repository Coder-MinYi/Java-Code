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
            String str = sc.nextLine();
            func(str);
        }
    }

    private static void func(String str) {
        int max = 0;
        int count = 0;
        int end = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                count++;
                if (count > max ){
                    max = count;
                    end = i;
                }
            }else {
                count = 0;
            }
        }
        System.out.println(str.substring(end - max + 1, end + 1));
    }
}
