import javafx.scene.transform.Scale;

import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 输入球心和球面上任意一点的坐标
 * 算出球的半径和体积
 */
class Point{
    double a;
    double b;
    double c;

    public Point(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            double x0 = sc.nextDouble();
            double y0 = sc.nextDouble();
            double z0 = sc.nextDouble();

            Point a = new Point(x0,y0,z0);

            double x1 = sc.nextDouble();
            double y1 = sc.nextDouble();
            double z1 = sc.nextDouble();

            Point b = new Point(x1,y1,z1);

            double m = 半径(a,b);
            double n = 体积(m);
            System.out.format("%.3f %.3f\n",m,n);
        }
    }

    private static double 体积(double m) {
        return (4.0/3)*PI*Math.pow(m,3);
    }

    private static double 半径(Point a, Point b) {
        return Math.sqrt(Math.pow(b.a -a.a,2) +Math.pow(b.b -a.b,2)+Math.pow(b.c -a.c,2));
    }

    private static final double PI = Math.acos(-1);
}
