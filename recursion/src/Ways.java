import java.util.ArrayList;
import java.util.List;

public class Ways {

    public static List<String> ways;

    public static int getNoWays(String input , int index , String output){

        if (index == input.length()){
            ways.add(output);
            return 1;
        }

        int digit = input.charAt(index) - '0';
        char letter = (char) (digit+64);
        if (digit == 0){
            return 0;
        }

        int count = getNoWays(input,index+1,output+letter);

        if (index+1<input.length()){
             digit = ((input.charAt(index) - '0') * 10 ) +(input.charAt(index+1) - '0') ;
             letter = (char) (digit+64);

             if (digit>10 && digit<26){
                 count+= getNoWays(input,index+2,output+letter);
             }
        }
        return count;
    }

    public static void main(String [] args){
        ways = new ArrayList<>();
        System.out.println(getNoWays("2123",0,""));
        System.out.println(ways);
    }


}
