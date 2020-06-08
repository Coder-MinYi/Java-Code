import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main {
    public static int test(int b){
        try {
        b += 10;
        return b;
        }
        catch(RuntimeException e)
        { }
        catch(Exception e2) { }
        finally {
            b += 10;
            return b;
        }
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println(test(num));
        boolean b=true?false:true==true?false:true;
        System.out.println(b);
    }
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        String[] str1 = str.split(" ");
        for (String i : str1) {
            list.add(Integer.parseInt(i));
        }
        for (Integer key : list) {
            if (map.get(key) == null) {
                map.put(key, 1);
            } else {
                Integer val = map.get(key);
                map.put(key, val + 1);
            }
        }
        for (Integer key : list) {
            if (map.get(key) >= str1.length / 2){
                System.out.println(key);
                break;
            }
        }
    }
}
