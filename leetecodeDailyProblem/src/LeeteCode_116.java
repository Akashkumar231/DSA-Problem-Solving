public class LeeteCode_116 {

    public Node getNewTree(Node root){


        Node leftMostNode = root;

        while(leftMostNode != null){

            Node currentNode = leftMostNode;
            while(currentNode.next!=null){
                currentNode.left.next = currentNode.right;
                if (currentNode.next!=null){
                    currentNode.right.next = currentNode.next.left;
                }
                currentNode = currentNode.next;
            }
leftMostNode = leftMostNode.left;
        }


        return root;
    }

}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
