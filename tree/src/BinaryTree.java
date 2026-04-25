import java.util.Scanner;

public class BinaryTree {

    private Node root;

    BinaryTree(){

    }

    private static class Node{
        int value;
        Node left;
        Node right;

        Node(int value){
            this.value = value;
            this.left = null;
            this.right = null;
        }

    }

    // insert elements
    public void populate(Scanner scanner){
        System.out.println("Enter the root Node: ");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(root,scanner);
    }

    private void populate(Node node , Scanner inputScanner){

        System.out.println("Do you want to enter left of " + node.value);
        boolean left = inputScanner.nextBoolean();
        if (left){
            System.out.println("Enter the value of the left of " + node.value);
            int value = inputScanner.nextInt();
            node.left = new Node(value);
            populate(node.left,inputScanner);
        }

        System.out.println("Do you want to enter right of "+node.value);
        boolean right = inputScanner.nextBoolean();
        if (right){
            System.out.println("Enter the value of the right of " + node.value);
            int value = inputScanner.nextInt();
            node.right = new Node(value);
            populate(node.right,inputScanner);
        }

    }

    public void display(){
        display(root,"");
    }

    private void display(Node node , String string){

        if (node == null){
            return;
        }

        // printing value
        System.out.println(string + node.value);
        // left call
        display(node.left,string+"\t");
        // right call
        display(node.right,string+"\t");
    }
}
