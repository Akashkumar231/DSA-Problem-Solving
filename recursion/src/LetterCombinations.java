import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCombinations {
    private static List<String> ways;
    private static String [] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void printPath(String input , int index , String output){

        if (index == input.length()){
            ways.add(output);
            return;
        }

        int digit = input.charAt(index) - '0';

        for (char letter : map[digit].toCharArray()){
            printPath(input,index+1,output+letter);
        }

    }

    public static void main(String [] args){
        String digits = "123";
        ways = new ArrayList<>();
        if (digits.length() == 0){
            System.out.println(ways);
        }
        printPath(digits,0,"");
        System.out.println(ways);
    }


}
