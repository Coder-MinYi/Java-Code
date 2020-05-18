/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestDemo {
        public static void main(String[] args) {
            MyLinkedList c = new MyLinkedList();
            c.addFrist(5);
            c.addFrist(6);
            c.addFrist(7);
            c.disPlay();
            c.addList(8);
            c.addList(8);
            c.addList(8);
            c.disPlay2(c.func());
            c.disPlay();
            System.out.println(c.contains(5));
            System.out.println(c.size());
            // c.addIndex(2,3);
            c.disPlay();
            c.moveKey(8);
            //System.out.println();
            //c.disPlay();
            //System.out.println(c.middleNode());
        }

    }
