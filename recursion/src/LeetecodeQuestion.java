public class LeetecodeQuestion {

    public int minimumCost(int[] nums) {
        int firstElement = nums[0];

        int firstSmaller = Integer.MAX_VALUE;
        int secondSmaller = Integer.MAX_VALUE;

        for(int i = 1 ; i< nums.length ; i++){
            if(nums[i]<firstSmaller){
                secondSmaller = firstSmaller;
                firstSmaller = nums[i];

            }else if(nums[i]<secondSmaller){
                secondSmaller=nums[i];
            }
        }

        System.out.println(firstElement+ " " + firstSmaller + " " + secondSmaller);
        return firstElement+firstSmaller+secondSmaller;
    }

}
