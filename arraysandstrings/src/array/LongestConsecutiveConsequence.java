package array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveConsequence {

    // This part gives time limit exceed error.
    public static int getLongestConsecutiveConsequence1(int [] array){
        Set<Integer> hashset = new HashSet<>();
        int length = 0;
        int maxLength = Integer.MIN_VALUE;
        for(int element : array){
            hashset.add(element);
        }
        int preElement = Integer.MIN_VALUE;
        for (int i = 0;i< array.length ; i++){
            int element = array[i];
            if (preElement== array[i]){
                continue;
            }
            while (hashset.contains(element)){
                length++;
                element+=1;
            }
            preElement=array[i];
            maxLength = Math.max(maxLength,length);
            length=0;
        }
        return maxLength;
    }



    public static int getLongestConsecutiveConsequence2(int [] array){
        int length = 1;
        Arrays.sort(array);
        int element = array[0];
        int longestSubsequence = Integer.MIN_VALUE;
        for(int i = 0;i< array.length ;i++){

            if (array[i]==element+1){
                length++;
                element+=1;
                longestSubsequence = Math.max(length,longestSubsequence);
            }
            else if (element!=array[i]){
                 element=array[i];
                 length=1;
            }

        }
       return longestSubsequence;
    }
    public static void main(String []args){

        int [] array = new int[]{102,4,100,1,101,3,2,1,1};
        System.out.println(getLongestConsecutiveConsequence1(array));
        System.out.println(getLongestConsecutiveConsequence2(array));

    }

}
