/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

import java.util.ArrayList;
//构造乘积数组

public class Solution {
    public int[] multiply(int[] A) {
        int[] B = new int[A.length];
        if (A.length == 0){
            return B;
        }
        B[0] = 1;
        for (int i = 1; i < A.length; i++) {
            B[i] = B[i -1]*A[i -1];
        }
        int ret = 1;
        for (int j = A.length -2; j >= 0 ; j--) {
            ret *= A[j +1];
            B[j] *= ret;
        }
        return B;
    }
}