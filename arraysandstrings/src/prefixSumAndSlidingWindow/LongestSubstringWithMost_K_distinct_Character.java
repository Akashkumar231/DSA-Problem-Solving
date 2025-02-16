package prefixSumAndSlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithMost_K_distinct_Character {

  public static int getSubstring1(String string , int k ){

      int maxLength = 0;

      for(int i = 0 ; i< string.length() ; i++){

          Set<Character> set = new HashSet<>();

          for(int j =  i ; j< string.length() ; j++){

              set.add(string.charAt(j));

              if (set.size()<= k){
                  maxLength= Integer.max(j-i+1 , maxLength);
              }

          }

      }

      return maxLength;

  }

    public static int getSubstring2(String string , int k){

      int maxLength = 0;

      int left = 0;
      int right = 0;

      Map<Character , Integer> hashMap = new HashMap<>();

      while (right< string.length()){

         hashMap.put(string.charAt(right) , hashMap.getOrDefault(string.charAt(right),0)+1);

          if (hashMap.size()>k){

           while (hashMap.size()>k){

               hashMap.put(string.charAt(left),hashMap.getOrDefault(string.charAt(left),0)-1);
               if (hashMap.get(string.charAt(left))==0){
                   hashMap.remove(string.charAt(left));
               }
                  left++;

           }

          }

          if (hashMap.size()<=k){
              maxLength = Integer.max(right - left + 1 ,maxLength);
          }

   right++;

      }

return maxLength;
    }


    public static void main(String [] args){

        String word = "aaaddddbbbbbbccd";
        int k = 2 ;
        System.out.println(getSubstring1(word,k));
        System.out.println(getSubstring2(word,k));

    }


}
