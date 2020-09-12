/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.util.*;

/**
 * 两数之和
 *  给出一个整数数组，请在数组中找出两个加起来等于目标值的数，
 * 你给出的函数twoSum 需要返回这两个数字的下标（index1，index2），需要满足 index1 小于index2.。注意：下标是从1开始的
 * 假设给出的数组中只存在唯一解
 * 例如：
 *
 * 给出的数组为 {2, 7, 11, 15},目标值为9
 * 输出 index1=1, index2=2
 */
public class Solution {
    /**
     *
     * @param numbers int整型一维数组
     * @param target int整型
     * @return int整型一维数组
     */
    public int[] twoSum (int[] numbers, int target) {
        // write code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])){
                return new int[]{map.get(target - numbers[i]) , i + 1};
            } else {
                map.put(numbers[i] , i + 1);
            }
        }
        return new int[]{-1,-1};
    }
}
