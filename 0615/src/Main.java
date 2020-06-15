import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main {
    static boolean out(char c) {
        System.out.print(c);
        return true;
    }
        public static void main(String[] args){
            int i=0;
            for(out('A' );out('B') && (i<2);out('C')){
                i++;
                out('D');
            }
        }


    public static String add(String s1, String s2){
            String result = "";
            // 获取字符串长度
            int len1 = s1.length();
            int len2 = s2.length();
            // 比较字符串大小，
            int maxLen = len1 > len2 ? len1 : len2;
            int minLen = len1 < len2 ? len1 : len2;
            // 长度小的那一个在左边添加0，直到和较长的那一个字符串长度相等
            StringBuffer tempZero = new StringBuffer();
            for (int i = 0; i < maxLen - minLen; i++) {
                // tmepZero = tmepZero + "0";
                tempZero.append("0");
            }

            // 如果s1的长度等于最大长度 ,s2左边加0
            if (len1 == maxLen) {
                s2 = tempZero + s2;
            } else {
                s1 = tempZero + s1;
            }

            // 进位（carryflag）
            int cf = 0;
            // charAt索引范围为从 0 到 length() - 1
            for (int j = maxLen - 1; j >= 0; j--) {
                int a = Integer.parseInt(String.valueOf(s1.charAt(j)));
                int b = Integer.parseInt(String.valueOf(s2.charAt(j)));
                int temp;
                //最左边的那一位（最高位）不需要再进位了
                if (a + b + cf > 10 && j != 0) {
                    temp = a + b + cf -10;
                    cf = 1;
                }else {
                    temp = a + b + cf;
                    cf = 0;
                }

                //  temp + result; 字符串的连接，位置不可变
                result = temp + result;

            }
            return result;
        }

    public static void main2(String[] args) {
        Scanner sc= new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        System.out.println(add(a, b));
    }
    //奥巴马编程
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row = 0;
        String a = sc.next();
        //行数与列数的关系(当列数col是奇数时,行数row就是col/2+1当列数col是偶数时,行数row就是col/2)
        row=n/2+n%2;
        for(int i=0;i<row;i++){
            //第一行和最后一行
            if(i==0||i==row-1){
                for(int j=0;j<n;j++) {
                    System.out.print(a);
                }
                System.out.println();
            }
            else {
                //中间的row-2行
                System.out.print(a);
                for(int j=1;j<n-1;j++){
                    System.out.print(" ");
                }
                System.out.println(a);
            }
        }
    }
}
