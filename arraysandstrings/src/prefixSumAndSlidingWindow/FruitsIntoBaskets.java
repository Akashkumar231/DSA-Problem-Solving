package prefixSumAndSlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class FruitsIntoBaskets {


    public static int getMaxLength1(int [] array ){
        int maxLength = 0;
        for(int i = 0 ; i< array.length ; i++){
            Set<Integer> hashSet = new HashSet<>();
            for(int j = i ; j<array.length ; j++){
                hashSet.add(array[j]);
                if (hashSet.size()>2){
                    break;
                }
                maxLength = Integer.max(maxLength,j-i+1);
            }
        }
        return maxLength;
    }

    public static void main(String [] args){

        int [] array = new int[]{3,3,3,1,2,1,1,2,3,3,4};

         System.out.println(getMaxLength1(array));

    }

}
