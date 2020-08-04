import java.util.Stack;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
//翻转单词顺序列
public class Main {
    public static void main(String[] args) {
        String str = "student. a am I";
        System.out.println(ReverseSentence(str));
    }
    public static String ReverseSentence(String str) {
        String[] strings = str.trim().split(" ");
        //String[] strings = str.split(" ");

        if(str == null){
            return null;
        }
        if(str.trim().equals("")){
            return str;
        }
        Stack<String> stack = new Stack<>();

        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < strings.length; i++) {
            stack.push(strings[i]);
        }
        while (stack.size() > 1){
            sb.append(stack.pop()+ " ");
        }
        sb.append(stack.pop());
        return sb.toString().trim();
    }
}
