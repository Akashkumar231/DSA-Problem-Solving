package Basics;


import java.util.Arrays;

public class InsertElementAtPosition {


      public static void insertAtIndex(int [] array , int index , int element)
      {

           for(int i = array.length-2 ; i>= index ; i--){

               array[i+1] = array[i];

           }

           array[index]=element;


      }

      public static void main(String [] args){

         int [] array = new int[]{1,2,3,4,5,6};
         insertAtIndex(array,3,45);
         System.out.println(Arrays.toString(array));

      }

}
