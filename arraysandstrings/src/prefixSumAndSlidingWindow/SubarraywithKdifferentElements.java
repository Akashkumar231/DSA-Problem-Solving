package prefixSumAndSlidingWindow;

import java.util.*;

public class SubarraywithKdifferentElements {

    public static int getSubArrayWithKDifferentElements(int [] array, int k ){
       int count = 0;

       for(int i = 0; i< array.length ; i++){

           Set<Integer> hashset = new HashSet<>();

           for(int j = i ; j< array.length ; j++){

               hashset.add(array[j]);

               if (hashset.size()==k) count++;

               if (hashset.size()>k) break;
           }

       }

        return count;
    }


    public static int getSubArrayWithDifferentElements(int[] array, int k) {
        int count = 0;
        int left = 0;
        int right = 0;
        Map<Integer, Integer> map = new HashMap<>();

        while (right < array.length) {
            // Add the right element to the map
            map.put(array[right], map.getOrDefault(array[right], 0) + 1);

            // Shrink the window if the number of distinct elements is more than k
            while (map.size() > k) {
                map.put(array[left], map.get(array[left]) - 1);
                if (map.get(array[left]) == 0) {
                    map.remove(array[left]);
                }
                left++; // Move left pointer forward
            }

            // Count valid subarrays ending at 'right'
            count += (right - left + 1);
            right++; // Expand the window from the right
        }

        return count;
    }

    public static void main(String [] args){

        int [] array = new int[]{1,2,1,3,4};

        System.out.println(getSubArrayWithKDifferentElements(array,3));
        System.out.println(getSubArrayWithDifferentElements(array,3) - getSubArrayWithDifferentElements(array,2));


    }

}
