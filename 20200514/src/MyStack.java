import java.util.LinkedList;
import java.util.Queue;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

public class MyStack {
    private Queue<Integer> queue1;
    private Queue<Integer> queue2;
    /** Initialize your data structure here. */
    public MyStack() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }
    public void push(int x) {
        if (!queue1.isEmpty()) {
            queue2.offer(x);
        }
         else if(!queue2.isEmpty()) {
            queue1.offer(x);
        }
         else {
             queue1.offer(x);
        }
    }
    public boolean empty() {
        if(queue1.isEmpty() && queue2.isEmpty()) {
            return true;
        }
        return false;
    }
    public int pop(){
        if(empty()){
            return  -1;
        }
        int data = 0;
        int qsize1 = queue1.size();
        int qsize2 = queue2.size();
        if (!queue1.isEmpty()){
            for (int i = 0; i < qsize1 - 1; i++) {
                queue2.offer(queue1.poll());
            }
             data = queue2.poll();
        }
        if (!queue2.isEmpty()){
            for (int i = 0; i < qsize2 - 1; i++) {
                queue1.offer(queue2.poll());
            }
             data = queue1.poll();
        }
        return data;
    }
    public  int top(){
        if(empty()){
            return  -1;
        }
        int data = 0;
        int qsize1 = queue1.size();
        int qsize2 = queue2.size();
        if (!queue1.isEmpty()){
            for (int i = 0; i < qsize1 ; i++) {
                data = queue1.poll();
                queue2.offer(data);
            }
        }
        if (!queue2.isEmpty()){
            for (int i = 0; i < qsize2 - 1; i++) {
                data = queue2.poll();
                queue1.offer(data);
            }
        }
        return data;
    }
}
