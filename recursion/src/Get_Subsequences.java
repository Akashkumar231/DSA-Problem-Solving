import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Get_Subsequences {

    public static List<String> getSubsequences(String word , int index){

        if (index == word.length() ){
            List<String> stringList = new ArrayList<>();
            stringList.add(" ");
            return stringList;
        }

        List<String> resultList = getSubsequences(word,index+1);
        int length = resultList.size();
        for (int element =  0 ; element < length ; element++){
           String newWord = word.charAt(index) + resultList.get(element);
           resultList.add(newWord);
        }

        return resultList;

    }

    public static void main(String [] args){

        System.out.println(getSubsequences("abc",0));

    }

}
