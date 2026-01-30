import java.util.ArrayList;
import java.util.List;

public class Combinations {

    public static List<List<Integer>> ways;

    public static void printPath(int n , int k , List<Integer> output){

        if (k==0){
            ways.add(new ArrayList<>(output));
            return;
        }

        if (n==0 && k>0){
            return;
        }

        // Yes call.
        output.add(n);
        printPath(n-1,k-1,output);


        // No call.
        output.remove(output.size()-1);
        printPath(n-1,k,output);

    }

    public static void main(String [] args){
        ways = new ArrayList<>();
        List<Integer> output = new ArrayList<>();
        printPath(4,2,output);
        System.out.println(ways);

    }

}
