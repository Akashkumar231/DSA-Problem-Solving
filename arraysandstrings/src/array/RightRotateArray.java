package array;

import java.util.Arrays;

public class RightRotateArray {


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

    public static void rotateRight2(int [] array , int d){
        reverseArray(array,0,array.length-d-1);
        reverseArray(array,array.length-d,array.length-1);
        reverseArray(array,0,array.length-1);
    }


    public static void rotateRight(int [] array , int d)
    {
        int n = array.length;
        int [] temp =new int[array.length-d];

        for (int i = 0 ; i<temp.length ; i++){
            temp[i]=array[i];
        }

        for (int i =n-d ; i<n ; i++ ){
            array[i -(n-d)]= array[i];
        }

        for (int i = d ; i<array.length ;i++){
            array[i]=temp[i-d];
        }


    }

    public static void main(String [] args){
        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        rotateRight2(arr,2);
        System.out.println(Arrays.toString(arr));

    }


}
