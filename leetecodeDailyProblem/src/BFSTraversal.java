import java.util.List;
import java.util.Queue;
import java.util.ArrayList;
import java.util.LinkedList;

public class BFSTraversal {


}

//  Definition for a binary tree node.
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

class BFStraversal {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> answerList = new ArrayList<>();
        if(root == null){
            return answerList;
        }

        // Just create what you need to return


        // Create a Queue
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        // so we need to check if the queue is empty or not
        while(queue.size() != 0){

            int levelSize = queue.size();

            // Storing number of elements in array
            List<Integer> currentElements = new ArrayList<>(queue.size());

            for(int i = 0 ; i< levelSize ; i++){
                TreeNode node = queue.poll();
                currentElements.add(node.val);
                if(node.left!=null){
                    queue.add(node.left);
                }

                if(node.right!=null){
                    queue.add(node.right);
                }
            }

            answerList.add(currentElements);

        }

        return answerList;

    }
}