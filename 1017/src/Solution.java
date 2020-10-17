/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    /**
     * 字符流中第一个不重复的字符
     */
    Map<Character, Integer> map = new LinkedHashMap<>();

    ////Insert one char from stringstream
    public void Insert(char ch) {
        if (map.containsKey(ch)){
            map.put(ch,map.get(ch) + 1);
        }else {
            map.put(ch,0);
        }
    }
    ///return the first appearence once char in current stringstream
    public char FirstAppearingOnce() {
        for (Map.Entry<Character, Integer> set : map.entrySet()) {
            if (set.getValue() == 0) {
                return set.getKey();
            }
        }
        return '#';
    }
}

