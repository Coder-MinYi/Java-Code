import java.util.HashMap;
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main {
    //个位数统计
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[10];
        String n = in.nextLine();
        for (int i = 0; i < n.length(); i++) {
            a[n.charAt(i) - '0']++;
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0){
                System.out.println(i + ":" + a[i]);
            }
        }
    }

    public static void main3(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char key = str.charAt(i);
            if (!map.containsKey(key)){
               map.put(key,1);
            }else {
                map.put(key,map.get(key) + 1);
            }
        }
        System.out.println(map.get(2));
    }
    public static void main2(String[] args) {
        java.util.HashMap map=new java.util.HashMap();
        map. put("name" ,null);
        map. put("name" ,"Jack");
        System. out . println(map.size());

        Thread t = new Thread() {
                public void run() {
                    pong();
                }
            };
            t. run();
            System. out. print("ping");
        }
        static void pong() {
            System. out.print("pong");

    }
}
