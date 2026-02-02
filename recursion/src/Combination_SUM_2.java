import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_SUM_2 {

    List<List<Integer>> ways ;

    public void printPaths(int[] coins , int target , int index , List<Integer> output){

        if(target < 0)
            return;

        if(index == coins.length){
            if(target == 0){
                ways.add(new ArrayList<Integer>(output));
            }
            return;
        }

        // yes
        output.add(coins[index]);
        printPaths(coins, target - coins[index],index+1,output);
        output.remove(output.size()-1);


        // No condition.
        if(output.size()>0 && output.get(output.size()-1)==coins[index])
            return;
        printPaths(coins,target,index+1,output);

    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        ways = new ArrayList<>();
        printPaths(candidates,target,0,new ArrayList<Integer>());
        return ways;
    }

    public static void main(String [] args){

    }

}
