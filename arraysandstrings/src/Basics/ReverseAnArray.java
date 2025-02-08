package Basics;

import java.util.Arrays;

public class ReverseAnArray {


    public static void swap(int [] array , int first ,int second){

        int temp = array[first];
        array[first]=array[second];
        array[second]=temp;


    }

    public static void reverse(int [] array){

        int left = 0;
        int right = array.length-1;

        while (left<=right){

            swap(array,left,right);
            left++;
            right--;
        }


    }


    public static void main(String [] args){


        int [] array = new int[]{1,2,3,4,5,6};
        reverse(array);
        System.out.println(Arrays.toString(array));

    }

}
