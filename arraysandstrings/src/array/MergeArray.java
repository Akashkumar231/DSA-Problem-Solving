package array;

import java.util.Arrays;

public class MergeArray {

    public static void mergeArray1(int [] array1 , int [] array2){
        int i = 0;
        int j = 0;
        int n1 = array1.length;
        int n2 = array2.length;
        int totalLength = n1+n2;
        int[] result =new int[totalLength];
        int k=0;
        while(i<n1 && j<n2)
        {
           if (array1[i]<array2[j]){
               result[k]=array1[i];
               i++;
           }
           else{
               result[k]= array2[j];
               j++;
           }
           k++;

        }
        while (i<n1){
            result[k]=array1[i];
            i++;
            k++;
        }
        while (j<n2){
            result[k]=array1[j];
            j++;
            k++;
        }
        System.out.println(Arrays.toString(result));

        i =0;
        while (i<array1.length){
            array1[i]=result[i];
            i++;
        }

        while (i<result.length){
            array2[i-array1.length]=result[i];
            i++;
        }
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

    }

    public static void mergeArray2(int [] array1  , int [] array2){

        int i = array1.length-1;
        int j = 0;

        while (i>=0 && j<= array2.length){

            if (array1[i]>array2[j]){
                int temp = array1[i];
                array1[i]=array2[j];
                array2[j]=temp;
                i--;
                j++;
            }else {
                break;
            }

        }
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));

    }

    public static void main(String[] args) {

       int arr1[] = new int[]{1, 4 ,8 ,10} ;
       int [] arr2 = new int[]{2,3,9};
//        System.out.println(arr1);
//        System.out.println(arr2);
        System.out.println("Method1 is solved.");
        mergeArray1(arr1,arr2);

        System.out.println("Method2 is solved.");
        mergeArray2(arr1,arr2);
    }

}
