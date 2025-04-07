package SortingAlgorithms;
/*
  Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order.
  This algorithm is not suitable for large data sets as its average and worst-case time complexity are quite high.

  Complexity Analysis of Bubble Sort:
    Time Complexity: O(n2)
    Auxiliary Space: O(1)

  Advantages of Bubble Sort:
    Bubble sort is easy to understand and implement.
    It does not require any additional memory space.
    It is a stable sorting algorithm, meaning that elements with the same key value maintain their relative order in the sorted output.

  Disadvantages of Bubble Sort:
    Bubble sort has a time complexity of O(n2) which makes it very slow for large data sets.
    Bubble sort has almost no or limited real world applications. It is mostly used in academics to teach different ways of sorting.

*/

import java.util.Arrays;

public class BubbleSortAlgorithm {

    public static void swap(int [] array , int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;
    }

    public static void doSort(int [] array){

        boolean isSorted = true;
        for (int i = 0; i< array.length ;i++){

            for(int j = 0 ; j< array.length-1-i ; j++){

                if (array[j]>array[j+1]){
                    swap(array,j, j+1);
                    isSorted=false;
                }
//                System.out.println("IsSorted");
            }
            if (isSorted){
                return;
            }

        }



    }

    public static void main(String [] args){
        int [] array = new int[]{1,2,3,4,5,6,7};
        doSort(array);
        System.out.println(Arrays.toString(array));

    }

}
