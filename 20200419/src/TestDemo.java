/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestDemo {
    public static void main(String[] args) {
        MyArrayList myarraylist1 = new MyArrayList();
        for (int i = 0; i < 10; i++) {
            myarraylist1.add(i, i);
        }
        myarraylist1.display();
        myarraylist1.add(9, 20);//在POS位置添加元素
        myarraylist1.display();//打印顺序表
        System.out.println( myarraylist1.contains(29)); //判断是否包含某个元素
        System.out.println(myarraylist1.getPos(9)); //获取POS位置元素
        System.out.println(myarraylist1.search(9));//查找某个元素并返回下标
        System.out.println("=================");
        myarraylist1.remove(0);//删除某个元素
        myarraylist1.display();
        myarraylist1.setPos(2,1999);// //给POS位置元素设置为val
        myarraylist1.display();
        System.out.println(myarraylist1.size());//获取顺序表长度
        myarraylist1.clear();
        myarraylist1.display();
        System.out.println("================");
    }
}