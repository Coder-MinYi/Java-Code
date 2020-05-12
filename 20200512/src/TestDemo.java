
import java.util.*;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;

    public Employee(int id, int importance, List<Integer> subordinates) {
        this.id = id;
        this.importance = importance;
        this.subordinates = subordinates;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", importance=" + importance +
                ", subordinates=" + subordinates +
                '}';
    }
//    public static int func(int N, int[][] trust){
//
//        return 1;
//    }
    public static int getImportance(List<Employee> employees, int id) {
        //创建一个HashMap,键为id,值为读取到的list中的类容
        HashMap<Integer, Employee> map = new HashMap<>();
        //读取list中内容
        for (Employee e : employees) {
            //把list中的数据取出来放在map中
            map.put(e.id, e);
        }
        //把map和员工id都传入
        return getImportance2(map, id);
    }

    public static int getImportance2(HashMap<Integer, Employee> map, int id) {
        //根据 id 找到对应的键值，相当于根据id找到
        Employee employee = map.get(id);
        //在找到上面每一组对应的 重要度
        int result = employee.importance;
        for (int i = 0; i < employee.subordinates.size(); i++) {
            //用于记录每一个下属id，用于在下面递归中下属找到自己的下属
            Integer s = employee.subordinates.get(i);
            //对重要度进行累计
            result += getImportance2(map, s);
        }
        return result;
    }

    public static boolean canThreePartsEqualSum(int[] A) {
        int sum = 0;
        for (int n : A) {
            sum += n;
        }
        if (sum % 3 != 0) {
            return false;
        }
        int m = 0;
        int count = 0;
        for (int i = 0; i < A.length; i++) {
            m += A[i];
            if (m == sum / 3) {
                count++;
                m = 0;
            }
        }
        if (count == 3) {
            return true;
        } else {
            return false;
        }
    }
    public static class TestDemo {
        public static void main(String[] args) {
            Employee employee1 = new Employee(1, 15, Arrays.asList(2, 3));
            Employee employee2 = new Employee(2, 10, Arrays.asList(4));
            Employee employee3 = new Employee(3, 10, Arrays.asList(5));
            Employee employee4 = new Employee(4, 5, Arrays.asList());
            Employee employee5 = new Employee(5, 5, Arrays.asList());
            List<Employee> employees = new ArrayList<>();
            employees.add(employee1);
            employees.add(employee2);
            employees.add(employee3);
            employees.add(employee4);
            employees.add(employee5);
            //System.out.println(Arrays.toString(employees));
            System.out.println(employees);
            System.out.println("========================");
            System.out.println(getImportance(employees, 1));
            System.out.println(getImportance(employees, 2));
            System.out.println(getImportance(employees, 4));
            System.out.println("=======================================");
            int[] arr1 = {0,2,1,-6,6,-7,9,1,2,0,1};
            int[] arr2 = {0,2,1,-6,6,7,9,-1,2,0,1};
            int[] arr3 = {3,3,6,5,-2,2,5,1,-9,4};
            System.out.println(canThreePartsEqualSum(arr1));
            System.out.println(canThreePartsEqualSum(arr2));
            System.out.println(canThreePartsEqualSum(arr3));

        }
    }
}
