/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

import java.util.Arrays;

/**
 * 扑克牌顺子
 */
public class Main {
    public boolean isContinuous(int [] numbers) {
        if(numbers == null || numbers.length<1) {
            return false;
        }
        Arrays.sort(numbers);
        int zero = 0;
        //统计大小王的个数
        for(int i=0;i<numbers.length;i++){
            if(numbers[i] == 0) {
                zero++;
            }
            else {
                break;
            }
        }
        int gap = 0;
        for(int i=zero;i<numbers.length-1;i++){
            //有相同的牌  ，返回false
            if(numbers[i+1]-numbers[i] == 0){
                return false;
            }
            //所有数相差数字的总合（减去连续数字相差的1）
            gap += numbers[i+1]-numbers[i]-1;
        }
        //zero可以当任意数，故zero的总值大于等于gap，就能满足连续扑克牌
        if(zero >= gap){
            return true;
        }
        else{
            return false;
        }
    }
}
