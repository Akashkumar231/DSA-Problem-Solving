package prefixSumAndSlidingWindow;

public class SubarrayWithSumK {


    public static boolean usingTwoLoops(int [] array , int K){


        for(int i = 0; i< array.length ; i++){

            int sum= 0;

            for(int j = i ; j< array.length ; j++){

                sum = sum + array[j];

                if(sum == K){
                    System.out.println(i + "    " + j);  // this step shows the index that we require for the summing the total
                    return true;
                }


            }




        }

        return false;

    }

/*
    Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

    A subarray is a contiguous non-empty sequence of elements within an array.

*/

    public static int getNumberOfSubArray(int [] array  , int K){

        int isPresent = 0;

        for(int i = 0 ; i< array.length ; i++){

            int sum = 0;

            for(int j = i ; j< array.length ; j++){

                  sum = sum + array[j];
                if (sum == K){

                    isPresent++;
                }


            }


        }


        return isPresent;
    }


    public static void main(String [] args){

        int [] array = new int [] {1,2,3};

        System.out.println(getNumberOfSubArray(array,3));


    }


}
