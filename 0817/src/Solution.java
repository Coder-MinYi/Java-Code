/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Solution {
    public static void main(String[] args) {
        System.out.println(f(8));
    }

    public static int f(int n) {
        if (n <= 3) {
            return 1;
        } else {
            return f(n - 2) + f(n - 4) + 1;
        }
    }
}
