package prefixSumAndSlidingWindow;

public class BinarySubarrayWithSum {

    public static int getNumberOfSubArrays(int[] num, int goal){

        if (goal<0){
            return 0;
        }

        int left = 0, right = 0 , count = 0;
        int sum = 0;

        while (right<num.length){

            sum = sum + num[right];

            while (sum>goal){
                sum = sum - num[left];
                left++;
            }
            count = count + (right - left+1);


            right++;

        }

       return count;

    }

    public static void main(String [] args){

        int [] num = new int[]{1,0,1,0,1};
        int goal = 2;
        System.out.println(getNumberOfSubArrays(num,goal) - getNumberOfSubArrays(num,goal-1));

    }

}
