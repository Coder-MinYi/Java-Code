import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

public class TestDemo {
    public static ArrayList<Integer> asylum(int[][] ope) {
        // write code here
        Queue<Integer> dog = new LinkedList<>();//狗队列
        Queue<Integer> cat = new LinkedList<>();//猫队列
        Queue<Integer> all = new LinkedList<>();//混合队列
        ArrayList<Integer> anmin = new ArrayList<>();//收养序列
        for (int i = 0; i < ope.length; i++) {
            //有动物进入收容所
            if (ope[i][0] == 1){
                //动物进入混合队列
                all.offer(ope[i][1]);
                //进入狗队列
                if (ope[i][1] > 0) {
                    dog.offer(ope[i][1]);
                }
                //进入猫队列
                else if (ope[i][1] < 0){
                    cat.offer(ope[i][1]);
                }
            }//有人收养动物
            else if(ope[i][0] == 2){
                //第一种收养方式
                if (ope[i][1] == 0){
                    if (!all.isEmpty()){
                        int tmp = all.poll();
                        anmin.add(tmp);
                        //判断收养走的是猫还是狗
                        if (tmp > 0){
                            dog.poll();
                        }else{
                            cat.poll();
                        }
                    }
                }
                //收养狗
                else if (ope[i][1] > 0){
                    if (!dog.isEmpty()) {
                        int tmp = dog.poll();
                        anmin.add(tmp);
                        all.remove(tmp);
                    }
                }
                //收养猫
                else {
                    if (!cat.isEmpty()){
                        int tmp = cat.poll();
                        anmin.add(tmp);
                        all.remove(tmp);
                    }
                }
            }
        }
        return anmin;
    }
    public static void main(String[] args) {
        int[][] ope = {{1,1},{1,-1},{2,0},{2,-1}};
        System.out.println(asylum(ope));
    }
}
