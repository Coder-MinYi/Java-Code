import java.util.*;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int i = sc.nextInt();
            if (i > 1000) {
                i = 999;
            }
            List<Integer> list = new ArrayList<>();
            for (int j = 0; j < i; j++) {
                list.add(j);
            }
            int k = 0;
            while (list.size() > 1) {
                //顺序表循环
                k = (k + 2) % list.size();
                list.remove(k);
            }
            System.out.println(list.get(0));
        }
    }
}