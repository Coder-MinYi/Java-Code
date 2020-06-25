import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Test {

    public static char[] func(String str){

        char[] ch = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
            if (ch[i] <'F'){
                ch[i] = (char) (ch[i]-5);
            }else {
                ch[i] = (char) (ch[i] + 21);
            }
        }
        return ch;
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);

        while (sc.hasNext()){
            String str = sc.nextLine();

            System.out.println(Arrays.toString(func(str)));
        }
    }
}
