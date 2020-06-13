/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class Test2 {
    public void add(Byte b) {
        b = b++;
    }

    public void test() {
        Byte a = 127;
        Byte b = 127;
        add(++a);
        System.out.print(a + " ");
        add(b);
        System.out.print(b + "");
    }

    public class MyClass {
        public void main(String[] args) {

        }
        /*public int constInt = 5;
        //constInt = constInt + 5;
        //public abstract void anotherMethod(){}
        public abstract void method(int a) ;
    //public int method() ;
        public void method( ) {
        }*/
    }
}