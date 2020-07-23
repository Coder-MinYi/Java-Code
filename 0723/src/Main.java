/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * 寻找兄弟单词
 *
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            int n = sc.nextInt();

            String[] strings = new String[n];

            for (int i = 0; i < n; i++) {
                strings[i] = sc.next();
            }
            String str = sc.next();
            int m = sc.nextInt();

            ArrayList<String> arrayList = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                if (isbroth(strings[i],str)){
                    arrayList.add(strings[i]);
                }
            }
            System.out.print(arrayList.size()+" ");
            if (arrayList.size() >= m){
                Collections.sort(arrayList);
                System.out.print(arrayList.get(m - 1));
            }
        }
    }

    private static boolean isbroth(String string, String str) {
        if (string.equals(str) || str.length() != string.length()){
            return false;
        }
        char[] ch = string.toCharArray();
        char[] chars = str.toCharArray();
        Arrays.sort(ch);
        Arrays.sort(chars);
        if (!String.valueOf(ch).equals( String.valueOf(chars))){
            return false;
        }
        return true;
    }
}