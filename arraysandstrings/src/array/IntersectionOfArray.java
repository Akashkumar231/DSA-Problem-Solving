package array;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfArray {

    public static List<Integer> getIntersectionArray1(int [] arr1 ,  int [] arr2){
        List<Integer> ans = new ArrayList<>();
        int [] isVisited  = new int[arr2.length];
        for (int i = 0 ; i< arr1.length ; i++){
            for (int j = 0 ; j< arr2.length ; j++){
                if (arr1[i]==arr2[j] && isVisited[j]==0){
                    System.out.println(arr1[i] + " = " + arr2[j] );
                    ans.add(arr1[i]);
                    isVisited[j]=1;
                    break;
                }
                if (arr1[i]<arr2[j]){
                    break;
                }
            }
        }
        return ans;
    }

    public static List<Integer> getIntersectionArray2(int [] arr1 , int [] arr2){

        List<Integer> ans = new ArrayList<>();
        int i = 0 ;
        int j = 0;
        while (i<arr1.length && j<arr2.length){

            if (arr1[i]<arr2[j] ){
                i++;
            }else if (arr1[i]>arr2[j]){
                j++;
            }else{
                ans.add(arr1[i]);
                i++;j++;
            }


        }
        return ans;



    }
    public static void main(String [] args){
        int[] arr1 = {1,1,2,2,3,4,5,5,7,8,9,10};
        int[] arr2 = {2,2,3,3,4,4,5,5,10};
        System.out.println(getIntersectionArray2(arr1,arr2));

    }

}
