import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestDemo {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        hashMap.put("高数","数学老师");
        hashMap.put("英语","英语老师");
        hashMap.put("语文","语文老师");
        System.out.println(hashMap);
        System.out.println(hashMap.get("高数"));
        hashMap.getOrDefault("高数1","体育老师");
        System.out.println(hashMap.get("高数1"));
    }
    public static void main1(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("jdfhj");
        collection.add("kjhdfj");
        System.out.println(collection);
        collection.add("jkhfjkdh");
        collection.remove("jdfhj");
        System.out.println(collection);
        System.out.println(collection.size());
        System.out.println(collection.isEmpty());

    }
}
