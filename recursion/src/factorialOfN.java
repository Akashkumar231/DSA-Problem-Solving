public class factorialOfN {

    public static long getFact(int n){

        if(n == 1){
            return 1;
        }

        long smallAns = getFact(n-1);

        long bigAns = smallAns * n;

        return bigAns;
    }

    public static void main(String [] args){

        System.out.println(getFact(5));
    }

}
