import java.util.Arrays;

public class reverseAnArray {

    public static void swap(int [] array , int i , int j )
    {
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }

    public static void reverseArray(int [] array, int i , int j ){

        if (i == j){
            return;
        }

        swap(array,i,j);
        reverseArray(array,i+1,j-1);

    }

    public static void main(String [] args){

        int [] array = new int[]{1,2,3,4,5};
        reverseArray(array,0,array.length-1);
        System.out.println(Arrays.toString(array));

    }

}
