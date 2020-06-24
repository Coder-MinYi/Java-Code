import java.io.File;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main {
    public static void main(String[] args) {

        File file = new File("测试目录\\a.txt");
        File file1 = new File("测试目录\\m.txt");
        //模拟文件重命名
        File dest = new File("测试目录\\b.txt");

        boolean b = file.renameTo(dest);
        System.out.println(b);

        File dest1 = new File("m.txt");

        boolean b1 = file1.renameTo(dest1);
        System.out.println(b1);
    }
}
