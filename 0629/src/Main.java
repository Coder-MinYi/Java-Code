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

        int n = sc.nextInt();
        //学分数组
        int[] sorce = new int[n];
        //成绩数组
        int[] m = new int[n];
        //总的学分
        int count = 0;
        //绩点数组
        //double[] gaps = new double[n];
        for (int i = 0; i < n; i++) {
            sorce[i] = sc.nextInt();
            count += sorce[i];
        }
        for (int i = 0; i < n; i++) {
            m[i] = sc.nextInt();
        }
        double[] sorc = new double[n];
        for (int i = 0; i < n; i++) {
            if (90 <=sorce[i] && sorce[i] <= 100){
                sorc[i] = 4.0;
            }if (85 <=sorce[i] && sorce[i] <= 89){
                sorc[i] = 3.7;
            }if (82 <=sorce[i] && sorce[i] <= 84){
                sorc[i] = 3.3;
            }if (78 <=sorce[i] && sorce[i] <= 81){
                sorc[i] = 3.0;
            }if (75 <=sorce[i] && sorce[i] <= 77){
                sorc[i] = 2.7;
            }if (72 <=sorce[i] && sorce[i] <= 74){
                sorc[i] = 2.3;
            }if (68 <=sorce[i] && sorce[i] <= 71){
                sorc[i] = 2.0;
            }if (64 <=sorce[i] && sorce[i] <= 67){
                sorc[i] = 1.5;
            }if (60 <=sorce[i] && sorce[i] <= 63){
                sorc[i] = 1.0;
            }if (sorce[i] < 60){
                sorc[i] = 0;
            }
        }
        double sum = 0;
        double[] f = new double[n];
        //绩点总和
        for (int i = 0; i < n; i++) {
            f[i] = sorce[i] * sorc[i];
            sum += f[i];
        }
        double Gap = sum / count;
        System.out.printf("%.2f",Gap);
    }
}
