package MinYi;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MinYi
 * Date:21:23 2020/8/10
 * Time:
 */
public class Duck2 {
    String name;
    Integer age;

    public Duck2(String n, Integer a) {
        this.name = n;
        this.age = a;
    }


    @Override
    public String toString() {
        return "Duck{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
