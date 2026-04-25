import java.util.Scanner;

public class BinarySearchTree {

    // Root Node
    private static Node root;

    BinarySearchTree(){

    }

    // Nodes of BinarySearchTree.
    private  class Node{
        int value;
        Node left;
        Node right;
        int height ;

        public Node(int value){
            this.value = value;
            this.left  = null;
            this.right = null;
            this.height = 0;
        }

        public int getValue(){
            return this.value;
        }

    }

    public void display(){
        display(root, "Root Node : ");
    }

    public int height(Node node){
        if (node == null){
            return -1;
        }

        return node.height;
    }

    public boolean isEmpty(Node node){
        return node == null;
    }

    private boolean isBalanced(Node node){
        if(node == null){
            return true;
        }
        return Math.abs(height(node.left)- height(node.right)) <=1 && isBalanced(node.left) && isBalanced(node.right);
    }

    private void display(Node node , String details){

        if (node == null){
            return;
        }

        System.out.println(details + node.getValue());

        // calling left child

        display(node.left , "Left child of Node : " + node.getValue() + "-->");

        // calling right child

        display(node.right , "Right child of Node : " + node.getValue() + "-->");

    }

    public void insert(int value){
        root = insert(root,value);
    }

    private  Node insert(Node node , int value){
//        System.out.print("Do you want to Insert Element : " );
//        boolean isInsert = scanner.nextBoolean();
//        if (isInsert){
//            System.out.print("Enter the value : " );
//            int value = scanner.nextInt();
//            if (value<= node.value){
//                // Enter the left of the root node
//
//                node.left  = new Node(value);
//                insert(node.left,scanner);
//            }else{
//                // Enter the right of the root node;
//                node.right = new Node(value);
//                insert(node.right,scanner);
//            }
//        }
        if(node == null){
            Node leaf = new Node(value);
            return leaf;
        }
        if (value < node.value ){
            node.left = insert(node.left,value);
        }
        if(value> node.value) {
            node.right = insert(node.right, value);
        }
        node.height = Math.max(height(node.left),height(node.right))+1;
        return node;
    }

    public boolean isPresent(int value){
        if (root == null){
            return false;
        }

        return isPresent(root , value);
    }

    private boolean isPresent(Node node , int value){


        if(node==null){
            return false;
        }

        if (node.value == value){
            return true;
        }

        boolean isLeftPresent = isPresent(node.left , value);
        boolean isRightPresent = isPresent(node.right,value);

        return isLeftPresent || isRightPresent;

    }

    public boolean isPresentLogN( int value ){
        if (root == null){
            return false;
        }

        if (root.value == value){
            return true;
        }

        return isPresent( root, value);
    }

    private boolean isPresentLogN(Node node , int value){

        if(node == null){
            return false;
        }

        if(node.value == value){
            return true;
        }

        if(value < node.value){
            return isPresentLogN(node.left,value);
        }

        return  isPresentLogN(node.right,value);
    }

    public void preOrderTraversal(){
        preOrderTraversal(root);
    }

    private void preOrderTraversal(Node node) {

        if (node == null){
            return;
        }
        System.out.print(node.value + " ");
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void postOrderTraversal(){
        postOrderTraversal(root);
    }

    private  void postOrderTraversal(Node node){
        if (node == null){
            return;
        }

        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
        System.out.print(node.value + " ");
    }

    public void inOrderTraversal(){
        postOrderTraversal(root);
    }

    private  void inOrderTraversal(Node node){
        if (node == null){
            return;
        }

        preOrderTraversal(node.left);
        System.out.print(node.value + " ");
        preOrderTraversal(node.right);

    }
}
