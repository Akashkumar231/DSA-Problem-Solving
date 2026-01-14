public class power_n {

    // Expectation // time complexity related to this function is n.

    public static double powerFunction1(double x , long n){

        if ( n == 0){
            return 1;
        }

        // Faith
        double smallAns = powerFunction1(x,n-1);

        // Remaining Work.
        double bigAns = x * smallAns;

        return bigAns;
    }

    public static double powerFunction2(double x , long n){
        if ( n == 0){
            return 1;
        }

        // Faith
        if (n%2==1){
            double smallAns = powerFunction2(x,n-1);
            double bigAns = smallAns * x;
            return bigAns;
        }

        double smallAns = powerFunction2(x,n/2);
        double bigAns = smallAns * smallAns;
        return bigAns;

    }


    public static void main(String [] args){

        double x = 2.00000;
        int n = 10;
        System.out.println(powerFunction1(x,n));
        System.out.println(powerFunction2(x,n));

    }
}
