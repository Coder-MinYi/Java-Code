/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestDemo {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        if ((++i > 0) || (++j > 0)){
            System.out.println(i+" "+j);
        }
        int n = 5;
        int s = (n++) + (++n) + (n--) + (--n);
        System.out.println(s);
    }
}
