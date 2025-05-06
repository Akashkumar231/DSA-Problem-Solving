public class SumOfN {

    public static int doSum(int n )
    {
        if (n==0){
            return 0;
        }
        int subSum = n + doSum(n-1);
        return subSum;
    }

    public static void main(String [] args){

        System.out.println(doSum(5));

    }
}
