package array;

import java.util.ArrayList;
import java.util.List;

public class FindWordsContaining {

    public  static List<Integer> findWordsContaining(String[] words, char x) {

        List<Integer> ans = new ArrayList<>();

         for (int i = 0;i< words.length ; i++){

             if (words[i].contains(""+x)){
                 ans.add(i);
             }

         }

       return ans;

    }

    public static void main(String [] args){

        String [] words = new String[]{"abc","bcd","aaaa","cbc"};

        System.out.println(findWordsContaining(words,'a'));

    }

}
