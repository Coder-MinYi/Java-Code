package MinYi;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MinYi
 * Date:20:56 2020/8/10
 * Time:
 */
public class Duck {
    String name;
    Integer age;

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
