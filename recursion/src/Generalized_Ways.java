import java.util.ArrayList;
import java.util.List;

public class Generalized_Ways {

    private static List<String> ways;

    public static void get_no_ways(String input , int index , String output , int count){

        if (index == input.length()){
            output= output +  (count>0?count:"");
            ways.add(output);
            return;
        }

        // No call
        get_no_ways(input,index+1,output,count+1);

        // Yes call
        char ch = input.charAt(index);
        output += (count>0?count+"":"") + ch;
        get_no_ways(input,index+1,output,0);

    }

    public static void main(String [] args){
        ways = new ArrayList<>();
        get_no_ways("abc",0,"",0);
        System.out.println(ways);
    }

}
