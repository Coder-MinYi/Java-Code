/**
 * Created with InteIIiJ IDEA.
 * Description:
 * User:MINYI
 * Date:
 * Time:
 */
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree();
        binaryTree.preOrderTraversal(root);
        System.out.println();
        System.out.println("=========非递归实现前序遍历===========");
        binaryTree.preOrderTraversalNor(root);
        System.out.println();
        binaryTree.inOrderTraversal(root);
        System.out.println();
        System.out.println("=========非递归实现中序遍历===========");
        binaryTree.inOrderTraversalNor(root);
        System.out.println();
        binaryTree.postOrderTraversal(root);
        System.out.println();
        System.out.println("=========非递归实现后序遍历===========");
        binaryTree.postOrderTraversalNor(root);
        System.out.println(binaryTree.getSize1(root));
        System.out.println(binaryTree.getSize2(root));
        binaryTree.getLeafSize1(root);
        System.out.println(binaryTree.leafSize);
        System.out.println(binaryTree.getLeafSize2(root));
        System.out.println("==========第K层节点个数=============");
        System.out.println(binaryTree.getKLeve1size(root, 2));
        System.out.println(binaryTree.getHeight(root));
        System.out.println("==========层序遍历=============");
        binaryTree.levelOrderTraversal(root);
        //System.out.println(binaryTree.levelOrder(root));
        System.out.println();
        System.out.println(binaryTree.isCompleteTree(root));
    }
}
