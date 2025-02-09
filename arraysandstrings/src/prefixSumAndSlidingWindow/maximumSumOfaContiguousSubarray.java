package prefixSumAndSlidingWindow;

public class maximumSumOfaContiguousSubarray {


    // Constant Length Problem

    public static int getMaxSum(int [] array , int k){

        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int left = 0;
        int right = 0;

        while (right<k){

            sum = sum + array[right];
            right++;

        }

        maxSum = Integer.max(sum,maxSum);

        while (right<array.length){

            sum = sum - array[left];

            left++;

            sum = sum + array[right];

            right++;

            maxSum = Integer.max(sum,maxSum);


        }


       return maxSum;

    }

    public static void main(String [] args){


        int [] array = new int[]{4,5,4,6,7,8,9,3};

        System.out.println(getMaxSum(array,2));


    }


}
