import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        while (sc.hasNext()){
            String str = sc.nextLine();
            System.out.println(func(str));
        }
        //System.out.println(Long.MAX_VALUE);
    }

    private static long func(String str) {
        int[] m = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35};
        char[] n = {'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w',
            'x','y','z'};
        char[] ch = str.toCharArray();
        long sum = 0;
        for (int i = ch.length - 1; i >= 0 ; i--) {
            for (int j = 0; j < n.length; j++) {
            if (ch[i] == n[j]){
                int tmp = (int) (m[j] *Math.pow(36,i));
                sum += tmp;
            }
        }
    }
        if (sum > Long.MAX_VALUE){
            sum = Long.MAX_VALUE;
        }
        if (sum < Long.MIN_VALUE){
            sum = Long.MIN_VALUE;
        }
        return sum;
}
}
