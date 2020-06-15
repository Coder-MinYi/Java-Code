/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.util.Scanner;

/**
 * 主线程中创建新的线程（B）
 *
 * 主线程负责通知让（B）停止运行
 */
public class AboutThreadStop {
    static class B extends Thread {
        B() {
            super("B");
        }

        @Override
        public void run() {
            while (true) {
                try {
                    System.out.println("我正在挖煤");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }
        }
    }

    public static void main(String[] args) {
        B b = new B();
        b.start();

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("准备通知 B 线程停止运行");
        b.interrupt();  // 通知 B 停止运行
        System.out.println("已经通知 B 线程停止运行");
    }
}

