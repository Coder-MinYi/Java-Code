import java.util.Arrays;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 有一个二维数组(n*n),写程序实现从右上角到左下角沿主对角线方向打印。
 *
 * 给定一个二位数组arr及题目中的参数n，请返回结果数组。
 *
 */
public class Main {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int n = arr[0].length;
        System.out.println(Arrays.toString(arrayPrint1(arr,n)));
        System.out.println(Arrays.toString(arrayPrint(arr,n)));
    }
    public static int[] arrayPrint(int[][] arr, int n) {
        int [] m = new int[n*n];
        
        int  index = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i+1; j++) {
                m[index] = arr[j][n - 1- i + j];
                index++;
            }
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                m[index] = arr[i+j][j];
                index++;
            }            
        }
        return m;
    }
    public static int[] arrayPrint1(int[][] arr, int n) {
        // write code here
        //   if(n<1) return -1;
        //打印上三角包括中间00-nn的对角线
        int [] out=new int[n*n];
        int index=0;
        for(int j=n-1;j>=0;j--){
            int k=j;
            for(int i=0;i<n-j;i++){
                out[index++]=arr[i][k++];
            }
        }
        //打印剩下的下三角
        for(int i=1;i<n;i++){
            int k=i;
            for(int j=0;j<n-i;j++){
                out[index++]=arr[k++][j];
            }
        }
        return out;
    }
}
