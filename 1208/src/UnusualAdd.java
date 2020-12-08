/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.util.*;
/*
另类加法

思路：肯定是用位运算，我记得位运算A^B是不考虑进位的结果，（A&B）<<1是求得的进位
因此A^B+（A&B）<<1的结果就是和，只要（A&B）<<1=0，两项就变成了一项，不需要加法了
*/

public class UnusualAdd {
    public int addAB(int A, int B) {
        // write code here
        while (B != 0) { //当进位为零，则已经得出加值
            int tmp = A ^ B; //不考虑进位
            int num = (A & B) << 1; //进位

            B = num;
            A = tmp;
        }
        return A;
    }
}