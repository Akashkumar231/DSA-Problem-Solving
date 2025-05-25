package Hashing;

import java.util.HashMap;
import java.util.Map;

public class Longest_Palindrome_by_Concatenating_Two_Letter_Words {

    public  static int getLongestPalindrome(String [] words){

        int result = 0;
        // Create a Map
        Map<String ,Integer> hashMap = new HashMap<>();

        for(String w : words){
            String reverseWord = w.charAt(1)+""+w.charAt(0);
            if(hashMap.getOrDefault(reverseWord,0)>0){
                result+=4;
                hashMap.put(reverseWord,hashMap.get(reverseWord)-1);
            }else{
                hashMap.put(w,hashMap.getOrDefault(w,0)+1);
            }
        }

        // Looking for same word

        for (Map.Entry<String,Integer> entry : hashMap.entrySet()){
            String word = entry.getKey();
            int count = entry.getValue();

            if (word.charAt(0) == word.charAt(1) && count>0){
                result+=2;
                break;
            }

        }

       return result;

    }
    public static void main(String [] args){

        String [] words = new String[]{"lc","cl","gg"};
        System.out.println(getLongestPalindrome(words));

    }

}
