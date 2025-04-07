package SortingAlgorithms;

/*

     Insertion sort is a simple sorting algorithm that works by iteratively inserting each element of an unsorted list into its correct position in a sorted portion of the list.
     It is like sorting playing cards in your hands. You split the cards into two groups: the sorted cards and the unsorted cards.
     Then, you pick a card from the unsorted group and put it in the right place in the sorted group.

    We start with the second element of the array as the first element is assumed to be sorted.
    Compare the second element with the first element if the second element is smaller then swap them.
    Move to the third element, compare it with the first two elements, and put it in its correct position
    Repeat until the entire array is sorted.

    Advantages
    Simple and easy to implement.
    Stable sorting algorithm.
    Efficient for small lists and nearly sorted lists.
    Space-efficient as it is an in-place algorithm.
*/

import java.util.Arrays;

public class InsertionSortAlgorithm {

    public static void doSort(int [] array){

        for(int i = 1; i< array.length ; i++){

            int element = array [i];
            int j = i-1;
            while (j>=0 && array[j]>element){
                array[j+1]=array[j];
                j--;
            }
            array[j+1]=element;

        }

    }

    public static void main(String [] args){
        int [] array = new int[]{1,82,32,-4,95,66,7,8,0,500};
        doSort(array);
        System.out.println(Arrays.toString(array));


    }

}
