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

    public static void main(String [] args){

        String word1 = "ABC";
        String word2 = "ABC";
        System.out.println(getCommonSubsequence(word1,word2,word1.length(),word2.length()));

    }

}
