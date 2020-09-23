import java.util.Scanner;

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
        while (sc.hasNext()){
            int m = sc.nextInt();
            String str = sc.nextLine();
            String str1 = sc.nextLine();
            System.out.println(func(str, str1, m));
        }
    }

    private static int func(String str, String str1, int m) {
        char[] ch = str.split(" ").toString().toCharArray();
        char[] chars = str.split(" ").toString().toCharArray();
        int count = 0;
        int index = 0;
        int max = 0;
        for (int i = 0; i < m; i++) {
                if (chars[i] == ch[index++]) {
                    func(str.substring(i,m-1),str1.substring(index,m - 1),m - 1);
                    count++;
                }
                if (max < count){
                    max = count;
                }
            }
        return max;
    }
}
