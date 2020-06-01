import java.util.*;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestDemo {

    public  static class Finder {
        public  int partition(int[] array,int low,int high) {
            int tmp = array[low];
            while (low < high) {
                while (low < high && array[high] >= tmp) {
                    high--;
                }
                array[low] = array[high];
                while (low < high && array[low] <= tmp) {
                    low++;
                }
                array[high] = array[low];
            }
            array[low] = tmp;
            return low;
        }
        public void quick(int[] a, int letf, int right) {
            // write code here
            if(letf >= right) {
                return;
            }
            int par = partition(a, letf, right);
            quick(a,letf,par-1);
            quick(a,par+1,right);
        }
        public  int findKth(int[] a, int n, int K){
            quick(a,0,n-1);
            int[] ret = a;
            return ret[K-1];
        }
    }
    public static void main(String[] args) {
        Finder finder = new Finder();
        int[] a = {33,3,7,87,4};
        System.out.println(finder.findKth(a, a.length, 2));
    }
}
