/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.util.Scanner;

/**
 * @author: ycz
 * @date: 2018/12/21 0021 14:42
 * @description:
 */
public class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int[] nums = new int[count];
        int[] result = new int[5];
        for (int i=0;i<count;i++){
            nums[i] = sc.nextInt();
        }
        boolean flag = true;
        int c4Count = 0;
        for (int num : nums){
            switch (num%5){
                case 0:
                    if (num%2 == 0){
                        result[0] += num;
                    }
                    break;
                case 1:
                    if (flag){
                        result[1] += num;
                        flag = false;
                    }else {
                        result[1] -= num;
                        flag = true;
                    }
                    break;
                case 2:
                    result[2]++;
                    break;
                case 3:
                    result[3] += num;
                    c4Count++;
                    break;
                case 4:
                    if (num > result[4]){
                        result[4] = num;
                    }
                    break;
                default:
                    throw new RuntimeException("错误");
            }
        }
        print(result,c4Count);
    }
    private static void print(int[] nums,int count){
        for (int i=0;i<nums.length;i++){

            if (i == nums.length-1) {
                if (nums[i] == 0) {
                    System.out.print("N");
                } else {
                    System.out.print(nums[i]);
                }
            }else if (i == 3){
                if (count != 0){
                    System.out.printf("%.1f ",(double)nums[3]/count);
                }else {
                    System.out.print("N ");
                }
            } else {
                if (nums[i] == 0){
                    System.out.print("N ");
                }else {
                    System.out.print(nums[i]+" ");
                }
            }
        }
    }
}
