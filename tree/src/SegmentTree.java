public class SegmentTree {

   private Node root;


    private static class Node{

        private int data;
        private Node left;
        private Node right;
        private int leftInterval;
        private int rightInterval;

        Node(int data ,int leftInterval , int rightInterval){
            this.data = data;
           this.leftInterval = leftInterval;
           this.rightInterval = rightInterval;
            this.left = null;
            this.right = null;
        }
    }

    public  void constructTree(int [] array){

          root = constructTree(root, array,0,array.length-1);
    }

    public void displayTree(){
        displayTree(root);
    }


    private void displayTree(Node node){

        if (node== null){
            return;
        }

        // root Node

        System.out.println("Node data : " + node.data + " formed from : left " + node.leftInterval + " & right " + node.rightInterval);
        displayTree(node.left);
        displayTree(node.right);
    }

    private Node constructTree(Node nodeT , int [] array , int left , int right){

        if (left == right){
            Node leaf = new Node(array[left],left,right);
            return leaf;
        }

        Node node = new Node(0,left,right);

        int mid = (left + right) / 2;

        node.left = constructTree(node,array ,left, mid);
        node.right = constructTree(node,array,mid+1,right);

        node.data = node.left.data + node.right.data;

        return node;
    }

    public int query (int qsi ,int qei)
    {
       return query(root, qsi, qei);
    }

    private int query(Node node , int qsi , int qei){

        if(qsi<=node.leftInterval && qei <= node.rightInterval){
            // node is completely lying inside the query
            return node.data;
        }
        else if(
                qsi < node.leftInterval || qei > node.rightInterval
        ){
            return 0;
        }
        else{
            return this.query(node.left,qsi,qei)+ this.query(node.right,qsi,qei);
        }

    }

    public void updatingNode(int index ,int value){
        this.root.data = updatingNode(root,index ,value);
    }

    private int updatingNode(Node root , int index , int value){
        if (index >= root.leftInterval && index<=root.rightInterval){
            if (index == root.leftInterval && index == root.rightInterval){
                root.data = value;
                return root.data;
            }else{
                int leftAns = updatingNode(root.left,index,value);
                int rightAns = updatingNode(root.right,index,value);
                root.data = leftAns +rightAns;
                return root.data;
            }
        }
        return root.data;
    }
}
