import java.util.Arrays;

public class MergeArray {

    public static int [] mergeArray(int [] array1 , int [] array2){

        int n1 = array1.length;
        int n2 = array2.length;

        int [] mergeArray = new int[n1+n2];

        int index = 0;
        int p1 = 0;
        int p2 = 0;

        while(p1<array1.length && p2<array2.length){

            if (array1[p1]<= array2[p2]){
                mergeArray[index]=array1[p1];
                p1++;

            }else{
                mergeArray[index]=array2[p2];
                p2++;

            }
            index++;
        }

        while (p1<array1.length){
            mergeArray[index]=array1[p1];
            p1++;
            index++;
        }

        while (p2<array2.length){
            mergeArray[index]=array2[p2];
            p2++;
            index++;
        }

        return mergeArray;

    }

    public static void main(String [] args){
        int [] arr1 = new int[]{10,30,50,60,70};
        int [] arr2= new int[] {20,40,60,80,90,100,110};
        System.out.println(Arrays.toString(mergeArray(arr1,arr2)));
    }

}
