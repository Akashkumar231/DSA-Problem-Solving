public class DecodeWays {

    // By Recursion it got implemented.
    public int getWays(String s , int index){
        // Base Condition
        if(s.length() == index){
            return 1;
        }

        // Negative Test case
        if(s.charAt(index)=='0'){
            return 0;
        }

        int ways=getWays(s,index+1);

        if(index+1<s.length()){

            int number = (s.charAt(index) - '0' )* 10 + ( s.charAt(index+1)- '0');

            if( number>= 10 && number<27){
                ways+=getWays(s,index+2);
            }


        }
        return ways;
    }

    public int getWays(String s ,int index , int [] dp){
// Base Condition
        if(s.length() == index){
            return 1;
        }

        // Negative Test case
        if(s.charAt(index)=='0'){
            return 0;
        }

        if (dp[index]!=-1){
            return dp[index];
        }

        dp[index] = getWays(s,index+1,dp);

        if(index+1<s.length()){

            int number = (s.charAt(index) - '0' ) * 10 + ( s.charAt(index+1)- '0');

            if( number>= 10 && number<27){
                dp[index]+=getWays(s,index+2,dp);
            }
        }
        return dp[index];
    }

    public int numDecodings(String s) {

        return getWays(s,0);
    }

}
