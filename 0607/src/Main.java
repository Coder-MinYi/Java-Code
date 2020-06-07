import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

public class Main {
    public static void func (int y1,int y2,int y3, int y4 ){
        float A =(y1 + y3) / 2F;
        float B =(y2 + y4) / 2F;
        float C =(y4 - y2) / 2F;

        //满足A B C都不为浮点数才输出
        if(A !=(y1 + y3)/2) {
            System.out.println("No");
            return;
        }
        if(B !=(y2 + y4) / 2 || B !=(y3 - y1) / 2  ) {
            System.out.println("No");
            return;
        }
        if(C != (y4 - y2) / 2) {
            System.out.println("No");
            return;
        }
        System.out.println((int)A+" " + (int)B+" " + (int)C);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            int n = sc.nextInt();
            int m = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            func(n,m,x,y);
        }
    }
    public static void main1(String[] args) {
        Solution1 solution1 = new Solution1();

        solution1.push(1);
        solution1.push(2);
        solution1.push(3);
        solution1.push(4);
        solution1.push(5);
        System.out.println("=======================");
        System.out.println(solution1.pop());
    }
}
