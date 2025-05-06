package array;

import java.util.Arrays;

public class RemoveElements {

    public static int removeElements(int [] num , int value)
    {
       int [] ans = new int[num.length];

       int count= 0;

       for (int i = 0 ; i< num.length ; i++){

          if (num[i] != value){
              ans[count]=num[i];
              count++;
          }
       }
        num
                =ans;
       System.out.println(Arrays.toString(num));
       return count;

    }

    public static int removeElement(int [] array , int value){

       int i=0;

       for(int j = 0 ; j< array.length ; j++){

           if (array[j]!=value){
               int temp = array[i];
               array[i]=array[j];
               array[j]=temp;
               i++;
           }

       }
        System.out.println(Arrays.toString(array));
       return i;


    }

    public static void main(String [] args){

        int [] num = new int[]{3,2,2,3};

        System.out.println(removeElement(num,3));
    }

}
