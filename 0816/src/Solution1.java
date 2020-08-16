/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.util.ArrayList;
public class Solution {
    public ArrayList<Integer> printMatrix(int [][] matrix) {
        int starX = 0;
        int endX = matrix[0].length;
        int starY = 0;
        int endY = matrix.length -1;
        int[] array = new int[matrix[0].length*matrix.length];

        int index = 0;
        while (starX <= endX && starY <= endY){
            //从左往右打印
            if (starX <= endX){
                for (int i = starX; i <= endX; i++) {
                    array[index++] = matrix[starY][i];
                }
            }
            //从上往下打印
            if (starY < endY){
                for (int i = starY + 1; i <= endY; i++) {
                    array[index++] = matrix[i][endX];
                }
            }
            //从右往左打印
            if (starX < endX && endY > starY){
                for (int i = endX -1 ; i >= starX ; i--) {
                    array[index++] = matrix[endY][i];
                }
            }
            //从下往上打印
            if (starY < endY && endX > starX){
                for (int i = endY -1 ; i >= starY + 1; i--) {
                    array[index++] = matrix[i][starX];
                }
            }
            starX++;
            endX--;
            starY++;
            endY--;
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            arrayList.add(array[i]);
        }
        return arrayList;
    }
}
