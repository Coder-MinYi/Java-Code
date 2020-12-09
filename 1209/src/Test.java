/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class A{
    public A(String str){

    }
}
public class Test {
    public static void main(String[] args) {
        A aa = new A("he");
        A ab = new A("he");
        System.out.println(aa == ab);
        System.out.println(aa.equals(ab));
    }
}
