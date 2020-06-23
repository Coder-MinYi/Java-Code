import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Test {
    static class Student {
        String name;
        int sorce;
        int num;

        public Student(String name, int sorce, int num) {
            this.name = name;
            this.sorce = sorce;
            this.num = num;
        }
    }

    static class AscComparator implements Comparator<Student> {

        @Override
        public int compare(Student o, Student o1) {
            /*
            if (o1.score != o2.score) {
                return o1.score - o2.score;
            } else {
                return o1.number - o1.number;
            }
            */
            if (o.sorce < o1.sorce) {
                return -1; //
            } else if (o.sorce > o1.sorce) {
                return 1;
            } else {
                //成绩相同
                if (o.num < o1.num) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
    }

    static class DescComparator implements Comparator<Student> {

         @Override
         public int compare(Student o1, Student o2) {
             if (o1.sorce != o2.sorce) {
                 return o2.sorce - o1.sorce;
             } else {
                 return o1.num - o2.num;
             }
         }
        /*@Override
        public int compare(Student o, Student o1) {
            if (o.sorce < o1.sorce) {
                return 1; //
            } else if (o.sorce > o1.sorce) {
                return -1;
            } else {
                //成绩相同
                if (o.num < o1.num) {
                    return 1;
                } else {
                    return -1;
                }
            }
        }*/

        public static void main(String[] args) {
            // 1.处理输入
            Scanner sc = new Scanner(System.in);
            //System.out.println("输入学生人数");
            int n = sc.nextInt();
            //System.out.println("输入1，为升序；输入0，为降序");
            int a = sc.nextInt();

            Student[] students = new Student[n];
            while (sc.hasNext()) {
                for (int i = 0; i < n; i++) {
                    String name = sc.next();
                    int score = sc.nextInt();
                    students[i] = new Student(name, score, i);

//                students[i] = new Student();
//
//                students[i].num = sc.nextInt();
//
//                students[i].sorce = sc.nextInt();
                }
            }
            // 2.排序使用 Arrays.sort方法

            if (a == 1) {
                Arrays.sort(students, new AscComparator());
            }
            if (a == 0) {
                Arrays.sort(students, new DescComparator());
            }

            // 3.处理输出
            for (int i = 0; i < n; i++) {
                System.out.println(students[i].name + " " + students[i].sorce);
            }
        }
    }
}
