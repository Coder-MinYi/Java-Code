/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main1 {
    public static void main(String[] args) {
        int l = func(30);
        System.out.println(30 * 10+ " " +l);
    }

    private static int func(int i) {
        if (i == 1){
            return 1;
        }else {
            return 2 * func(i - 1);
        }
    }
}
