import java.util.Scanner;
import java.util.Stack;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MinYi
 * Date:15:01 2020/7/17
 * Time:
 */

/**
 * 单词倒排 (中级)
 *对字符串中的所有单词进行倒排。
 *说明：
 *1、构成单词的字符只有26个大写或小写英文字母；
 *2、非构成单词的字符均视为单词间隔符；
 *3、要求倒排后的单词间隔符以一个空格表示；如果原字符串中相邻单词间有多个间隔符时，倒排转换后也只允许出现一个空格间隔符；
 *4、每个单词最长20个字母；
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        while (sc.hasNext()){
            String str = sc.nextLine();
            char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                if (!isAlphaBelta(ch[i])){
                    ch[i] = ' ';
                }
            }
            //System.out.println(ch.toString());
            str = String.valueOf(ch).trim();
            String[] strings = str.split(" ");
            func(strings);
        }
    }

    private static void func(String[] strings) {
        Stack<String> stack = new Stack<>();

        for (String str : strings){
            stack.push(str);
        }
        while (stack.size() > 1){
            System.out.print(stack.pop() + " ");
        }
        System.out.println(stack.pop());
    }

    private static boolean isAlphaBelta(char c){

        if((c>='a'&&c<='z')||(c>='A'&&c<='Z')){
            return true;
        }
        return false;
    }
}