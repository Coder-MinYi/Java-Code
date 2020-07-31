/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 不用加减乘除做加法
 *
 */
public class Soultion {
    //1.直接调用库函数Math.add
    public int Add(int num1,int num2) {
            return Math.addExact(num1,num2);
    }
    //2.位运算
    public int Add1(int num1, int num2){
        while (num2 != 0){
            int tmp = num1 ^ num2; //两个数异或：相当于每一位相加，而不考虑进位

            num2 = (num1 & num2) << 1; //两个数相与，并左移一位：相当于求得进位；

            num1 = tmp;
        }
        return num1;
    }
}
