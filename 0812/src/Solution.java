/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 矩阵覆盖
 *  我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 *  请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *  比如n=3时，2*3的矩形块有3种覆盖方法：
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(RectCover(5));
        System.out.println(Diedai(5));
    }
    //递归解法
    public static int RectCover(int target) {
        if (target <= 0){
            return 0;
        }
        if (target <= 2){
            return target;
        }else {
            return RectCover(target - 1) + RectCover(target - 2);
        }
    }
    //迭代写法
    public static int Diedai(int n){
        if (n == 1 || n == 0 || n == 2){
            return n;
        }
        int a = 1;
        int b = 2;
        int c = 0;

        for (int i = 3; i <= n; i++) {
            c = a+b;
            a = b;
            b = c;
        }
        return c;
    }
}
