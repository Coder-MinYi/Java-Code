/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
//class Person {
//    String name = "No name" ;
//    public Person(String nm) {
//        name = nm;
//    }
//    static class Employee extends Person {
//        String empID = "0000";
//        public Employee(String id) {
//            super();
//            empID = id;
//        }
public  class TestClass {
//            public static void main(String args[]) {
//                Employee e = new Employee("123");
//                    System . out. println(e. empID);
//                }
    private static void testMethod(){
        System . out. println("testMethod");
    }
    public static void main1(String[] args) {
        ((TestClass )null). testMethod() ;
    }
}
