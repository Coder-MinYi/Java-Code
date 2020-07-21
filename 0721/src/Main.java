import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * import java.util.Scanner;
 *
 * /**
 *  * Created with InteIIiJ IDEA.
 *  * Description:
 *  * User:MINYI
 *  * Date:
 *  * Time:
 *  */

/**
 * 数组中值出现了一次的数字
 * 给定一个数字arr，其中只有有两个数字出现了奇数次，
 * 其它数字都出现了偶数次，按照从小到大顺序输出这两个数。
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();
            int[] m = new int[n];
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                m[i] = sc.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (map.get(m[i]) == null) {
                    map.put(m[i], 1);
                } else {
                    map.put(m[i], map.get(m[i]) + 1);
                }
            }
            Set<Integer> set = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                if (map.get(m[i]) % 2 == 1) {
                    set.add(m[i]);
                }
                for (Integer h : set) {
                    System.out.print(h + " ");
                }
                //System.out.println(set.toString());
            }
        }
    }
}
