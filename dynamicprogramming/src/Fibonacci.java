import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Fibonacci {

    /*
      Fibonacci Series.
      0 1 1 2 3 5 8 13 21 34
     */
    // Memoization  Topdown Approach.
    public static int getFibonacci(int [] dp , int n){

        if (n<=1){
            dp[n]=n;
            return dp[n];
        }

        if (dp[n]!=-1)
            return dp[n];

        dp[n]=getFibonacci(dp,n-1)+getFibonacci(dp,n-2);
        return dp[n];
    }

    // Tabulation
    public static int getFibonacci(int n , int [] dp){

        dp[0] = 0;
        dp[1]=1;

        for (int index = 2 ; index <  n ; index++){
            dp[2]= dp[index-1] + dp[index-2];

        }

        return dp[n];

    }

    public static void main(String [] args){
        System.out.println("Learning Dynamic Playlist");
        int n = 6;
        int [] dp = new int [n+1];
        Arrays.fill(dp,-1);
        System.out.println(getFibonacci(dp,n));
        System.out.println(getFibonacci(n,dp));
    }

}
