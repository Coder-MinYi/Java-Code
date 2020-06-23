import java.util.*;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 微信红包
 *
 */
public class Gift {
    public static int getValue(int[] gifts, int n) {
        // write code here
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.get(gifts[i]) == null){
                map.put(gifts[i],1);
            }else {
                map.put(gifts[i],map.get(gifts[i]) + 1);
            }
        }
        for (int j = 0; j < n; j++) {
            if (map.get(gifts[j]) > n / 2){
                return gifts[j];
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] m = {1,2,3,2,2};
        int n = 5;
        System.out.println(getValue(m, n));
    }
}
