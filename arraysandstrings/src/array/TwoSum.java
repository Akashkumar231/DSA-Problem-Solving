package array;

import java.util.Arrays;

public class TwoSum {

    public static int[] sum(int[] num, int target){

        int [] ans = new int[2];
        int firstIndex = -1;
        int lastIndex = -1;

        for (int i = 0 ; i< num.length ; i++){
                    firstIndex = i;
             for (int j = i+1 ; j < num.length ;j++ ){

                 if (num[firstIndex]+num[j]==target){
                     ans[0]=firstIndex;
                     ans[1]=j;
                     return ans;
                 }


             }

        }

        return ans;

    }

    public static void main(String [] args){

        int [] num = new int[]{3,2,4};
        System.out.println(Arrays.toString(sum(num,6)));

    }

}
