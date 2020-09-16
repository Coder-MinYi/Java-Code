/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 判断一个数是不是二的幂次方
 *
 * 按位与运算(&)运算规则：
 * 0 & 0 = 0
 * 0 & 1 = 0
 * 1 & 0 = 0
 * 1 & 1 = 1
 *
 * 2^n的二进制数第一位为1，其余位为0
 * 2^n - 1的二进制数第一位为0，其余位为1
 *
 * 根据按位与运算规则(2^n)&(2^n - 1)的二进制为0
 *
 * 所以根据N&(N-1)是否为0可判断N是否是2的幂
 *
 */
public class Main {
    public boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
