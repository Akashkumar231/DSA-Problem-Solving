package prefixSumAndSlidingWindow;

import java.util.HashSet;
import java.util.Set;

public class MaxConsecutiveOnes {

    public static int getMaxConsecutiveOnes1(int [] array , int k){

        int maxLength = 0;

        for(int i = 0 ; i< array.length ; i++){

            int count_0 = 0;

            for(int j = i  ; j< array.length ; j++){

                if (array[j] == 0){
                    count_0++;

                }

                if (count_0<=k){
                    maxLength = Integer.max(maxLength,j-i+1);
                }else{
                    break;
                }


            }


        }



        return maxLength;

    }


    public static int getMaxConsecutiveOnes2(int [] array , int k){


        int left = 0;
        int right = 0;
        int zero = 0;
        int maxLength = 0;

        while (right< array.length){

            if(array[right] == 0)
                zero++;

          if(zero>k){
                if (array[left]==0)
                    zero--;
                left++;

            }

            if(zero<=k){
                maxLength = Integer.max(maxLength,right-left+1);
            }

            right++;

        }

      return maxLength;

    }

    public static void main(String [] args){

          int [] array = new int[]{1,1,1 ,0,0,0,1,1,1,1,0};

          System.out.println(getMaxConsecutiveOnes1(array,2));
          System.out.println(getMaxConsecutiveOnes2(array,2));

    }


}
