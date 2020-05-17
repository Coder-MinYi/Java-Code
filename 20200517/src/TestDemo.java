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
        binaryTree.inOrderTraversal(root);
        System.out.println();
        binaryTree.postOrderTraversal(root);
        System.out.println();
        System.out.println(binaryTree.getSize1(root));
        System.out.println(binaryTree.getSize2(root));
        binaryTree.getLeafSize1(root);
        System.out.println(binaryTree.leafSize);
        System.out.println(binaryTree.getLeafSize2(root));
        System.out.println("==========第K层节点个数=============");
        System.out.println(binaryTree.getKLeve1size(root, 2));
        System.out.println(binaryTree.getHeight(root));
    }
}
