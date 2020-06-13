import java.util.*;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main {
    public static int[] exchangeAB(int[] AB) {
        // write code here
        AB[0] = AB[0] ^ AB[1];
        AB[1] = AB[0] ^ AB[1];
        AB[0] = AB[0] ^ AB[1];
        return AB;
    }
    public static void add(Byte b) {
        b =b++;
    }
        public static void test()
        {
            Byte a = 127;
            Byte b = 127;
            add(++a);
            System.out.print(a + " ");
            add(b);
            System.out.print(b + "");
        }
    public static int[] multiply(int[] A) {
        int[] B = new int[A.length];
        if (A.length == 0){
            return B;
        }
        B[0] = 1;
        for (int i = 1; i < A.length; i++) {
            B[i] = B[i -1]*A[i -1];
        }
        int ret = 1;
        for (int j = A.length -2; j >= 0 ; j--) {
            ret *= A[j + 1];
            B[j] *= ret;
        }
        return B;
    }
    public static void func(String str){
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
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        //String str = sc.nextLine();
        //func(str);
        String a ="hello";
        String b = "he" + new String("llo");
        System.err.println(a == b);
        test();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] AB = {n,m};
        System.out.println(Arrays.toString(exchangeAB(AB)));
    }
}
