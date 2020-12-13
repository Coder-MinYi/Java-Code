/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Test {
    public String str = "6";

    public static void main(String[] args) {
        Test test = new Test();
        test.func(test.str);
        System.out.println(test.str);

    }
    private void func(String str){
        str = "10";
    }
}
