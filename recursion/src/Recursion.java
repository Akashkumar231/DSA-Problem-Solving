public class Recursion {

    public static int getFibonacci(int n){

        if (n<=1){
            return n;
        }
        int first = getFibonacci(n-1);
        int last = getFibonacci(n-2);
        return first+last;

    }

    public static void main(String [] args){

        System.out.println(getFibonacci(4));

    }

}
