/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
/**
 * 两个线程同时打印
 */
public class YieldDemo {
    static class A extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("A");
                Thread.yield();
            }
        }
    }

    static class B extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("B");
                Thread.yield();
            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }
}

