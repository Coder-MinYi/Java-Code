/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 顺时针打印矩阵
 */
public class Main1 {
    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int n = 2;
        int m = 2;
        System.out.println(clockwisePrint(mat,n,m).toString().toCharArray());
    }
    public static int[] clockwisePrint(int[][] mat, int n, int m) {
        // write code here
        int starX = 0;
        int endX = m - 1;
        int starY = 0;
        int endY = n -1;
        int[] array = new int[n*m];

        int index = 0;
        while (starX <= endX && starY <= endY){
            //从左往右打印
            if (starX <= endX){
                for (int i = starX; i <= endX; i++) {
                    array[index++] = mat[starY][i];
                 }
             }
            //从上往下打印
            if (starY < endY){
                for (int i = starY + 1; i <= endY; i++) {
                    array[index++] = mat[i][endX];
                }
            }
            //从右往左打印
            if (starX < endX && endY > starY){
                for (int i = endX -1 ; i >= starX ; i--) {
                    array[index++] = mat[endY][i];
                }
            }
            //从下往上打印
            if (starY < endY && endX > starX){
                for (int i = endY -1 ; i >= starY + 1; i--) {
                    array[index++] = mat[i][starX];
                }
            }
            starX++;
            endX--;
            starY++;
            endY--;
        }
        return array;
    }
}
