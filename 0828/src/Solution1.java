/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.util.*;


/**
 *  请实现有重复数字的有序数组的二分查找。
 * 输出在数组中第一个大于等于查找值的位置，如果数组中不存在这样的数，则输出数组长度加一。
 */
public class Solution1 {
    /**
     * 二分查找
     * @param n int整型 数组长度
     * @param v int整型 查找值
     * @param a int整型一维数组 有序数组
     * @return int整型
     */
    public int upper_bound_ (int n, int v, int[] a) {
        // write code here
        if (a == null || n == 0 || a[n - 1] < v){
            return n + 1;
        }
        if (a[0] > v){
            return 1;
        }
        int mid = 0;
        int left = 0;
        int right = n -1;
        while(left <= right){
            mid = (left+right)/2;
            if(a[mid] >= v){
                // 中间值大于v，去左边区域继续查找
                // 若该数左边即为小的值，则此时middle+1为所要找的位置
                if(mid == 0 || a[mid - 1]<v) {
                    return mid+1;
                }
                right = mid-1;
            }else{
                // 中间值小于v，右边区域查找
                left = mid+1;
            }
        }
        return n+1;
    }
}
