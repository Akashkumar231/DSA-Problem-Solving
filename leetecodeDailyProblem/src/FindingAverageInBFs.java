import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;


public class FindingAverageInBFs {
    public List<Double> averageOfLevels(TreeNode root) {

        // First Create what we need to return :)

        List<Double> answer = new ArrayList<>();

        // Queue for BFS
        Queue<TreeNode> queue =new LinkedList<>();

        queue.offer(root);

        while(queue.size()!=0){

            int levelSize = queue.size();

            double value = 0.0;

            for(int index = 0 ; index < levelSize ; index++){
                TreeNode temp = queue.poll();
                value += temp.val;
                if(temp.left!=null){
                    queue.offer(temp.left);
                }

                if(temp.right!=null){
                    queue.offer(temp.right);
                }
            }
            value = value / levelSize;

            answer.add(value);
        }
        return answer;
    }

}
