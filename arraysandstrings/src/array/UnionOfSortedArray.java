//package array;
//
////Problem Statement: Given two sorted arrays, arr1, and arr2 of size n and m. Find the union of two sorted arrays.
//
//import java.util.*;
//
//public class UnionOfSortedArray {
//
//    public static List<Integer> getUnionOfArray1(int [] arr1 , int [] arr2 ){
//        List<Integer> arrayList = new ArrayList<>();
//        SortedSet<Integer> hashSet = new TreeSet<>();
//        for(int i = 0 ; i< arr1.length ; i++){
//            hashSet.add(arr1[i]);
//        }
//        for(int i = 0 ; i< arr2.length ; i++){
//            hashSet.add(arr2[i]);
//        }
//        arrayList.addAll(hashSet);
//        return arrayList;
//    }
//
//    public static List<Integer> getUnionOfArray2(int [] arr1, int [] arr2){
//
//        List<Integer> ans = new ArrayList<>();
//
//        int i = 0;
//        int j = 0;
//
//        while (i<arr1.length  && j<arr2.length){
//
//            if (arr1[i]<=arr2[j]){
//
//                if (ans.isEmpty() || ans.getLast()!=arr1[i]){
//                    ans.add(arr1[i]);
//                }
//                i++;
//
//            }else{
//                if (ans.isEmpty() || ans.getLast()!=arr2[j]){
//                    ans.add(arr2[j]);
//                }
//                j++;
//            }
//
//        }
//
//        return ans;
//    }
//
//    public static void main(String [] args){
//     int[] arr1 = {1,2,3,4,5};
//     int[] arr2 = {2,3,4,4,5};
//     System.out.println(getUnionOfArray2(arr1,arr2));
//
//    }
//
//}
