import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */

/**
 * 在链表中删除n后的链表
 */
public class Main {
    private static class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
            this.val = val;
        }
    }

    //构建链表
    private static ListNode build(int n,String[] data) {
        ListNode dummyHead = new ListNode(0);
        ListNode pre = dummyHead;
        for (int i = 0;i < n;i ++) {
            pre.next = new ListNode(Integer.parseInt(data[i]));
            pre = pre.next;
        }
        return dummyHead.next;
    }
    //删除链表中值为num的节点
    private static ListNode delete(ListNode head,int num) {
        while(head!=null){
            if(head.val!=num){
                break;
            }
            head=head.next;
        }
        ListNode pre =head;
        ListNode cur =head;
        while(cur!=null){
            if(cur.val==num){
                pre.next=cur.next;
            }else{
                pre=cur;
            }
            cur=cur.next;
        }
        return head;
    }
    public static void main(String[] args) throws Exception{
        BufferedReader scanner = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(scanner.readLine());
        String[] data = scanner.readLine().split(" ");
        int num = Integer.parseInt(scanner.readLine());
        ListNode head = build(n,data);
        ListNode newHead = delete(head,num);
        StringBuilder sb = new StringBuilder();
        while (newHead != null) {
            sb.append(newHead.val).append(" ");
            newHead = newHead.next;
        }
        System.out.println(sb.toString().trim());
    }
}
