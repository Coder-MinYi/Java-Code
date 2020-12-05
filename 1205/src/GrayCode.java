/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.util.*;
/*  shengc格雷码
递归

    //递归的思路是n位gray码是由n-1位gray码生成，举个例子简单一些：

    //比如求n=3的gray码，首先知道n=2的gray码是(00,01,11,10)

    //那么n=3的gray码其实就是对n=2的gray码首位添加0或1生成的，添加0后变成(000,001,011,010)

    //添加1后需要顺序反向就变成(110,111,101,100)

    //组合在一起就是(000,001,011,010,110,111,101,100)
 */
public class GrayCode {
    public String[] getGray(int n) {
        // write code here
        int m = 1 << n;
        String[] strings = new String[m];

        if (n == 1) {
            strings[0] = "0";
            strings[1] = "1";
        } else {
            String[] tmp = getGray(n - 1);
            int j = 0;
            for (int i = 0; i < m; i++) {

                if (i < m / 2) {
                    strings[i] = "0" + tmp[j++];
                } else {
                    strings[i] = "1" + tmp[--j];
                }
            }
        }
        return strings;
    }

    public String[] getGray1(int n) {
        //int m = 1 << n;
        String[] strings = null;

        if (n == 1) {
            strings = new String[]{"0", "1"};
        } else {
            String[] tmp = getGray(n - 1);
            strings = new String[2 * tmp.length];
            for (int i = 0; i < tmp.length; i++) {
                strings[i] = "0" + tmp[i];
                strings[strings.length - 1 - i] = "1" + tmp[i];
            }

        }
        return strings;
    }
}