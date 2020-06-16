/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestDemo { //1
    public static void main(String[] args) {//2
        System. out . println("value=" +switchit(4));//3
        String s1="abc"+"def";//1
        String s2=new String (s1);//2
        System.out.println(s1);
        if(s1. equals(s2))//3
            System. out . println(" . equals succeeded");//4
        if(s1==s2)//5
            System. out . println("==succeeded");//6


    }//4
    public static int switchit(int x) {
        int j=1;
        switch (x) {
            case 1:
                j++;
            case 2:
                j++;
            case 3:
                j++;
            case 4:
                j++;
            case 5:
                j++;
            default:
                j++;
        }
            return j+x;
    }

}
