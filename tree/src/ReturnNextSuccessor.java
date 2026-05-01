import com.sun.source.tree.Tree;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Queue;
public class ReturnNextSuccessor {

    public static TreeNode returnNextSuccessor(TreeNode node , int key){

        if (node == null){
            return node;
        }

        Queue<TreeNode> nodeLinkedList =new LinkedList<TreeNode>();
        nodeLinkedList.offer(node);
        while(!nodeLinkedList.isEmpty()){
            TreeNode tempNode = nodeLinkedList.poll();
            if (node.left!=null){
                nodeLinkedList.offer(tempNode.left);
            }
            if(node.right!=null){
                nodeLinkedList.offer(tempNode.right);
            }
            if (node.val == key){

                break;
            }

        }
   return nodeLinkedList.peek();
    }

    public static void main(String [] args){

    }

}
