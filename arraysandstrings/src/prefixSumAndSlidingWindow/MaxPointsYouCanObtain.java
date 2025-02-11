package prefixSumAndSlidingWindow;

public class MaxPointsYouCanObtain {


    public static int getMaxCardPoint(int [] array , int K){

        int leftSum = 0;
        int rightSum = 0;
        int maxSum= 0;

        for(int i = 0 ; i< K; i++){

            leftSum = leftSum + array[i];

        }

    maxSum = leftSum;
        int rightIndex = array.length-1;

        for(int i = K-1 ; i>=0 ; i--){

            leftSum = leftSum - array[i];
            rightSum = rightSum + array[rightIndex];
            rightIndex--;
            maxSum = Integer.max(maxSum,leftSum+rightSum);


        }




        return maxSum;
    }


    public static void main(String [] args){

        int [] array = new int [] {6,2,3,4,7,2,7,1};

        System.out.println(getMaxCardPoint(array,4));


    }


}
