package array;

public class Kadane_s_Algorithm {


    public static int getMaxContiguousSum(int [] array){

        int max_sum = Integer.MIN_VALUE;
        int max_sum_end_here = 0;

        for (int i= 0 ; i< array.length ; i++){

            max_sum_end_here+=array[i];

            if (max_sum<max_sum_end_here){
                max_sum=max_sum_end_here;
            }

            if (max_sum_end_here<0){
                max_sum_end_here=0;
            }

        }

        return max_sum;

    }

    public static void main(String [] args){

        int array [] = new int[]{2, 3, -8, 7, -1, 2, 3};
        System.out.println(getMaxContiguousSum(array));

    }

}
