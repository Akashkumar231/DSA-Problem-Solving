package Basics;

import java.util.Arrays;

public class ShiftRightByOnePlace {

    public static void shiftRight(int [] array){

        int element = array[array.length-1];

        for(int i = array.length - 2 ; i >= 0 ; i--){

            array[i+1]=array[i];

        }

        array[0]=element;

    }

    public static void main(String [] args){

        int [] array = new int[]{1,2,3,4,5,6};
        shiftRight(array);
        System.out.println(Arrays.toString(array));



    }

}
