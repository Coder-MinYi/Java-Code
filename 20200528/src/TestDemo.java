import java.util.*;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

public class TestDemo {
    public static void main(String[] args) {
        BSeachTree bsTree = new BSeachTree();
        int[] array = {7,2,9,18,56,15,3};
        for (int i : array) {
            bsTree.add(i);
        }
        bsTree.preOrder(bsTree.root);
        System.out.println();
        bsTree.inOrder(bsTree.root);
        System.out.println();
        System.out.println(bsTree.search(18).val);
        System.out.println("==========删除============");
        bsTree.remove(18);
        bsTree.preOrder(bsTree.root);
        System.out.println();
        bsTree.inOrder(bsTree.root);
        System.out.println();
    }
    public static int numJewelsInStones(String J, String S) {

        int count = 0;
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < J.length(); i++) {
            set.add(J.charAt(i));
        }
        for (int j = 0; j < S.length(); j++) {
            if (set.contains(S.charAt(j))) {
                count++;
            }
        }
        return count;
    }

        public static void main1 (String[]args){
            String  A = "aA";
            String  B = "AKJFJDAaaua";
            System.out.println(numJewelsInStones(A, B));
            Scanner scanner = new Scanner(System.in);
            String expected = scanner.nextLine();//7_This_is_a_test
            String actual = scanner.nextLine();//_hs_s_a_es

            //1、把实际的字符转换为大写存放到集合当中
            HashSet<Character> setActual = new HashSet<>();
            for (char s : actual.toUpperCase().toCharArray()) {
                setActual.add(s);
            }
            HashSet<Character> setb = new HashSet<>();

            for (char t: expected.toUpperCase().toCharArray()) {
                if (!setActual.contains(t) && !setb.contains(t)){
                    System.out.print(t);
                    setb.add(t);
                }
            }
     }

}
