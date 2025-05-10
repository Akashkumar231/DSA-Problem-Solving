package Hashing;

public class NumberCounts {

    public static int getCounts(int [] array , int number){

        int max_value = Integer.MIN_VALUE;



        for (int i = 0 ; i< array.length ; i++){

            if (max_value< array[i]){
                max_value = array[i];
            }

        }

        int [] hashArray = new int[max_value+1];

        for (int i = 0; i< array.length ; i++){

           hashArray[array[i]]++;

        }



        return hashArray[number];
    }

    public static void main(String [] args){

        int [] array = new int[]{1,2,3,2,2,5,2,5,4,5,5,5,5};
        System.out.println(getCounts(array,2));

    }

}
