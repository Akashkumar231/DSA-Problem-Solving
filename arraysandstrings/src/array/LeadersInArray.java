package array;

import java.util.*;

public class LeadersInArray {

    public static List<Integer> getLeaders(int [] array){

        List<Integer> result = new ArrayList<>();
        int n = array.length-1;
        int leader = array[n];
        result.add(leader);
        for (int i = n-1 ; i>=0;i--)
        {
            if (array[i]>leader){
                leader = array[i];
                result.add(leader);
            }
        }

        Collections.reverse(result);
        return result;
    }

    public static void main(String [] args){
        int [] array  = new int[]{10,22,12,3,0,6};
        System.out.println(getLeaders(array));

    }

}
