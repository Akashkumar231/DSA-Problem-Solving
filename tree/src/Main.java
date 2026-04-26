import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.populate(new Scanner(System.in));
        binaryTree.display();
        System.out.println("Hello, World!");
        */

        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(45);
        bst.insert(51);
        bst.insert(35);
        bst.insert(32);
        bst.insert(47);
        bst.display();
        System.out.println("The value is Present in tree => " + bst.isPresent(4007));

        System.out.println("The value is present in tree => " + bst.isPresentLogN(3002) );

        bst.preOrderTraversal();
        System.out.println();
        bst.inOrderTraversal();
        System.out.println();
        bst.postOrderTraversal();
        System.out.println();
        bst.preOrderTraversal();

    }
}