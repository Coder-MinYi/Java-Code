import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
/*
字符串中找出连续最长的数字串
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String str = sc.nextLine();

            System.out.println(func(str));
        }
    }

    private static String func(String str) {

        //StringBuilder sb = new StringBuilder();
        int end = 0;
        int count = 0;
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            if ('0' <= str.charAt(i) && str.charAt(i) <= '9') {
                count++;
                if (max < count) {
                    max = count;
                    end = i;
                }
            } else {
                    count = 0;
                }
        }
        return str.substring(end - max + 1 , end + 1);
    }
}
