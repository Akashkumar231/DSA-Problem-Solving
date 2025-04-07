package searching;

public class LinearSearch {

    public static boolean isPresent(int [] array , int target){

        if (array[0]==target || array[array.length-1]==target){
            return true;
        }

        for(int i = 0 ; i< array.length ;i++){
            if (array[i]== target){
                return true;
            }
        }
        return false;

    }

    public static void main(String []args){

     int [] array = new int[]{1,2,3,5,4,5,6,5};

        System.out.println(isPresent(array,45));



    }

}
