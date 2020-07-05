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
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n  = sc.nextInt();
            String[] str = new String[n];
            for (int i = 0; i < n; i++) {
                str[i] = sc.nextLine();
            }
            func(str);
        }

    }

    private static void func(String[] str) {
        for (int i = 0; i < str.length-1; i++) {
            //长度不同
            if (str[i + 1].length() > str[i].length()){
                String m = str[i];
                str[i] = str[i+1];
                str[i+1] = m;
            }//长度相同时
            else{
                str[i].compareTo(str[2]) ;
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        }
    }
    private static void func1(String str1,String str2){

    }
}
