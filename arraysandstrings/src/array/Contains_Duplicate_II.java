package array;

import java.util.HashMap;
import java.util.Map;

public class Contains_Duplicate_II {

    public static boolean containsNearbyDuplicate2(int[] nums, int k) {
        Map<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                if (Math.abs(hashMap.get(nums[i]) - i) <= k) {
                    return true;
                }
            }
            // Always update the index
            hashMap.put(nums[i], i);
        }

        return false;
    }
    public static boolean containsNearbyDuplicate1(int[] nums, int k)
    {
        for(int i = 0 ; i< nums.length ; i++){
            for(int j =  i+1 ; j<nums.length ; j++){
                if (nums[i] == nums[j]  && Math.abs(i-j)<=k){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String [] args){
        int [] nums = new int[]{1,2,3,1,2,3};
        int k = 3;
        System.out.println(containsNearbyDuplicate2(nums,3));
    }


}
