/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.util.*;

//判断一个数是否是回文数
public class Solution {
    /**
     *
     * @param x int整型
     * @return bool布尔型
     */
    public boolean isPalindrome (int x) {
        // write code here
        if (x < 0){
            return false;
        }
        int m = x;
        int n = 0;

        while (m != 0){
            n *= 10;
            n += m % 0;
            m = m / 10;
        }
        if (n > Integer.MAX_VALUE){
            return false;
        }
        return x == n;
    }
}
