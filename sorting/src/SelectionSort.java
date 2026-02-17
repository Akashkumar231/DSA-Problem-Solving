import java.util.Arrays;

public class SelectionSort {

    public static void swap(int [] array , int firstIndex , int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;
    }

    public static void insertionSort(int [] array){

        for(int pass = 0 ; pass < array.length ; pass++){

            int minIndex = pass;

            for(int j = pass+1 ; j< array.length ; j++){

                if(array[j] < array[minIndex]){
                    minIndex = j;
                }

            }

            swap(array,pass,minIndex);

        }


    }
    public static void main(String [] args){
        int [] array = new int[]{25,6,4,8,11};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }

}
