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
            int n = sc.nextInt();
            System.out.println(func(str, n));
        }
    }

    private static String func(String str , int n) {
        int max = 0;
        int star = 0; //字符串起始点
        for (int i = 0; i < str.length() - n; i++) {
            int count = 0;  //记录n个字符中CG的个数
            for (int j = i; j < i + n; j++) {
                if (str.charAt(j) == 'C' || str.charAt(j) == 'G'){
                    count++;
                }
            }
            if (count > max){
                star = i;
                max = count;
            }
        }
        return str.substring(star , star + n);
    }
}
