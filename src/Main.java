import NonLinearDS.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.insert(7);
        bt.insert(4);
        bt.insert(9);
        bt.insert(1);
        bt.insert(6);
        bt.insert(8);
        bt.insert(10);
        bt.levelOrderTraversal();
        bt.mirrorTree();
        System.out.println("-----------------------------------");
        bt.levelOrderTraversal();
    }
}