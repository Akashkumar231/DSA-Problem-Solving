public class Fibonacci {

    public  static long fibonacci(long n){

        // base condition
        if(n<=1){
            return n;
        }

        // faith
        long firstAns = fibonacci(n-1);

        long secondAns = fibonacci(n-2);

        // remaining work
        long lastAns = firstAns + secondAns;

        return lastAns;


    }

    public static void main(String [] args){

        System.out.println(fibonacci(6));
    }

}
