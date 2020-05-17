/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
class Node {
    public char val;
    public Node left;//左孩子-》左子树
    public Node right;//右孩子-》右子树
    public Node(char val) {
        this.val = val;
    }
}
public class BinaryTree {

    public Node buildTree() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return A;
    }

    // 前序遍历   递归来实现
    void preOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // 中序遍历
    void inOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val + " ");
        inOrderTraversal(root.right);
    }

    // 后序遍历
    void postOrderTraversal(Node root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val + " ");
    }

    // 遍历思路-求结点个数   前序遍历
    static int size = 0;

    int getSize1(Node root) {
        if (root == null) {
            return 0;
        }
        getSize1(root.left);
        getSize1(root.right);
        size++;
        return size;
    }

    // 子问题思路-求结点个数
    int getSize2(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + getSize2(root.left) + getSize2(root.right);
    }

    //遍历思路-求叶子结点个数
    static int leafSize = 0;

    void getLeafSize1(Node root) {
        if (root == null) {
            return;
        }
        if (root.left == null && root.right == null) {
            leafSize++;
        } else {
            getLeafSize1(root.left);
            getLeafSize1(root.right);
        }
    }

    int getLeafSize2(Node root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }

    //求第K层节点个数
    int getKLeve1size(Node root, int k){
        if (root == null){
            return 0;
        }else if (k == 1){
            return 1;
        }else {
            return getKLeve1size(root.left,k - 1)+getKLeve1size(root.right,k -1);
        }
    }

    // 获取二叉树的高度
    int getHeight(Node root) {
        if(root == null) {
            return 0;
        }
        return 1 + Math.max(getHeight(root.left),getHeight(root.right));
    }
    Node find(Node root, int val){
        if(root == null) {
            return null;
        }
        //1、判断根节点是否是查找的数字val
        if(root.val == val) {
            return root;
        }
        //2、左边
        //  递归--》左边全部递归完成后-》返回值是否是空
        Node left = find(root.left,val);
        if (left != null){
            return left;
        }
        //3、右边
        Node right = find(root.right,val);
        if (right != null){
            return right;
        }
        return null;
    }
    public boolean isSameTree(Node p, Node q) {
        if ((p == null && q != null) ||(p != null && q == null)){
            return false;
        }else if (p == null || q == null){
            return true;
        }
        else if (p.val != q.val){
                return false;
            }
        return (isSameTree(p.left,q.left) && isSameTree(p.right,q.right));
    }
    public boolean isSubtree(Node s, Node t) {
        if(s == null || t == null) {
            return false;
        }
        if (isSameTree(s,t)){
            return true;
        }
        if (isSubtree(s.left,t)){
            return true;
        }
        if (isSubtree(s.right,t)){
            return true;
        }
        return false;
    }
    public boolean isBalanced(Node root) {
        if (root == null){
            return true;
        }
        int n = getHeight(root.left);
        int m = getHeight(root.right);
        return Math.abs(m - n) <= 1 && isBalanced(root.left)
                && isBalanced(root.right);
    }
    public boolean isSymmetric(Node root) {
        if (root == null){
            return true;
        }
        return isSymmetric1(root.left,root.right);
    }
    public boolean isSymmetric1(Node rootleft,Node rootright){
        if(rootleft == null && rootright != null||
                rootleft != null &&rootright == null){
            return false;
        }
        if (rootleft == null && rootright == null){
            return true;
        }
        return (rootleft.val == rootright.val)&&
                isSymmetric1(rootleft.left,rootright.right)
                &&isSymmetric1(rootleft.right,rootright.left);
    }
}
