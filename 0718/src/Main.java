import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:0718
 * Time:21:10
 */

/**
 *  开发一个坐标计算工具，
 *  A表示向左移动，D表示向右移动，W表示向上移动，
 *  S表示向下移动。从（0,0）点开始移动，
 *  从输入字符串里面读取一些坐标，并将最终输入结果输出到输出文件里面。
 *合法坐标为A(或者D或者W或者S) + 数字（两位以内）;坐标之间以;分隔。
 *非法坐标点需要进行丢弃。如AA10;  A1A;  $%$;  YAD; 等。
 *下面是一个简单的例子 如：
 * A10;S20;W10;D30;X;A1A;B10A11;;A10;
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while (sc.hasNext()){
            String str = sc.nextLine();
            String[] str1 = str.split(";");
            int x = 0;
            int y = 0;
            for (String st:str1) {
                if (st.length() > 3 || st.length() < 2){
                    continue;
                }
                if (st.charAt(0) == 'A' && st.substring(1).matches("[0-9]+")){
                    x -= Integer.parseInt(st.substring(1));
                }if (st.charAt(0) == 'D' && st.substring(1).matches("[0-9]+")){
                    x += Integer.parseInt(st.substring(1));
                }if (st.charAt(0) == 'S' && st.substring(1).matches("[0-9]+")){
                    y -= Integer.parseInt(st.substring(1));
                }if (st.charAt(0) == 'W' && st.substring(1).matches("[0-9]+")){
                    y += Integer.parseInt(st.substring(1));
                }
            }
            System.out.println(x + ","+ y);
        }
    }
}
