/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.util.*;

public class Count2 {
    public int countNumberOf2s(int n) {
        // write code here
//        int tmp = 0;
//        while (n >= 10){
//            n = n / 10;
//            tmp++;
//        }
//        tmp = tmp + 1;
          //int count = 0;
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j <= tmp; j++) {
//                if (n / Math.pow(10,j) == 2){
//                    count++;
//                }
//            }
//        }

        //return count;
        if (n <= 1) return 0;
        int res = 0;
        int m = 0;
        for (m = 1;m <= n;m *= 10) {
            int tmp1 = n / m, tmp2 = n%m;

            res += (tmp1 + 7) / 10 * m + !(2 != tmp1 % 10) *(tmp2 + 1);
        }
        return res;
    }
    }
}
