/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Test {
    public static void main(String[] args) {
        int i = 5;
        int s =(i++) + (++i) + (i--) + (--i);
        System.out.println(s);
        int x = 0;
        int y = 0;
        if (++x > 0 || ++y > 0){
            System.out.println(x + " " + y);
        }
    }
}
