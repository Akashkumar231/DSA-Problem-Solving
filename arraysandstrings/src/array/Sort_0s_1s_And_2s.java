package array;

import java.util.Arrays;

public class Sort_0s_1s_And_2s {

    public static void swap(int [] array , int firstIndex ,int secondIndex){
        int temp = array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;

    }

    public static void sort012_1(int [] array){

        int count0= 0;
        int count1= 0;
        int count2= 0;

        for (int value : array) {

            if (value == 0) {
                count0++;
            } else if (value == 1) {
                count1++;
            } else {
                count2++;
            }

        }

        for (int i = 0 ;i<count0;i++){
            array[i]=0;
        }

        for (int j =count0 ; j<count0+count1 ; j++){
            array[j]=1;
        }

        for (int k = count0+count1 ; k<count0+count1+count2 ;k++){
            array[k]=2;
        }


    }

    public static void sort012_2(int [] array)
    {

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
         sort012_2(array);
         System.out.println(Arrays.toString(array));

    }

}
