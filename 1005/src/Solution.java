/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Solution {
    /**
     * 二分查找
     * @param n int整型 数组长度
     * @param v int整型 查找值
     * @param a int整型一维数组 有序数组
     * @return int整型
     */
    public int upper_bound_ (int n, int v, int[] a) {
        if (a[n - 1] < v){
            return n + 1;
        }
        int left = 0;
        int right = n - 1;
        int mid = 0;
        while (left <= right){
            mid = (left + right)/2;
            if (a[mid] >= v){
                if (mid == 0 || a[mid - 1] < v){
                    return mid + 1;
                }
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return n + 1;
    }
}
