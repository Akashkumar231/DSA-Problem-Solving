
/*
You are given an integer array nums. You are initially positioned at the array's first index, and each element in the array represents your maximum jump length at that position.

Return true if you can reach the last index, or false otherwise.
 */

public class Jump_Game {

    public static boolean solve(int [] array , int index , boolean [] dp){

        if (dp[index]){
            return dp[index];
        }

        if(index >= array.length -1 ){
            return dp[index] =true;
        }

        System.out.println("Index we are on index : " + index);

        for(int jump = 1 ; jump <= array[index] ; jump++){
            if (solve(array, index + jump,dp)) {

                return dp[index] =true;
            }
        }
        System.out.println("Not possible to reach last Index from this " + index + " Index");
       return false;
    }

    // Greedy optimal Solution
    public static boolean solve(int [] array ){

        int farthest = 0;

        for(int index =  0; index < array.length ; index++)
        {
             if(index > farthest){
                 return false;
             }

             farthest = Math.max(farthest,index+array[index]);

             if (farthest>=array.length-1){
                 return true;
             }
        }

        return false;
    }

    public static void main(String [] args){
        int [] array = new int[] {3,2,1,0,4};
        boolean [] dp = new boolean[array.length];
        System.out.println(solve(array,0,dp));
        System.out.println(solve(array));
    }

}
