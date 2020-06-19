/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class X {
    Y y = new Y();

    public X() {
        System.out.print("X");
    }
}
    class Y {
        public Y() {
            System.out.print("Y");
        }
    }
        class Z extends X {
            Y y = new Y();

            public Z() {
                System.out.print("Z");
            }
        }

public class Test {
    public String name = " abc";
    static boolean Paddy;
    public static void main(String[] args) {
        Test test = new Test();
        Test testB = new Test();
        System.out.println(test.equals(testB) + "," + test.name.equals(testB.name));
        System. out. println(Paddy);
            new Z();
    }
}

