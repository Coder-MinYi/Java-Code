/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main {
    /**
     *
     * 给定两个字符串str1和str2,输出两个字符串的最长公共子串，如果最长公共子串为空，输出-1。
     * longest common substring
     * @param str1 string字符串 the string
     * @param str2 string字符串 the string
     * @return string字符串
     */
    public String LCS (String str1, String str2) {
        // write code here
        StringBuilder sb = new StringBuilder();
        //双指针
        int start = 0;
        int end = 1;
        while (end < str1.length() + 1){
            //如果str2中包括str1中start到end位置子串
            if (str2.contains(str1.substring(start,end))) {
                //sb中子串比现有子串短
                if (sb.length() < end - start) {
                    //移除
                    sb.delete(0, sb.length());
                    //添加
                    sb.append(str1, start, end);
                }
                //尾指针向后移动
                end++;
            }
            //str2中不包含str1中start到end位置子串，则头指针向后移动
            else {
                start++;
            }
        }
        if (sb.length() == 0){
            return  "-1";
        }
        return sb.toString();
    }

    /**
     * 从0,1,2,...,n这n+1个数中选择n个数，找出这n个数中缺失的那个数，要求O(n)尽可能小。
     * 找缺失数字
     * @param a int整型一维数组 给定的数字串
     * @return int整型
     */
    public int solve (int[] a) {
        // write code here
        int sum = 0;
        if (a != null){
            int n = a.length;
            sum = (n * (n + 1))/2;
            for (int i = 0; i < a.length; i++) {
                sum -= a[i];
            }
        }
        return sum;
    }
}
