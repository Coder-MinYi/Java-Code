/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
abstract class Animal{
    abstract void say();
}
public class Cat extends Animal{
    public Cat(){
        System.out.printf("I am a cat" );
    }
    public static void main( String[] args) {
        Cat cat = new Cat();
    }

    @Override
    void say() {

    }
}

