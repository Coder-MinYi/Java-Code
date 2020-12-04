import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

//个位数统计
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

            String str = sc.nextLine();
            func(str);
            func2(str);
    }

    private static void func(String str) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            int m = Integer.valueOf(str.charAt(i));
            if (!map.containsKey(m)) {
                map.put(m , 1);
            } else {
                map.put(m , map.get(m) + 1);
            }
        }
//        for (int i = 0; i < 10; i++) {
//            if (map.containsKey(i)) {
//                System.out.println(i + ":" + map.get(i));
//            }
//        }
        for (
                Map.Entry<Integer,Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey() - 48+":"+entry.getValue());
        }
    }
    private static void func2(String str){
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            list.add(str.charAt(i));
        }
        HashMap<Character,Integer> map = new HashMap<>();
        //key 重复关键字
        //val 重复关键字出现的次数
        for (char key:list) {
            if (map.get(key) == null){
                map.put(key,1);
            }else {
                Integer val = map.get(key);
                map.put(key,val+1);
            }
        }
        for (
                Map.Entry<Character,Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
}

