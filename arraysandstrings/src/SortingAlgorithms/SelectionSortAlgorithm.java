package SortingAlgorithms;

import java.util.Arrays;

/*
        Complexity Analysis of Selection Sort
        Time Complexity: O(n2) ,as there are two nested loops:

        One loop to select an element of Array one by one = O(n)
        Another loop to compare that element with every other Array element = O(n)
        Therefore overall complexity = O(n) * O(n) = O(n*n) = O(n2)

        Advantages of Selection Sort

        Easy to understand and implement, making it ideal for teaching basic sorting concepts.
        Requires only a constant O(1) extra memory space.
        It requires less number of swaps (or memory writes) compared to many other standard algorithms. Only cycle sort beats it in terms of memory writes. Therefore it can be simple algorithm choice when memory writes are costly.
        Disadvantages of the Selection Sort
        Selection sort has a time complexity of O(n^2) makes it slower compared to algorithms like Quick Sort or Merge Sort.
        Does not maintain the relative order of equal elements which means it is not stable.
*/

public class SelectionSortAlgorithm {

    public static void swap(int [] array , int firstIndex, int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;
    }

    public static void doSort(int [] array){

        for(int i = 0 ; i< array.length; i++){

            int smallElementIndex = i;

            for(int j = i+1 ;j < array.length ; j++){

                if (array[j]< array[smallElementIndex]){
                    smallElementIndex=j;
                }

            }
            swap(array,i,smallElementIndex);



        }


    }


    public static void main(String [] args){

        int [] array = new int[]{2,1,0};
        doSort(array);
        System.out.println(Arrays.toString(array));

    }


}
