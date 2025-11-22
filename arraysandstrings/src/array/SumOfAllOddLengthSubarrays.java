package array;

public class SumOfAllOddLengthSubarrays {

    public static int getAllSumOfAllLength(int [] array){


        int totalSum = 0;

        for (int i = 0 ; i< array.length ; i++){
            int subArray = 0;
            for (int j = i ; j<array.length ; j++){
                subArray+=array[j];
                if (j-i+1 %2!=0){
                    System.out.println(subArray);
                    totalSum+=subArray;
                }
            }
        }

        return totalSum;

    }

    public static void main(String [] args){

        int [] array =new int[]{10,20,30,40,50};
        System.out.println(getAllSumOfAllLength(array));

    }

}
