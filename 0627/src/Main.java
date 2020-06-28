/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

import sun.awt.windows.WPrinterJob;

import java.util.Scanner;

/**
 * 数字分类
 */

public class Main {
    public static void func(int[] nums){
        int[] A = new int[5];
        boolean flag = true;
        //int count = 0;
        int tmp = 0;
        for (int num: nums) {
            switch (num % 5){
                case 0:
                    if (num % 2 == 0){
                        A[0] += num;
                    }
                    break;
                case 1:
                    if (flag){
                        A[1] += num;
                        flag = false;
                    }else {
                        A[1] -= num;
                        flag = true;
                    }
                    break;
                case 2:
                    A[2]++;
                    break;
                case 3:
                    A[3] += num;
                    tmp++;
                    break;
                case 4:
                    if (num > A[4]){
                        A[4] = num;
                    }
                    break;
                default:
                    throw new RuntimeException("错误");
            }
        }
        print(A,tmp);
    }
    private static void print(int[] nums ,int tmp) {
        for (int i=0;i<nums.length;i++){

            if (i == nums.length-1) {
                if (nums[i] == 0) {
                    System.out.print("N");
                } else {
                    System.out.print(nums[i]);
                }
            }else if (i == 3){
                if (tmp != 0){
                    System.out.printf("%.1f ",(double)nums[3]/tmp);
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int m = sc.nextInt();
            int[] nums = new int[m];
            for (int i = 0; i < m; i++) {
                 nums[i] = sc.nextInt();
                 func(nums);
        }
    }
}
