import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestDemo2 {
    //输入描述:每组数据输入一个字符串，字符串最大长度为100，且只包含字母，不可能为空串，区分大小写。
    //输出描述:每组数据一行，按字符串原有的字符顺序，输出字符集合，即重复出现并靠后的字母不输出。
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        StringBuffer ret = new StringBuffer();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            String tmp = ret.toString();
            if (!tmp.contains(ch+"")){
                ret.append(ch);
            }
        }
    System.out.println(ret);
    }

}




