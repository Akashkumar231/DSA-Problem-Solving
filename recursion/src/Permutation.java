import java.util.ArrayList;
import java.util.List;

public class Permutation {

    List<List<Integer>> way ;

    public void printPaths(int [] nums ,  boolean [] bools , List<Integer> orders)
    {
        if(orders.size() == nums.length){
            way.add(new ArrayList<>(orders));
            return;
        }
        for(int idx = 0  ; idx < nums.length ; idx++)
        {
            if(bools[idx]== true)
                continue ;
            orders.add(nums[idx]);
            bools[idx]=true;
            printPaths(nums,bools,orders);
            orders.remove(orders.size()-1);
            bools[idx]=false;
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        way = new ArrayList<>();
        List<Integer> orders =new ArrayList<Integer> ();
        boolean [] bools = new boolean[nums.length];
        printPaths(nums,bools,orders);
        return way;
    }


}
