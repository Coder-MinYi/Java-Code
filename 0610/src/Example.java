/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Example {
    String str = new String("hello");
    char[] ch = {'a', 'b'};

    public static void main(String args[]) {
        Example ex = new Examp1e();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
        System.out.println();
        String x="fmn";
        x. toUpperCase();
        String y=x. replace('f','F');
        y=y+"wxy" ;
        System . out. println(y);
        System.out.println();
        int i=0;
        Integer j = new Integer(0) ;
        System. out. println(i==j);
        System.out .println(j . equals(i));


    }

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'c';

    }

    private static class Examp1e extends Example {
    }
}
