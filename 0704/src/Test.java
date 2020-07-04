import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 密码验证合格程序
 */
public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();

            System.out.println(func(str));
        }
    }

    private static String func(String str) {
        //1.判断长度是否超过八位
        if (str.length() <= 8){
            return "NG";
        }
        //2.判断是否包含大小写字母，数字，其他符号中的至少三种
        //boolean num = false;
        //boolean big = false;
        //boolean small = false;
        //boolean other = false;
        boolean[] num = new boolean[4];
        for (int i = 0; i < str.length(); i++) {
            if (48 <= str.charAt(i) && str.charAt(i) <= 57){
                num[0] = true;
            }if (65 <= str.charAt(i) && str.charAt(i) <= 90){
                num[1] = true;
            }if (97 <= str.charAt(i) && str.charAt(i) <= 122){
                num[2] = true;
            }else {
                num[3] = true;
            }
        }
        int count = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == true){
                count++;
            }
        }
        if (count < 3){
            return "NG";
        }
        //3.判断是否有长度超过2的子串重复
        for (int i = 0; i < str.length()-3; i++) {
            for (int j = i+1; j < str.length()-3; j++) {
                if (str.substring(i,i+3).equals(str.substring(j,j+3))){
                    return "NG";
                }
            }
        }
        return "OK";
    }
}
