import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class Student{
    private String name;
    private String classs;
    private double score;

    public Student(String name, String classs, double score) {
        this.name = name;
        this.classs = classs;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasss() {
        return classs;
    }

    public void setClasss(String classs) {
        this.classs = classs;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classs='" + classs + '\'' +
                ", score=" + score +
                '}';
    }
}
public class TestMain {
    
    public static void main(String[] args) {

    }
    public static List<Character>  func(String str1,String str2){
        List<Character> list = new ArrayList<>();
        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if(!str2.contains(ch + "")){
                list.add(ch);
            }
        }
        return list;
    }
    public static void main5(String[] args) {
        String str1 = "welcome to bit";
        String str2 = "come";
        List<Character> ret =func(str1,str2);
        for (char ch:ret) {
            System.out.print(ch);
        }
        System.out.println();
        System.out.println(ret);
    }
    public static void main3(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(5);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
    public static void main2(String[] args) {
        Student student1 = new Student("one","one",66.2);
        Student student2 = new Student("minyi","one",66.2);
        Student student3 = new Student("minyi","one",66.2);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        System.out.println(studentList);


    }
    public static void main1(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hello");
        list.add("word");
        System.out.println(list);

        List<String> list1 = new ArrayList<>();
        list1.add("java");

        list.addAll(list1);
        System.out.println(list);
    }
}
