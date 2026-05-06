import java.util.Arrays;

public class Climbing_Nth_Stairs {


    public static int getNoWays( int n){

        // if the nth stair is 0 it will return 1
        if(n==0){
            return 1;
        }

        // If the n value less than 0 return 0;
        if (n<0){
            return 0;
        }

        int no_Of_ways = getNoWays(n-1)+getNoWays(n-2)+getNoWays(n-3);

        return no_Of_ways;

    }

    public static int getNoWays(int [] dp , int n){

        // if the nth stair is 0 it will return 1
        if(n==0){
            return 1;
        }

        // If the n value less than 0 return 0;
        if (n<0){
            return 0;
        }

        if (dp[n]!=-1){
            return dp[n];
        }

        return  dp[n] =getNoWays(n-1)+getNoWays(n-2)+getNoWays(n-3);


    }


    public static void main(String [] args){
        int n = 4;
        int [] dp = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(getNoWays(dp,n));
        System.out.println(Arrays.toString(dp));
    }

}
