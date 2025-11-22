package Basics;

public class MaxProductOfTwoElements {

    public static int getMax(int [] array)
    {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 0 ; i< array.length ; i++)
        {

            if (largest <array[i]){
                secondLargest = largest;
                largest= array[i];
            }else if (secondLargest<array[i]){
                secondLargest=array[i];
            }
            if (smallest >array[i]){
                secondSmallest = smallest;
                smallest= array[i];
            }else if (secondSmallest>array[i]){
                secondSmallest=array[i];
            }

        }
        System.out.println(largest*secondLargest);
        System.out.println(smallest*secondSmallest);

        return Math.max(largest*secondLargest,smallest*secondSmallest);

    }

    public static void main(String [] args){

        int [] array = new int[]{10,20,-30,40,-20,60,-50,-60};
        System.out.println(getMax(array));

    }

}
