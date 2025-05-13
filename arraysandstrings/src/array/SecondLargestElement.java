package array;

public class SecondLargestElement {

    public static int getSecondLargestElement(int [] array){

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for(int i= 0 ; i< array.length  ; i++){

            if (firstLargest<array[i]){
                secondLargest = firstLargest;
                firstLargest= array[i];

            }else if(secondLargest<array[i] && array[i]!=firstLargest){
                secondLargest=array[i];
            }

        }

        return secondLargest;

    }

    public static void main(String [] args){
        int [] array = new int[]{9,9,9,5,6,9,8,7,7,8,8,8,8,-5,-6,-8,3};
        System.out.println(getSecondLargestElement(array));
    }

}
