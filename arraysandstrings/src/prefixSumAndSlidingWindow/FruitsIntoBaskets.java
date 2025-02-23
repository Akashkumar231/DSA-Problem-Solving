package prefixSumAndSlidingWindow;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FruitsIntoBaskets {

    // Brute Force Approach

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

    public static int getMaxLength2(int [] array ){

        int right , left , maxLength ;
        right = left = maxLength = 0;
        HashMap< Integer , Integer > hashMap = new HashMap<>();

        while (right< array.length){

            hashMap.put(array[right],hashMap.getOrDefault(array[right],0)+1);

            if (hashMap.size()>2){

                while (hashMap.size()>2){

                    hashMap.put(array[left],hashMap.getOrDefault(array[left],0)-1);

                    if (hashMap.get(array[left])==0){

                    hashMap.remove(array[left]);

                    }
                    left++;
                }

            }

            if (hashMap.size()<=2){
                maxLength = Integer.max(right - left + 1 ,maxLength);
            }


       right++;


        }


return maxLength;


    }


    public static void main(String [] args){

        int [] array = new int[]{3,3,3,3,3,3,3,1,2,1,1,2,1,2,1,2,3,3,4};

         System.out.println(getMaxLength2(array));
         System.out.println(getMaxLength1(array));

    }

}
