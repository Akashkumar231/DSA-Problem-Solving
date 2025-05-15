package two_pointer_technique;

public class LongestSubarrayWIthSum {

    public static int getLongestSubArray(int [] array ,int k)
    {

        int sum = array[0];
        int maxLength = 0;
        int left = 0;
        int right = 0;

        while (right<array.length){
            while (sum>k){
                sum=sum-array[left];
                left++;
            }

            if (sum==k){
                maxLength = Math.max(maxLength,right-left+1);
            }

            right++;
            if (right<array.length){
                sum=sum+array[right];
            }
        }
        return maxLength;

    }

    public static void main(String [] args){

        int[] a = {2, 3, 5, 1, 9};
        int k = 10;
        System.out.println(getLongestSubArray(a,k));

    }

}
