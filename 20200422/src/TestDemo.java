/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class Person{
    //实例成员变量
//    public String name;
//    public int age;
//    public char ch;
//    public boolean b;
//    public double n;
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
     public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
    //静态成员变量
    public static int size = 10;//只有一份
    //方法
    public void eat(String eat){
        System.out.println("eat");
    }
    public void sleep(int num){
        System.out.println("num");
    }

}
public class TestDemo {

    public static void main(String[] args) {
        Person per = new Person();
//        System.out.println(per.name);
//        System.out.println(per.age);
//        System.out.println(per.ch);
//        System.out.println(per.n);
//        System.out.println(per.b);
        per.setName("minyi");
        per.setAge(18);
        System.out.println(per.getAge());
        System.out.println(per.getName());
    }
}
