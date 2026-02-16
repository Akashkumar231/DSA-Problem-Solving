import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {

    public static void swap(int [] array , int firstIndex ,int secondIndex ){
        int temp = array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;
    }

    public static void sort(int [] array ){

        boolean isSwapped = false;

        for(int pass = 0 ; pass < array.length-1 ; pass++){

            for(int swap = 0 ; swap< array.length - 1 - pass; swap++){

                if (array[swap]>array[swap+1]){
                    swap(array,swap,swap+1);
//                    isSwapped = true;
                }

            }


        }

    }

    public static void main(String [] args){
        int [] array = new int[]{25,6,4,8,11};
        System.out.println(Arrays.toString(array));
        sort(array);
        System.out.println(Arrays.toString(array));
    }

}
