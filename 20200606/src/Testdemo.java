/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class Example{
    String str=new String("good");
    char[]ch={'a','b','c'};
    public static void main3(String args[]) {
        Example ex = new Example();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);
    }
        public void change(String str,char ch[]){
//引用类型变量，传递的是地址，属于引用传递。
            str="test ok";
            ch[0]='g';
        }
    }

class Foo {
    public static void main2(String sgf[]) {
        StringBuffer a = new StringBuffer("A");
        StringBuffer b = new StringBuffer("B");
        operate(a, b);
        System.out.println(a + "." + b);
    }
        static void operate(StringBuffer x,StringBuffer y) {
            x.append(y);
            y=x;
        }
    }
class TestDemo {
            public static void main5(String args[]) {
                int x;
                int y;
                x=5>>2;
                y=x>>>2;
                System.out.println(y);

            }
    public static void main4(String[] args){
        String s = "gf";
        System. out . println("s="+s);
    }

    public static void main1(String args[]) throws InterruptedException {

        Thread t = new Thread(new Runnable() {

            public void run() {

                try {
                    Thread.sleep(2000);

                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.print("2");
            }

        });

        t.start();

        t.join();

        System.out.print("1");
    }
}
