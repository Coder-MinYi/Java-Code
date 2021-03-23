import jdk.nashorn.internal.ir.CallNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class Solution {
    //求阶乘
    public static int fac(int n){
        if(n == 1 || n == 0){
            return n;
        }else {
            return n * fac(n -1 );
        }
    }
    //斐波那契额数列
    public static int fibonacci(int n){
        if (n == 0 || n == 1){
            return n;
        }else {
            return fibonacci(n - 1) + fibonacci( n -2);
        }
    }
    //汉诺塔
    //柱子编号1,2,3
    public static void  hanoi(int n, int from, int to){
        if (n < 1) {
            throw new IllegalArgumentException("n 必须大于等于 1。 n = " + n);
        }

        if (n == 1) {
            System.out.printf("直接将 1 个盘子，从 %d 移动到 %d\n", from, to);
            return;
        }

        int other = (0 + 1 + 2) - from - to;

        hanoi(n - 1, from, other);
        System.out.printf("直接将 1 个盘子，从 %d 移动到 %d\n", from, to);
        hanoi(n - 1, other, to);
    }

    public static void main(String[] args) {
        hanoi(3, 0, 2);
    }
    static class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int val){
            this.val = val;
    }

    //二叉树前序遍历
    public static void preOrder(TreeNode root ){
        if (root == null){
            return;
        }
        System.out.println(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    //前序和后序遍历构造二叉树
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        List<Integer> preorderList = arrayList(preorder);
        List<Integer> inorderList = arrayList(inorder);

        return buildTreeByList(preorderList, inorderList);
    }
    private static TreeNode buildTreeByList(List<Integer> preorderList, List<Integer> inorderList) {
        if (preorderList.isEmpty()) {
            return null;
        }
        if (preorderList.isEmpty()){
            return null;
        }
        //前序遍历顺序表中找根的值
        int rootval = preorderList.get(0);
        //后序遍历顺序表中找根的位置
        int rootIndex = inorderList.indexOf(rootval);
        int leftTreeSize = rootIndex;

        List<Integer> leftSubTreePreorderList = preorderList.subList(1, 1 + leftTreeSize);
        List<Integer> leftSubTreeInorderList = inorderList.subList(0, 0 + leftTreeSize);
        TreeNode leftSubTreeRoot = buildTreeByList(leftSubTreePreorderList, leftSubTreeInorderList);

        List<Integer> rightSubTreePreorderList = preorderList.subList(1 + leftTreeSize, preorderList.size());
        List<Integer> rightSubTreeInorderList = inorderList.subList(leftTreeSize + 1, inorderList.size());
        TreeNode rightSubTreeRoot = buildTreeByList(rightSubTreePreorderList, rightSubTreeInorderList);

        TreeNode root = new TreeNode(rootval);
        root.left = leftSubTreeRoot;
        root.right = rightSubTreeRoot;

        return root;
    }

    }

    private static List<Integer> arrayList(int[] preorder) {
        List<Integer> list = new ArrayList<>();
        for (int n: preorder) {
            list.add(n);
        }
        return list;
    }
}
