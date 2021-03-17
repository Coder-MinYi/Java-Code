/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class BinarySearch {
    public static int binarysearch(int[] array, int m){
        int left = 0;
        int right = array.length;
        //[left , right)  左闭右开区间
        int size = right - left;
        while (size > 0){
            int mid = (left + right) / 2;
            if (m == array[mid]){
                return mid;
            }else if (m > array[mid]){
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return -1;
     }
}
