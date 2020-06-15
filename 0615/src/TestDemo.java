/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestDemo {
    static class SubThread extends Thread{

        @Override
        public void run(){
            printFields();
        }
    }
    public static void main(String[] args) {
        Thread thread = new SubThread();
        thread.start();

        printFields();
    }

    private static void printFields() {
        Thread t = new Thread();
        long id = t.getId();
        System.out.println("线程的名字:" + id +" "+t.getName());
        System.out.println("线程的优先级:" + id +" "+t.getPriority());
        System.out.println("线程的状态:" + id +" "+t.getState());
        System.out.println("线程是否存活:" + id +" "+t.isAlive());
        System.out.println("线程是否后台运行:" + id +" "+t.isDaemon());
    }
}
