import java.util.*;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * word-break
 * 给定一个字符串str和一组单词dict，判断s可否用空格分开，分开的单词包含dict中的所有单词
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        Set<String> dict = new HashSet<>();
        for (int i = 0; i < n; i++) {
           dict.add(sc.next());
        }
    }
    //动态规划
    public boolean wordBreak(String str , Set<String> dict){
        if (str.length() == 0){
            return false;
        }
        boolean[] canBreak = new boolean[str.length() -1];

        for (int i = 1; i < str.length(); i++) {
            //整体（1，i)
            if (dict.contains(str.substring(0,i))){
                canBreak[i] = true;
                continue;
            }
            //j < i && F(j) && [j+1,i]
            for (int j = i - 1; j > 0 ; j--) {
                //F(j) && [j+1,i]
                if (canBreak[j] && dict.contains(str.substring(j,i))){
                    canBreak[i] = true;
                    break;
                }
            }
        }
        return canBreak[str.length() - 1];
    }
    //优化写法
    public boolean wordBreak1(String str , Set<String> dict){
        if (str.length() == 0){
            return false;
        }
        boolean[] canBreak = new boolean[str.length() -1];
        canBreak[0] = true;
        for (int i = 1; i < str.length(); i++) {
            //j < i && F(j) && [j+1,i]
            for (int j = i - 1; j >= 0 ; j--) {
                //F(j) && [j+1,i]
                if (canBreak[j] && dict.contains(str.substring(j,i))){
                    canBreak[i] = true;
                    break;
                }
            }
        }
        return canBreak[str.length() - 1];
    }
}
