package array;

import java.util.HashMap;

public class GetLongestSubArraySum {

    public static int getMaxLengthSum(int [] array , long k){

        int maxLength = 0;

        long sum = 0;

        HashMap<Long,Integer> hashMap =new HashMap<>();

        for(int i = 0 ; i< array.length ;i++){

            sum = sum + array[i];

            if (sum == k){
                maxLength = Integer.max(maxLength , i+1);
            }

            long rem = sum - array[i];

            if (hashMap.containsKey(rem)){
                int length = i-hashMap.get(rem);
                maxLength = Integer.max(length,maxLength);
            }

            //Finally, update the map checking the conditions:
            if (!hashMap.containsKey(sum)) {
                hashMap.put(sum, i);
            }

        }

      return maxLength;

    }

    public static void main(String [] args){
        int[] a = {2, 3, 5, 1, 9};
        long k = 10;
        System.out.println(getMaxLengthSum(a,k));

    }


}
