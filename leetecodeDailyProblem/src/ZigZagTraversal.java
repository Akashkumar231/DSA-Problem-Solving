import java.util.List;
import java.util.LinkedList;
import java .util.ArrayList;
import java.util.Queue;
import java.util.Collections;

public class ZigZagTraversal {

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

        if(root == null){
            return new ArrayList<>();
        }

        // Create what you have to return
        List<List<Integer>> answerList =new ArrayList<>();

        // Create a Queue
        Queue<TreeNode> queue = new LinkedList<>();

        // Adding root node
        queue.offer(root);

        int count = 0;

        while(!queue.isEmpty()){

            int nodeListSize = queue.size();

            List<Integer> nodeValues = new ArrayList<Integer>();

            for(int index = 0 ; index<nodeListSize ; index++)
            {
                TreeNode tempNode = queue.poll();
                nodeValues.add(tempNode.val);
                if(tempNode.left!=null){
                    queue.offer(tempNode.left);
                }
                if(tempNode.right != null){
                    queue.offer(tempNode.right);
                }

            }

            if(count%2!=0){
                Collections.reverse(nodeValues);
                answerList.add(nodeValues);
            }else{
                answerList.add(nodeValues);
            }
            count++;
        }

        return answerList;

    }

}
