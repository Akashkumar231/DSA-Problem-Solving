public class Cousins_in_Binary_Tree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
    public TreeNode getNode(TreeNode node , int x){
        if (node == null){
            return null;
        }

        if(node.val == x){
            return node;
        }

        TreeNode tempNode = getNode(node.left,x);

        if(tempNode != null){
            return  tempNode;
        }

        return getNode(node.right, x);

    }

    public boolean isSibling(TreeNode node ,TreeNode x , TreeNode y){

        if(node == null){
            return false;
        }

        return (node.left == x && node.right == y) || (node.left == y && node.right ==x)||
                isSibling(node.left,x,y) ||  isSibling(node.right,x,y);

    }

    public int level(TreeNode node, TreeNode x, int lvel){

        if (node == null){
            return 0
;        }

        if (node == x){
            return lvel;
        }

        int level = level(node.left , x, lvel+1);
        if (level!=0){
            return  level;
        }
        return  level(node.right,x,lvel+1);
    }

    public boolean isCousins(TreeNode root, int x, int y) {

        TreeNode xx = getNode(root , x);
        TreeNode yy = getNode(root,y);

        return (level(root,xx,0) == level(root,yy,0)) && !isSibling(root,xx , yy);

    }



    public static void main(String [] args){

    }

}
