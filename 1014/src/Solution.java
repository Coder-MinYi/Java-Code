/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
 }
/**
 * 对称的树
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        return isCheck(root,root);
    }

    private boolean isCheck(TreeNode p, TreeNode q) {
        if (p == null && q == null){
            return true;
        }
        if (p == null || q == null){
            return false;
        }
        return p.val == q.val && isCheck(p.left , q.right) && isCheck(p.right , q.left);
    }

    /**
     * 验证回文串  给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
     *说明：本题中，我们将空字符串定义为有效的回文串。
     * 示例 1:
     * 输入: "A man, a plan, a canal: Panama"
     * 输出: true
     * 示例 2:
     * 输入: "race a car"
     * 输出: false
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        if (s.length() == 0 || s == null){
            return true;
        }
        char[] sh = s.toCharArray();
        for (int i = 0; i < sh.length; i++) {
            if (Character.isLetterOrDigit(sh[i])){
                sb.append(Character.toLowerCase(sh[i]));
            }
        }
        StringBuilder sb1 = new StringBuilder(sb).reverse();
        return sb.toString().equals(sb1.toString());
    }

    /**
     * K个一组反转链表
     * @param head
     * @param k
     * @return
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        //按K个元素翻转
        if(head == null || head.next == null || k == 1){
            return head;
        }
        ListNode cur = head;
        for (int i = 0; i < k; i++) {
            if (cur == null){
                return head;
            }
            cur = cur.next;
        }
        ListNode newHead = reverse(head , k);

        head.next = reverseKGroup(cur , k);

        return newHead;
    }
    private ListNode reverse(ListNode head, int k) {
        ListNode pre = null;
        ListNode next = null;
        while (k > 0){
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
            k--;
        }
        return pre;
    }
}