/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Test1 {
    static int cnt = 6;
    static {
        cnt += 9;
    }

    public static void main(String[] args) {
        System.out.println(cnt);
    }
    static {
        cnt /= 3;
    };
}
