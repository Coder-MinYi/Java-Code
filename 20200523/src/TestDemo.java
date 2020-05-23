import java.util.*;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

public class TestDemo {
    public static int lastStoneWeight(int[] stones) {
        // 使用优先对列保证每次能拿到最大的数
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return (o2 - o1);
            }
        });
        for (int i = 0; i < stones.length; i++) {
            queue.offer(stones[i]);
        }
        while(queue.size() > 1) {
            int x = queue.poll();
            int y = queue.poll();
            int diff = Math.abs(x - y);
            if (diff != 0) {
                queue.offer(diff);
            }
        }
        if (queue.isEmpty()) return 0;
        return queue.peek();
    }
    public static void main(String[] args) {
        int [] array = {2,7,4,1,8,1};
        System.out.println(lastStoneWeight(array));
    }
}
