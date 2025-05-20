package array;

import java.util.Arrays;

public class FindingNextPermutation {

    public static void swap(int [] array , int firstIndex , int secondIndex){

        int temp = array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;

    }

    public static void getNextPermutation(int [] array ){

        // breaking point of index.
        int idx = -1;
        for(int i = array.length-2 ; i>=0 ;i--){
            if (array[i]<array[i+1]){
                idx = i;
                break;
            }
        }
        System.out.println(idx);
     // swapping the elemeSubscribednt
        if (idx != -1) {
            for (int i = array.length - 1; i > idx; i--) {
                if (array[i] > array[idx]) {
                    swap(array, i, idx);
                    break;
                }
            }
        }
        // reversing the element in the array
        int left = idx+1;
        int right = array.length-1;
        while (left<right){
            swap(array,left,right);
            left++;
            right--;
        }
    }

    public static void main(String [] args){
    int [] array = new int[]{3,2,1};
    getNextPermutation(array);
    System.out.println(Arrays.toString(array));
    }
}
