public class No_Ways {

    public static int getNumberOfWays(int[] dp , int stairs)
    {
        if(stairs<=1){
            return 1;
        }

        int jump1 = getNumberOfWays(dp, stairs-1);
        int jump2 = getNumberOfWays(dp,stairs-2);

        return jump1+jump2;
    }

    public static void main(String [] args){
        System.out.println(getNumberOfWays(new int []{1,2,3,4,5,6} , 3));
    }
}
