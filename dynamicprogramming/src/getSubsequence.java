import java.util.ArrayList;
import java.util.List;

public class getSubsequence {

   public static  List<String> asnwerList = new ArrayList<>();

    public static void getSub(String word , int index , String answer){
        if(index == word.length()){
            getSubsequence.asnwerList.add(answer);
            return;
        }

        // Adding String ;
        getSub(word,index+1 , answer+word.charAt(index));

        // Not taking String;
        getSub(word,index+1,answer);

    }

    public static void main(String [] args){

        String string = "abc";

        getSub(string,0,"");

        System.out.println(asnwerList);

    }

}
