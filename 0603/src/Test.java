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
public class Test {
    public static int func(int num) {
        if (num == 0){
            return 0;
        }else {
            if (num == 1) {
                return 1;
            }
            else {
                return func(num - 1)+func(num -2);
            }
        }
    }
    public static int func2(int n){
        int m = 0;
        int x = 0;
        while (m >= 0) {
            if (func(m) > n ){
                x = func(m);
                break;
            }else {
                m++;
            }
        }
        int y = func(m -1);
        return func(m)-n > n - func(m -1) ? n-func(m-1):func(m) - n;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       /* while (scanner.hasNext()){
            int n = scanner.nextInt();
            System.out.println(func2(n));
        }*/
        List<String> list = new ArrayList<>();
        while (scanner.hasNextLine()){
            String s = scanner.nextLine();
            String[] str = s.split(" ");
            for (String str1:str) {
                if (!list.contains(str1)){
                    list.add(str1);
                }
            }
        }
        System.out.println(list.size());
    }
}
