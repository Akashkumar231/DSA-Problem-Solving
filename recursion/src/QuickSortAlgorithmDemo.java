import java.util.Arrays;

public class QuickSortAlgorithmDemo {

    public static void swap(int [] array ,int i , int j){
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public static void QuickSort(int [] array , int low , int high){
        if (low<high){
            int pivotIndex = getPivot(array,low , high);
            QuickSort(array,low,pivotIndex-1);
            QuickSort(array,pivotIndex+1,high);
        }
    }

    private static int getPivot(int[] array, int low, int high) {

        int pivotElement = array[low];

        int i  = low;
        int j = high;

        while (i<j){
            while (array[i]<=pivotElement && i < high){
                i++;
            }
            while (array[j]>pivotElement && j >low){
               j--;
            }
            if (i<j){
                swap(array,i,j);
            }
        }
        swap(array,low,j);
        return j;

    }

    public static void main(String [] args){

        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        QuickSort(arr, 0, arr.length- 1);
        System.out.println(Arrays.toString(arr));


    }

}
