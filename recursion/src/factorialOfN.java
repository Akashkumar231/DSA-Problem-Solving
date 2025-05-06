public class factorialOfN {

    public static int getFact(int n){

        if(n == 1){
            return 1;
        }

        int fact = n* getFact(n-1);
        return fact;
    }

    public static void main(String [] args){

        System.out.println(getFact(5));
    }

}
