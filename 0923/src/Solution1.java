/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.util.*;


public class Solution1 {
    public static void main(String[] args) {
        int[][] m = {{2,8,4},{2,5,0},{10,9,8}};
        int[][] n = {{2,11,3},{15,10,7},{9,17,12},{8,1,14}};
        System.out.println(getTriggerTime(m, n).toString().toCharArray());
    }
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     * func getTriggerTime(increase [][]int, requirements [][]int) []int
     *
     * @param increase     int整型二维数组 属性增加值
     * @param requirements int整型二维数组 剧情触发要求
     * @return int整型一维数组
     */
    public static int[] getTriggerTime(int[][] increase, int[][] requirements) {
        // write code here
        int[] m = new int[requirements.length];
        if (increase == null || requirements == null){
            return m;
        }
        int index = 0;
        for (int i = 0; i < increase.length; i++) {
            for (int j = 0; j < requirements.length; j++) {
                if (increase[i][0] >= requirements[j][0] && increase[i][1] >= requirements[j][1] && increase[i][2] >= requirements[j][2]) {
                    m[index++] = i;
                }
            }
            m[index++] = -1;
        }
        return m;
    }
}
