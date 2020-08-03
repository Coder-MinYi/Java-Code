import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Soultino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] input = {4,5,1,6,2,7,3,8};
        System.out.println(GetLeastNumbers_Solution(input, 4));
        System.out.println(GetLeastNumbers_Solution1(input, 4));
    }
    public static ArrayList<Integer> GetLeastNumbers_Solution(int [] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Arrays.sort(input);
        if (input.length < k | k <= 0){
            return arrayList;
        }else {
            for (int i = 0; i < k; i++) {
                arrayList.add(input[i]);
            }
        }
        return arrayList;
    }
    public static ArrayList<Integer> GetLeastNumbers_Solution1(int [] input, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < input.length - i - 1; j++) {
                if (input[j] < input[j+1]){
                    int tmp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = tmp;
                }
            }
           // arrayList.add(input[input.length - i - 1]);
        }
        for(int i = 0;i < k;i++){
            arrayList.add(input[i]);
        }
        return arrayList;
    }
    public ArrayList<Integer> GetLeastNumbers_Solution2(int [] input, int k) {
        Arrays.sort(input);//快速排序
        ArrayList<Integer> list=new ArrayList<Integer>();
        if(k>input.length|k<=0){//判断是否存在越界
            return list;
        }else{for (int i = 0; i < k; i++) {
            list.add(input[i]);
        }
        return list;
        }
    }
}

