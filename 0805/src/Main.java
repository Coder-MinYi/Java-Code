/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 连续子数组的最大和
 * 例如:{6,-3,-2,7,-15,1,2,2},连续子向量的最大和为8(从第0个开始,到第3个为止)。
 * 给一个数组，返回它的最大连续子序列的和，
 */
public class Main {
    public int FindGreatestSumOfSubArray(int[] array) {
        if(array.length == 0){
            return -1;
        }
        int sum = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {

            if (sum < 0){
                sum = 0;
            }
            sum += array[i];
            max = Math.max(sum,max);
        }
        return max;
    }
}
