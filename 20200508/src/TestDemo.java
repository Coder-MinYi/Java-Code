import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestDemo {
    //字符串在n处逆置前后
    public static String func(String str, int n){
        str = reverse(str,0,n-1);
        str = reverse(str,n,str.length()-1);
        str = reverse(str,0,str.length()-1);
        return str;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        System.out.println(func(str,n));

    }
    //逆置字符串
    public static String reverse(String str,int begin,int end) {
        char[] ch = str.toCharArray();
        while(begin < end){
            char tmp = ch[begin];
            ch[begin] = ch[end];
            ch[end] = tmp;
            begin++;
            end--;
        }
        String ret = new String(ch);
        return ret;
    }

    public static void main2(String[] args) {
        String str = "abcdefg";
        String ret = reverse(str,0,str.length()-1);
        System.out.println(ret);
    }




    //不借用任何字符串库函数实现无冗余地接受两个字符串，然后把它们无冗余的连接起来。
    public static String func(String str){
        String[] strings = str.split(" ");
        String ret = "";
        for(String s : strings){
            ret += s;
        }
        return  ret;
    }
    public static void main1(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        String ret = func(str);
        System.out.println(ret);
        System.out.println("==================");

    }
}
