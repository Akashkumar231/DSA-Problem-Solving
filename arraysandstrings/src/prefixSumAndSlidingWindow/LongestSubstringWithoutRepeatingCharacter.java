package prefixSumAndSlidingWindow;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {



    public static int getMaxLength(String array){

        int maxLength = 0;

        for(int i = 0; i < array.length() ; i++){

            Set<Character> hashSet = new HashSet<Character>();

            for(int j = i ; j< array.length() ; j ++){

                if (!hashSet.add(array.charAt(j))){
                    maxLength = Integer.max(maxLength,j-i);
                    break;

                }else {

                    hashSet.add(array.charAt(j));


                }

             }


        }

        return maxLength;

    }


    public static int getMaxLengthUsingHashMap(String array){

        int maxLength = 0;

        int right = 0 ;
        int left = 0;
        Map<Character ,Integer>  map = new HashMap<>();

        while (right < array.length()){

            if (map.containsKey(array.charAt(right)))
                left = Integer.max(map.get(array.charAt(right))+1 , left);
            map.put(array.charAt(right),right);
            maxLength= Math.max(maxLength,right-left+1);
            right++;
        }

        return maxLength;

    }

    public static void main(String [] args){

        String ans = "cadbzabcd";

        System.out.println(getMaxLength(ans));
        System.out.println(getMaxLengthUsingHashMap(ans));

    }


}
