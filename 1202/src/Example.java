/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Example {
    String str = new String("hello");
    char[] ch = {'a','b'};

    public static void main(String[] args) {
        Example e = new Example();
        e.change(e.str , e.ch);
        System.out.print(e.str + " and ");
        System.out.println(e.ch);
        int i = 0;
        Integer j = new Integer(0);
        System.out.println(i == j);
        System.out.println(j.equals(i));
    }

    public void change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'c';
    }
}
