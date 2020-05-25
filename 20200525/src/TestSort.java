import java.util.Arrays;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestSort {
    public static void mergeNor(int[] array,int gap) {
        int[] ret = new int[array.length];
        int k = 0;//ret的下标
        int s1 = 0;
        int e1 = s1+gap-1;
        int s2 = e1+1;
        int e2 = s2+gap-1 < array.length ? s2+gap-1 :  array.length-1;

        //1、肯定是有两个归并段的
        while (s2 < array.length) {
            //2、对应的s1位置和s2位置进行比较
            while (s1 <= e1 && s2 <= e2 ){
            if (array[s1] >= array[s2]) {
                ret[k++] = array[s2++];
            }else {
                ret[k++] = array[s1++];
            }
            }
            //3、上述第2步在比较的过程当中，肯定会有一个下标先走完一个归并段
            while (s1 <= e1){
                ret[k++] = array[s1++];
            }
            while (s2 <= e2){
                ret[k++] = array[s2++];
            }
            //4、判断是谁没走完，把剩下的数据拷贝到结果数组当中

            //5、接着确定新的s1,e1,s2,e2
            s1 = e2 + 1;
            e1 = s1 + gap - 1;
            s2 = e1 + 1;
            e2 = s2+gap-1 < array.length ? s2+gap-1 :  array.length-1;

        }
        while (s1 <= array.length-1){
            ret[k++] = array[s1++];
        }
        for (int i = 0; i < ret.length; i++) {
            array[i] = ret[i];
        }

    }
    /**
     * 非递归实现归并排序
     * @param array
     */
    public static void mergeSort(int[] array) {
        for (int gap = 1; gap < array.length; gap *= 2) {
            mergeNor(array,gap);
        }
    }
    public static void main(String[] args) {
        int[] array2 = {9,87,5,98,13,35,99,100};
        System.out.println(Arrays.toString(array2));
        mergeSort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
