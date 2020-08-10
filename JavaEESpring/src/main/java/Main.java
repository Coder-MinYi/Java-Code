import MinYi.Duck;
import MinYi.Duck2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("applications.xml");
        String name = (String)context.getBean("myname");//通过Bean的名称获取
        String name1 = context.getBean(String.class); //通过类型获取；如果该类型存在多个对象，就会报错

        System.out.println(name.getClass());
        System.out.println(name);
        System.out.println(name1);

        Duck d = (Duck) context.getBean("b1");
        System.out.println(d);

        Duck2 c = (Duck2) context.getBean("c1");
        System.out.println(d);
    }
}