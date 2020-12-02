/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class A{
    String name = "no name";
    public A(String nm){
        name = nm;
    }
}
class B extends A{
    String emid = "000";
    public B(String id){
        super("ji");
        emid = id;
    }
}
public class Test {
    public static void main(String[] args) {
                B e = new B("123");
        System.out.println(e.emid);
    }
}
