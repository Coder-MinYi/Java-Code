import java.util.*;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestDemo1 {
    public static  HashSet<Integer>  singleNumber(int[] nums){
       HashSet<Integer> set = new HashSet<>();
        for (Integer val: nums) {
            if (!set.contains(val)){
                set.add(val);
            }else {
                set.remove(val);
            }
        }
        return set;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,2,1,4};
        System.out.println(singleNumber(arr));
    }

    /**
     * 2、大数据去重问题：
     * 10W个数据当中 有重复元素，请去掉重复的元素。
     * @param args
     */
    public static void main5(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(6000));
        }
        HashSet<Integer> set = new HashSet<>();
        for (Integer val : list) {
            set.add(val);
        }
        System.out.println(set);
    }

    /**
     *
     * @param args
     */
    public static void main4(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(6000));
         }
        HashMap<Integer,Integer> map = new HashMap<>();
        //key 重复关键字
        //val 重复关键字出现的次数
        for (Integer key:list) {
            if (map.get(key) == null){
                map.put(key,1);
            }else {
                Integer val = map.get(key);
                map.put(key,val+1);
            }
        }
        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
    /**
     *
     * 1、找出10W个数据当中，第一个重复的元素。
     * @param
     */

    public static void main3(String[] args) {
        Random random = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10_0000; i++) {
            list.add(random.nextInt(6000));
        }
        HashSet<Integer> set = new HashSet<>();
        for (Integer m: list) {
            if (set.contains(m)){
                System.out.println(m+"是第一个重复数据");
                break;
        }else {
                set.add(m);
            }

        }
    }
    public static void main2(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(8);
        set.add(2);
        set.add(4);
        System.out.println(set);
        Iterator<Integer> it = set.iterator();//迭代器
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
    public static void main1(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"hj");
        map.put(2,"cc");
        map.put(3,"talk");
        map.put(4,"bit");
        System.out.println(map);
        for (Map.Entry<Integer,String> entry: map.entrySet()) {
            System.out.println(entry.getKey()+"->"+entry.getValue());
        }
    }
}
