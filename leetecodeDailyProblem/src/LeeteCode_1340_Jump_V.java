import java.util.Arrays;

public class LeeteCode_1340_Jump_V {

    public static int dfs(int [] array , int [] dp , int index ,int d){

        if (dp[index] != -1){
            return dp[index];
        }

        int maxSize = 1;

        // Left Part

        for(int next = index - 1 ; next>=Math.max(0,index - d) ;next--){

            if (array[next] >= array[index]){
                break;
            }
           maxSize = Math.max(maxSize, 1 + dfs(array,dp,next,d));
        }

        for (int next = index + 1 ; next <= Math.min(array.length-1,index+d) ; next++){
            if (array[next] >= array[index]){
                break;
            }
            maxSize = Math.max(maxSize,1+dfs(array,dp,next,d));
        }

        dp[index]=maxSize;
        return dp[index];

    }

    public static int maxIndex(int [] array , int d){

        int [] dp = new int[array.length];

        Arrays.fill(dp,-1);

        int answer = 1;

        for (int index = 0 ; index < array.length ; index++){

            answer = Math.max(answer,dfs(array,dp,index,d));


        }

        return answer;

    }


    public static void main(String[]  args){

        int [] array =new int[]{6,4,14,6,8,13,9,7,10,6,12};
        int d = 2;
        System.out.println(maxIndex(array,d));


    }

}
