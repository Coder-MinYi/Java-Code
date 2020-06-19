/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Main {
    public static void main(String[] args) {
        // 由于 SingletonStarve 构造方法是 private 的
        // 所以，会有语法错误
        // SingletonStarve mistake = new SingletonStarve();

        // 如果要用到该类的对象
        SingletonStarve right = SingletonStarve.getInstance();


        }
}
