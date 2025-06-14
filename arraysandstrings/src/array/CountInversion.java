package array;

import java.util.ArrayList;

public class CountInversion {



    public static int mergeSort(int [] array , int low , int high)
    {
        int count =0 ;
        if (low>=high){
            return count;
        }


        int mid = (low + high) / 2 ;
        count+=mergeSort(array,low,mid);
        count+= mergeSort(array,mid+1,high);
        count+=merge(array,low,mid,high);
        return count;
    }

    public static int merge(int [] array , int low , int mid , int high){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right  = mid+1;
        int count=0;
        while (left<=mid && right<=high)
        {
            if (array[left] <= array[right]){
                temp.add(array[left]);
                left++;
            }else{
                count+=mid-left+1;
                temp.add(array[right]);
                right++;
            }
        }

        while (left<=mid){
            temp.add(array[left]);
            left++;
        }

        while (right<=high){
            temp.add(array[right]);
            right++;
        }

        for (int i = low; i <= high; i++) {
            array[i] = temp.get(i - low);
        }
        return count;
    }

    public static int getCountInversion1(int [] array)
    {
        int count = 0;
        for(int i = 0 ; i< array.length ;i++){
            for (int j = i+1 ; j<array.length ; j++){
                   if (array[i]>array[j]){
                       count++;
                   }
            }
        }return count;

    }

    public static int getCountInversion2(int [] array){
       int count = 0;
       count=mergeSort(array,0,array.length-1);
       return count;
    }

     public static void main(String [] args){
        int [] array = new int[]{5,3,2,4,1};
         System.out.println(getCountInversion1(array));
        System.out.println(getCountInversion2(array));
     }

}
