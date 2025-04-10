package array;

// Leetecode Question no : 3375. Minimum Operations to Make Array Values Equal to K

import java.util.Arrays;

public class MinOperationsToK {

    public static int minOperations(int[] nums, int k) {
        Arrays.sort(nums);

        int count = 0;
        boolean smallerExist = false;
        int greaterK = 0;
        int lastGreater = -1;
        for(int num : nums){

            if(num == k){
                count++;
            }else if(num>k){
                if(num != lastGreater){
                    lastGreater = num;
                    greaterK ++;
                }
            }else{
                smallerExist = true;
            }
        }

        if(count == nums.length)return 0;
        if(smallerExist) return -1;
        return greaterK;

    }


    public static void main(String [] args){

    int [] array = new int[]{5,2,5,4,5};
        System.out.println(minOperations(array,2));

    }

}
