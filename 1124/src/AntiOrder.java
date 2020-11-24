/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.util.*;

public class AntiOrder {
    public int count(int[] A, int n) {
        // write code here
        if (n > 5000){
            return 0;
        }
        int count = 0;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                if (A[i] > A[j]){
                    count++;
                }
            }

        }
        return count;
    }
}
