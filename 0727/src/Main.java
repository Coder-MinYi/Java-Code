import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 题目：数组中重复的数字
 *
 * 在一个长度为n的数组里的所有数字都在0到n-1的范围内。
 * 数组中某些数字是重复的，但不知道有几个数字是重复的。
 * 也不知道每个数字重复几次。请找出数组中任意一个重复的数字。
 * 例如，如果输入长度为7的数组{2,3,1,0,2,5,3}，那么对应的输出是第一个重复的数字2。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){

        }
    }
    public boolean duplicate(int numbers[],int length,int [] duplication) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < length; i++) {
        if (!list.contains(numbers[i])) {
                list.add(numbers[i]);
        }else {
                duplication[0] = numbers[i];
                return true;
             }
        }
        return false;
    }
}
