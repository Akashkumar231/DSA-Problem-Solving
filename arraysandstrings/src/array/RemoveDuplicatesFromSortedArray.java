package array;

import java.util.Arrays;

public class RemoveDuplicatesFromSortedArray {

    public static void swap(int [] num, int first , int second){

        int temp = num[first];
        num[first]=num[second];
        num[second]=temp;

    }

    public static int [] removeDuplicates(int [] num){

        int left = 0 ;
        int right = 1;

        while (left<right && right<num.length){
            if (num[left] == num[right]){
                right++;
            }else {
                left++;
                swap(num
                        ,left,right);
                right++;
            }
        }

        return num;
    }

    public static void main(String [] args){

        int [] num = new int[]{0,1,2,3,4};

         System.out.println(Arrays.toString(removeDuplicates(num)));

    }

}
