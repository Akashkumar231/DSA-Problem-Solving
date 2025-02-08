package Basics;

import java.util.Arrays;

public class DeleteElement {


    public static void deleteElement(int [] array , int index){

        for (int i = index; i< array.length-1; i++ ){

            array[i] = array[i+1];

        }





    }

    public static void main(String [] args){

        int [] array = new int[]{1,2,3,4,5,6};
        deleteElement(array,2);
        System.out.println(Arrays.toString(array));

    }

}
