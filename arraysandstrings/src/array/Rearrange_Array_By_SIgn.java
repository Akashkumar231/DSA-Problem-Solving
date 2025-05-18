package array;

import java.util.ArrayList;
import java.util.Arrays;

public class Rearrange_Array_By_SIgn {

    public static void rearrangeArray1(int [] array){

        ArrayList<Integer> posArray = new ArrayList<>();
        ArrayList<Integer> negArray = new ArrayList<>();

        for (int i = 0 ; i< array.length ;i++){
            if (array[i]<0){
                negArray.add(array[i]);
            }else {
                posArray.add(array[i]);
            }
        }

        for (int i = 0;i<array.length/2 ;i++){
            array[i*2]=posArray.get(i);
            array[i*2+1]=negArray.get(i);
        }

    }

    public static void rearrangeArray2(int [] array)
    {
         int [] ans = new int[array.length];

         int i = 0;
         int pos = 0;
         int neg = 1;

       while (i<array.length){
           if (array[i]<0){
               ans[neg]=array[i];
               neg+=2;
           }else{
               ans[pos]=array[i];
               pos+=2;
           }

           i++;
       }

        System.out.println(Arrays.toString(ans));

    }

    public static void main(String [] args){
      int [] array = new int[]{3,1,-2,-5,2,-4};
      rearrangeArray2(array);
    }

}
