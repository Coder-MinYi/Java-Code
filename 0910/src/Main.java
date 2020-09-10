/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
//子数组的最大累加问题
public class Main {
    public int maxsumofSubarray (int[] arr) {
        // write code here
        if (arr.length == 0 || arr == null){
            return 0;
        }
        int sum = arr[0];
        int max = 0;
        for (int i = 1; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum > max){
                max = sum;
            }else {
                sum = 0;
            }
        }
        return max;
    }
}
