import java.util.HashMap;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
//num1,num2分别为长度为1的数组。传出参数
//将num1[0],num2[0]设置为返回结果

/**
 * 数组中只出现一次的数字（有两个）
  */
public class Solution1 {
    public void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (map.containsKey(array[i])){
                map.remove(array[i]);
            }else {
                map.put(array[i],array[i]);
            }
        }
        boolean flag = true;
        //int[] num = new int[1];
        for (int i: array) {
            if (map.containsKey(i)){
                if (flag){
                    num1[0] = map.get(i);
                    flag = false;
                }else {
                    num2[0] = map.get(i);
                }
            }
        }
    }
}
