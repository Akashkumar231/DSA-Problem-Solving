import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortAlgorithm {

    public static void mergeSort(int [] array , int low , int high){

        if (low>=high){
            return;
        }
        int mid = (low + high) / 2 ;
        mergeSort(array,low,mid);
        mergeSort(array,mid+1,high);
        merge(array,low,mid,high);
    }

    public static void merge(int [] array , int low , int mid , int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right  = mid+1;

        while (left<=mid && right<=high)
        {
              if (array[left] <= array[right]){
                  temp.add(array[left]);
                  left++;
              }else{
                  temp.add(array[right]);
                  right++;
              }
        }

        while (left<=mid){
            temp.add(array[left]);
            left++;
        }

        while (right<=high){
            temp.add(array[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            array[i] = temp.get(i - low);
        }

    }

    public static void main(String [] args){

        int arr[] = { 9, 4, 7, 6, 3, 1, 5 };
        System.out.println("Before sorting array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println();
        mergeSort(arr, 0, arr.length- 1);
        System.out.println(Arrays.toString(arr));
    }

}
