/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 旋转数组的最小数字
 */
public class Solution {
    public int minNumberInRotateArray(int [] array) {
        if (array.length == 0){
            return 0;
        }
        if (array.length == 1){
            return array[0];
        }
        int min = array[0];

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < min){
                min = array[i];
            }
        }
        return min;
    }
    public int minNumberInRotateArray1(int [] array) {
        if (array == null || array.length == 0) return 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) min = array[i];
        }
        return min;
    }
}
