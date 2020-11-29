import java.util.HashMap;
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main1 {
    static int i = 0;
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] a = new int[100];
            //int i =0;
            while(sc.hasNext()) {
                a[i] = sc.nextInt();
                i++;
            }
            HashMap<Integer , Integer> map = new HashMap<>();
            for (int j = 0; j < a.length; j++) {
                if (!map.containsKey(a[i])){
                    map.put(a[i] , 1);
                }else {
                    map.put(a[i] , map.get(a[i]) + 1);
                }
            }
        for (int j = 0; j < a.length; j++) {
            if (map.get(a[i]) > a.length / 2){
                System.out.println(a[i]);
            }else {
                System.out.println(0);
            }
        }
    }
}
