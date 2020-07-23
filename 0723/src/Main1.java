import java.util.HashMap;
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 乒乓球筐
 */
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String string = sc.nextLine();
            String[] strings = string.split(" ");
            //String str1 = strings[0];
            //String str2 = strings[1];

            HashMap<Character, Integer> map1 = new HashMap<>();
            HashMap<Character, Integer> map2 = new HashMap<>();

            char[] ch1 = strings[0].toCharArray();
            char[] ch2 = strings[1].toCharArray();
            for (int i = 0; i < ch1.length; i++) {
                if (map1.get(ch1[i]) == null) {
                    map1.put(ch1[i], 1);
                } else {
                    map1.put(ch1[i], map1.get(ch1[i]) + 1);
                }
            }
            for (int i = 0; i < ch2.length; i++) {
                if (map2.get(ch2[i]) == null) {
                    map2.put(ch2[i], 1);
                } else {
                    map2.put(ch2[i], map2.get(ch2[i]) + 1);
                                            }
            }
                    int count = 0;
            for (int i = 0; i < ch2.length; i++) {
                if (map1.containsKey(ch2[i])) {
                    map1.put(ch2[i], map1.get(ch2[i]) - 1);
                    if (map1.get(ch2[i]) < 0) {
                        System.out.println("No");
                        break;
                    }
                    count++;
                } else {
                    System.out.println("No");
                    break;
                }
            }
            if (count == ch2.length) {
                System.out.println("Yes");
            }
       }
    }
}
//            }
            //if (func(map1,map2,ch2)){
//                System.out.println("YES");
//            }else {
//                System.out.println("NO");
////            }
//            int count = 0;
//            for (int i = 0; i < ch2.length; i++) {
//                if (map2.get(ch2[i]) > map1.get(ch2[i])){
//                    count++;
//                }
//            }
//            if (map1.size() != map2.size()){
//                count++;
//            }
//}
//ABCDFYE CDE
//ABCDFYE CDE
//ABCDGEAS CDECDE
//    private static boolean func(HashMap<Character, Integer> map1, HashMap<Character, Integer> map2, char[] ch2) {
//        for (int i = 0; i < ch2.length; i++) {
//            if (map2.get(ch2[i]) > map1.get(ch2[i])){
//                return false;
//            }
//        }
//        return true;
//    }
//}
