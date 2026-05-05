import java.util.Arrays;

public class Longest_Common_Subsequence {

    public static int getCommonSubsequence(String m1 , String n1 , int m , int n){

        if (m == 0 || n==0){
            return 0;
        }

        if (m1.charAt(m-1)==n1.charAt(n-1)){
            return 1 + getCommonSubsequence(m1,n1,m-1,n-1);
        }


        else{
            return  Math.max(getCommonSubsequence(m1,n1,m-1,n),getCommonSubsequence(m1,n1,m,n-1));
        }

    }

    // Using Memoization
    public static int getCommonSubsequence(int [][] dp , String m1 , String n1 , int m , int n){

        // hitting base condition
        if(m == 0 || n == 0){
            return 0;
        }


        if (dp[m][n]!=-1){
            return dp[m][n];
        }

        if (m1.charAt(m-1)== n1.charAt(n-1)){
            return dp[m][n]= 1+ getCommonSubsequence(dp,m1,n1,m-1,n-1);
        }

        dp[m][n] =  Math.max(getCommonSubsequence(dp,m1,n1,m,n-1),getCommonSubsequence(dp,m1,n1,m-1,n));

        return dp[m][n];

    }


    public static void main(String [] args){
        String word1 = "AGGTAB";
        String word2 = "GXTXAYB";
        int [][] dp = new int[word1.length()+1][word2.length()+1];

        for (int index= 0 ;  index<word1.length()+1 ; index++){
            Arrays.fill(dp[index],-1);
        }



        System.out.println(getCommonSubsequence(dp,word1,word2,word1.length(),word2.length()));

        System.out.println(getCommonSubsequence(word1,word2,word1.length(),word2.length()));
        for (int index= 0 ;  index<word1.length()+1 ; index++){
            System.out.println(Arrays.toString(dp[index]));
        }
    }

}
