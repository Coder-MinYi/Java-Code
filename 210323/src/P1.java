/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
// 静态导入 —— 以方法/属性为单位导入
import static java.lang.Math.abs;
// 普通导入 —— 以类为单位导入
import java.lang.Math;

public class P1 {
    // 下面的用法，只能出现在顶级类内部
    // static 表示和对象解绑
    // 和 P1 找个类的对象解绑

    // 静态内部类
    static class StaticInnerClass {}

    // 静态方法
    static void staticMethod() {}

    // 静态属性
    static int staticField;

    // 静态代码块
    static {}

    public static void main(String[] args) {
        Math.abs(-1);

        abs(-1);
    }
}

