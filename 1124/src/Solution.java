/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Solution {
    public static boolean isAdmin(String userId) {
        return userId.toLowerCase() == "admin";
    }
        public static void main (String[]args){
        System.out.println(isAdmin("Admin"));

    }
}
