/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 二维数组中的查找
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 */
public class Solution {
    public boolean Find(int target, int [][] array) {
        if (array == null){
            return false;
        }
        int rows = array.length;
        int cols = array[0].length;

        if (rows <= 0 || cols <= 0){
            return false;
        }

        int row = 0;
        int col = cols - 1;

        while (row < rows && col >= 0){
            if (array[row][col] > target){
                col--;
            }else if(array[row][col] < target){
                row++;
            }else {
                return true;
            }
        }
        return false;
    }

    /**
     * 替换空格
     * 请实现一个函数，将一个字符串中的每个空格替换成“%20”。
     * 例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
     * @param str
     * @return
     */
    public String replaceSpace(StringBuffer str) {
        String s = str.toString();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                sb.append('%');
                sb.append('2');
                sb.append('0');
            } else {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
