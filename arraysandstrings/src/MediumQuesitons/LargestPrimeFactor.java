package MediumQuesitons;

public class LargestPrimeFactor {

    public static int getLargestPrimeFactor(int n){

        if (n == 0 ||  n==1){
            System.out.println("No prime Factors.");
            return -1;
        }

        int maxPrime = Integer.MIN_VALUE;
        while (n%2 == 0){
            maxPrime=2;

            n=n/2;
        }

        for (int i = 3 ; i<=Math.sqrt(n); i+=2){

            while (n%i==0){
                if (maxPrime<i){
                    maxPrime=i;
                }
                n=n/i;
            }

        }

        if (n>2){
            maxPrime= Math.max(maxPrime, n);
        }
return maxPrime;
    }

    public static void main(String [] args){

        System.out.println(getLargestPrimeFactor(1));
    }

}
