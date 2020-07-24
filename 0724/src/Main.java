import java.util.HashMap;
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            int[] array = new int[n];
            for (int i = 0; i <n ; i++) {
               array[i] = sc.nextInt();
            }
            System.out.println(MoreThanHalfNum_Solution(array));
        }
    }
    public static int MoreThanHalfNum_Solution(int [] array) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < array.length; i++) {
            if (!map.containsKey(array[i])){
                map.put(array[i],1);
            }else {
                map.put(array[i],map.get(array[i]) + 1);
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i]) > array.length / 2){
                return array[i];
            }
        }
        return 0;
    }
}
