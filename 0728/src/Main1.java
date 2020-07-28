import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 统计一个数字在排序数组中出现的次数。
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] arr = new int [n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            System.out.println(GetNumberOfK(arr,k));
            System.out.println(GetNumberOfK1(arr,k));
        }
    }
    //暴力解法，直接遍历
    public static int GetNumberOfK(int [] array , int k) {
        int count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]==k)
                count++;
        }
        return count;
    }
    //双指针解法
    public static int GetNumberOfK1(int [] array, int k){
        int left = 0;
        int right = array.length -1;
        int count = 0;
        while (left <= right){
            if (array[left] < k){
                left++;
            }
            if (array[right] > k){
                right--;
            }
        }
        return right - left + 1;
    }
    //二分查找
//    public static int GetNumberOfK2(int [] array, int k){
//        if (array.length == 0){
//            return 0;
//        }
//        int firstK = FirstK(array,k,0,array.length -1);
//        int endK = EndK(array,k,0,array.length -1);
//
//        if(firstK != -1 && endK != -1){
//            return endK - firstK + 1;
//        }
//        return 0;
//    }
//    //循环写法
//    private static int EndK(int[] array, int k, int start, int end) {
//        int mid = (start + end) / 2;
//
//        while (start <= end){
//            if (array[mid] < k){
//                start = mid + 1;
//            }else if(array[mid] > k){
//                end = mid - 1;
//            }else if(mid -1 > start && array[mid-1] == k){
//                end = mid+1;
//            }else {
//                return mid;
//            }
//            mid = (start + end);
//        }
//        return -1;
//    }
//    //递归写法
//    private static int FirstK(int[] array, int k, int start, int end) {
//        if (start > end){
//            return -1;
//        }
//        int mid = (start + end) / 2;
//        if (array[mid] > k){
//            return FirstK(array,k,start,mid -1);
//        }else if (array[mid] < k){
//            return FirstK(array,k,mid + 1,end);
//        }else if(mid+1 < array.length && array[mid + 1] == k) {
//            return FirstK(array, k, mid + 1, mid - 1);
//        }else {
//            return mid;
//        }
//    }
    public static int GetNumberOfK3(int [] array, int k){
        int length = array.length;
        if(length == 0){
            return 0;
        }
        int firstK = getFirstK(array, k, 0, length-1);
        int lastK = getLastK(array, k, 0, length-1);
        if(firstK != -1 && lastK != -1){
            return lastK - firstK + 1;
        }
        return 0;
    }
    //递归写法
    private static int getFirstK(int [] array , int k, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = (start + end) >> 1;
        if(array[mid] > k){
            return getFirstK(array, k, start, mid-1);
        }else if (array[mid] < k){
            return getFirstK(array, k, mid+1, end);
        }else if(mid-1 >=0 && array[mid-1] == k){
            return getFirstK(array, k, start, mid-1);
        }else{
            return mid;
        }
    }
    //循环写法
    private static int getLastK(int [] array , int k, int start, int end){
        int length = array.length;
        int mid = (start + end) >> 1;
        while(start <= end){
            if(array[mid] > k){
                end = mid-1;
            }else if(array[mid] < k){
                start = mid+1;
            }else if(mid+1 < length && array[mid+1] == k){
                start = mid+1;
            }else{
                return mid;
            }
            mid = (start + end) >> 1;
        }
        return -1;
    }
}
