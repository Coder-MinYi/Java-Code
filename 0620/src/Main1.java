import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 统计同成绩学生人数
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            int N = sc.nextInt();
            if (N == 0){
                break;
            }
            int[] n = new int[N];
            for (int i = 0; i < N; i++) {
                n[i] = sc.nextInt();
            }
            int M = sc.nextInt();
            int count = 0;
            for (int i = 0; i < N; i++) {
                if (n[i] == M){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
