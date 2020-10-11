import java.util.HashMap;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Solution {
    /**
     *
     * @param peoples string字符串
     * @return int整型
     */
    public int lineup (String peoples) {
        // write code here
        return 0;
    }

    /**
     * 删除重复元素
     * @param array int整型一维数组
     * @return int整型一维数组
     */
    public int[] removeDuplicate (int[] array) {
        // write code here
        if (array == null || array.length == 1){
            return array;
        }
        HashMap<Integer ,Integer> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])){
                map.put(array[i],map.get(array[i]) + 1);
            }else {
                map.put(array[i] , 1);
            }
        }
        int[] m = new int[map.size()];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) == 1){
                m[index++] = array[i];
            }else {
                map.put(array[i], map.get(array[i]) - 1);
            }
        }
        return m;
    }
}
