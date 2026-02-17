import java.util.Arrays;

public class InsertionSort {

    public static void swap(int [] array , int firstIndex , int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;
    }

    public static void selectionSort(int [] array){

        for(int pass = 1; pass < array.length ; pass++){

              for (int j = pass ; j>0 ; j--){

                  if (array[j] < array[j-1]){
                      swap(array,j,j-1);
                  }
              }

        }


    }
    public static void main(String [] args){
        int [] array = new int[]{25,6,4,8,11};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }

}
