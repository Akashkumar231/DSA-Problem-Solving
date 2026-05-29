public class Minimum_Element_After_Replacement_With_Digit_Sum_3300 {

    public int sumOfDigits(int num)
    {

        int sum = 0;
        while(num != 0){
            sum += num % 10 ;
            num = num / 10;
        }
        return sum ;
    }

    public int minElement(int[] nums) {


        int minElements = Integer.MAX_VALUE;

        for(int index = 0 ; index < nums.length ; index++){
            int digit = sumOfDigits(nums[index]);
            minElements = Math.min(digit,minElements);
        }

        return minElements;
    }

    public int minElement1(int[] nums) {

        // Here Adding the sum of the digit and storing in the array again.
        for(int index = 0 ; index < nums.length ;index++){
            nums[index]= sumOfDigits(nums[index]);
        }

        // Now finding Minimum Elements
        int minElements = Integer.MAX_VALUE;

        for(int index = 0 ; index < nums.length ; index++){
            if(nums[index] < minElements){
                minElements = nums[index];
            }
        }

        return minElements;
    }

}
