/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 调整数组顺序使奇数位于偶数之前，且奇数与奇数，偶素与偶数相对位置不变
 */
public class Solution {
    public static void reOrderArray(int [] array) {
        int num1 =0;//偶数的个数
        int num2 =0;//奇数的个数
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                num1++;
            }else{
                num2++;
            }
        }
        int[] array1 = new int[num1];
        int[] array2 = new int[num2];

        int j=0;
        int k=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0){
                array1[j] = array[i];
                j++;
            }else{
                array2[k] = array[i];
                k++;
            }
        }

        for(int i=0;i<array2.length;i++){
            array[i] = array2[i];
        }
        for(int i=0;i<array1.length;i++){
            array[i+array2.length] = array1[i];
        }
        for(int e:array){
            System.out.print(e+" ");
        }

    }
}