package prefixSumAndSlidingWindow;

import java.util.ArrayList;
import java.util.List;

public class SubarrayWithSizek {

    public static List<Integer> getSumList(int [] array, int k){

        List<Integer>  ans = new ArrayList<>();

        for(int i = 0; i< array.length ; i++){


            int count = 0;
            int sum = 0;

            while(count<k  &&  i+count<array.length){

                sum=sum + array[i+count];
                count++;

            }

             ans.add(sum);

        }

        return ans;

    }

    public static List<Integer> usingSlidingWindow(int [] array , int k){


        // Type Constant Size Window

        List<Integer> ans = new ArrayList<>();
        int left = 0;
        int right = 0;
        int sum = 0;
        while (right<k){
            sum = sum+array[right];
            right++;
        }
        ans.add(sum);
        while (right<array.length-1){
            sum = sum - array[left];
            left++;
            sum= sum+array[right];
            right++;
            ans.add(sum);
        }
        return ans;
    }

    public static void main(String [] args){

        int [] array = new int[]{4,5,4,6,7,8,9,3};

        List<Integer> ans = usingSlidingWindow(array,2);

        System.out.println(ans);


    }


}
