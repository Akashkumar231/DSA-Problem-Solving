package array;

import java.util.Arrays;

public class LeftRotateAnArrayByOnePlace {

    public static void swap(int [] array , int i , int j){
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public static void reverseArray(int [] array , int i , int j){

        while (i<=j){
            swap(array,i,j);
            i++;
            j--;
        }


    }

    public static void leftRotate2(int [] array , int d){
        reverseArray(array,0,d-1);
        reverseArray(array,d,array.length-1);
        reverseArray(array,0,array.length-1);
    }

    public static void leftRotate(int [] array , int k){

        int noOfRotation = k % array.length;

        while (noOfRotation>0){

            int lastElement = array[0];

            for (int i = 1 ; i<array.length ; i++){
                array[i-1]=array[i];
            }
            array[array.length-1]=lastElement;
            noOfRotation--;
        }

        System.out.println(Arrays.toString(array));

    }

    public static void main(String [] args){
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        leftRotate2(arr,2);
        System.out.println(Arrays.toString(arr));
    }

}
