import java.util.ArrayList;
import java.util.List;

public class PrintSubsequences {

   private static List<String> result = null;

    public  static void printSubsequences(String word , int index , String ans){

        if (index == word.length()){
            result.add(ans);
            System.out.println(ans);
            return;
        }

        printSubsequences(word,index+1,ans+word.charAt(index));

        printSubsequences(word,index+1,ans);

    }

    public static void main(String [] args){
        result=new ArrayList<>();
        printSubsequences("abc",0,"");
        System.out.println(result);
    }

}
