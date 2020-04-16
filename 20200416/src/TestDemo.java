/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:2020/04/16
 * Time:18:32
 */
class Person{
    public String name;
    public int age;
    public void eat(){
        System.out.println("eat()");
    }
}
public class TestDemo {
    public static void main(String[] args) {

    }
    //打印二维数组
    public static void print(int[][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        for (int[] tmp: arr) {
            for (int x: tmp) {
                System.out.print(x +" ");
            }
            System.out.println();
        }
    }
    public static void main1(String[] args) {
        int[] [] array = {{1,2,3,4},{4,5,6,7}};
        print(array);

    }
}
