/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main1 {
    /**
     * 用来记录甲胜利的次数
     */
    private static int FIRST = 0;

    /**
     * 记录平局的次数
     */
    private static int DRAW = 0;

    /**
     * 用来表示所出的手势
     */
    private static char[] CHARS = new char[] {'C', 'J', 'B'};

    /**
     * 用来记录甲胜利的手势和手势所对应的次数
     */
    private static Map<Character, Integer> MAP_FIRST = new HashMap<>(16);

    /**
     * 用来记录乙胜利的手势和手势所对应的次数
     */
    private static Map<Character, Integer> MAP_SECOND = new HashMap<>(16);

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //双方交锋次数
        int num = Integer.parseInt(sc.nextLine());

        //双方交锋的手势情况
        String[] str = new String[num];

        for (int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
        }


        // 遍历双方交锋的手势情况
        for (int k = 0; k < str.length; k++) {
            String s = str[k];
            char[] arr = new char[2];
            arr[0] = s.charAt(0);
            arr[1] = s.charAt(2);

            //用来判别只有一组数据  例如：C J 代表甲获胜最多的是C  乙获胜最多的是B(提交没有case过的例子，有点懵)
            if (num == 1 && isWin(arr)) {

                //将甲获胜的手势记录到甲对应map中
                counts(MAP_FIRST, arr[0]);

                for (int i = 0; i < CHARS.length; i++) {

                    //找出乙获胜的手势
                    if (CHARS[i] != arr[0] && CHARS[i] != arr[1]) {

                        //将乙获胜的手势记录到乙对应map中
                        counts(MAP_SECOND, CHARS[i]);
                    }
                }
                break;

                //用来判别只有一组数据   乙获胜
            } else if (num == 1 && isWin(arr) && !isDraw(arr)) {
                //将乙获胜的手势记录到甲对应map中
                counts(MAP_SECOND, arr[1]);
                for (int i = 0; i < CHARS.length; i++) {

                    //找出甲获胜的手势
                    if (CHARS[i] != arr[0] && CHARS[i] != arr[1]) {
                        //将甲获胜的手势记录到甲对应map中
                        counts(MAP_FIRST, CHARS[i]);
                    }
                }
                break;
            } else {
                //如果是平局什么都不做，继续判断下一组手势
                if (isDraw(arr)) {
                    continue;

                    //如果甲获胜
                } else if (isWin(arr)) {

                    //将甲获胜的手势记录到甲对应map中
                    counts(MAP_FIRST, arr[0]);

                    //如果乙获胜
                } else if (!isWin(arr) && !isDraw(arr)) {

                    //将乙获胜的手势记录到乙对应map中
                    counts(MAP_SECOND, arr[1]);
                }
            }
        }

        //甲的胜、平、负次数
        System.out.println(FIRST + " " + DRAW  + " " + (num - FIRST - DRAW));

        //乙的胜、平、负次数
        System.out.println((num - FIRST - DRAW) + " " + DRAW + " " + FIRST);

        //甲、乙获胜次数最多的手势
        System.out.println(findWins(MAP_FIRST) + " " + findWins(MAP_SECOND));
    }

    /**
     * 判断是甲赢了还是乙赢了
     * 如果甲赢了FIRST++
     * @param arr 甲乙交锋的手势情况
     * @return true代表甲获胜了；false代表乙获胜了
     */
    private static boolean isWin(char[] arr) {
        if (arr[0] == 'C' && arr[1] == 'J') {
            FIRST++;
            return true;
        } else if (arr[0] == 'J' && arr[1] == 'B') {
            FIRST++;
            return true;
        }else if (arr[0] == 'B' && arr[1] == 'C') {
            FIRST++;
            return true;
        }

        //排除不是平局的情况，才能确定是乙赢了
        if (!isDraw(arr)) {
            return false;
        }

        return false;
    }

    /**
     * 判断是否是平局
     * 是平局DRAW++
     * @param arr 甲乙交锋手势情况
     * @return true表示是平局； false表示不是平局
     */
    private static boolean isDraw(char[] arr) {
        if (arr[0] == 'C' && arr[1] == 'C') {
            DRAW++;
            return true;
        }else if (arr[0] == 'J' && arr[1] == 'J') {
            DRAW++;
            return true;
        }else if (arr[0] == 'B' && arr[1] == 'B') {
            DRAW++;
            return true;
        } else {
            return false;
        }
    }

    /**
     * 用Map来记录甲或者乙胜利时候的手势以及次数
     * @param map 记录胜利时候的手势和次数的容器
     * @param c 胜利时的手势
     */
    private static void counts(Map<Character, Integer> map ,char c) {
        int n = map.getOrDefault(c, 0);
        map.put(c, n + 1);
    }

    /**
     * 要求输出按字母序最小的解
     * 通过此方法寻找最小解
     * @param map 记录胜利时手势的容器
     * @return 最小解
     */
    private static char findWins(Map<Character, Integer> map) {
        //赋给其超过'C' 'J' 'B'值的字母，来寻找字母序小的胜利手势
        char firstWin ='Z';

        //胜利手势的次数
        int firstCount = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            char key = entry.getKey();
            int  val = entry.getValue();
            //当胜利手势次数大于之前的时候  并且  字母序小 就去判断
            if (val > firstCount && key < firstWin) {
                firstWin = key;
                firstCount = val;
            }
        }
        return firstWin;
    }
}