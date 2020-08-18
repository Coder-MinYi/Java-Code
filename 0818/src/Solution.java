import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 最小K个数
 */
public class Solution {
        public ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            if (k <= 0 || k > input.length){
                return arrayList;
            }
            Arrays.sort(input);
            for (int i = 0; i < k; i++) {
                arrayList.add(input[i]);
            }
            return arrayList;
    }
}
