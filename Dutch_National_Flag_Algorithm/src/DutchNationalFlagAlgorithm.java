import java.util.Arrays;

public class DutchNationalFlagAlgorithm {

    public static void swap(int [] array , int firstIndex ,int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;

    }


    public static void DutchFlagAlgorithm(int [] array){


        int low = 0;
        int mid = 0;
        int high = array.length-1;

        while (mid<=high){

            if (array[mid]==0){
                swap(array,low,mid);
                low++;
                mid++;
            } else if (array[mid]==2) {
                swap(array,mid,high);
                high--;
            }else {
                mid++;
            }

        }



    }

    public static void main(String [] args){

        int [] array = new int[]{0,1,2,0,1,2,1,2,0,0,0,1};
        DutchFlagAlgorithm(array);
        System.out.println(Arrays.toString(array));
    }

}
