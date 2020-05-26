/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class Generic<T extends Comparable<T>> {

    public T  func(T[]elem){
        T max = elem[0];
        for (int i = 0; i < elem.length; i++) {
            if (elem[i].compareTo(max) > 0){
                max = elem[i];
            }
        }
        return max;
    }



}

public class TestDemo {
    public static void main(String[] args) {

    }
}
