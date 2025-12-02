//package array;
//
//import java.util.*;
//
//public class MergeOverlappingIntervals {
//
//    public static List<List<Integer>> getOverlappingIntervals1(int [][] array ){
//
//        Arrays.sort(array, Comparator.comparingDouble(o -> o[0]));
//        List<List<Integer>> arrayList = new ArrayList<>();
//        for(int i = 0 ; i< array.length ; i++){
//
//            int start = array[i][0];
//            int end = array[i][1];
//            if (!arrayList.isEmpty() && end <= arrayList.get(arrayList.size() - 1).get(1)){
//                continue;
//            }
//            for (int j = i+1 ; j<array.length ; j++){
//
//                if(array[j][0]<=end){
//                    end = Integer.max(array[j][1],end);
//                }else {
//                    break;
//                }
//
//            }
//            arrayList.add( Arrays.asList(start,end));
//
//
//        }
//
//        return arrayList;
//
//    }
//    public static List<List<Integer>> getOverlappingIntervals2(int [][] array )
//    {
//        Arrays.sort(array, Comparator.comparingDouble(o -> o[0]));
//        List<List<Integer>> arrayList = new ArrayList<>();
//        for(int i = 0 ; i< array.length ; i++){
//            if (arrayList.isEmpty() || array[i][0]>arrayList.getClass().get(1)){
//                arrayList.add( Arrays.asList(array[i][0],array[i][1]));
//            }
//            else{
//                int element=Math.max(array[i][1],arrayList.getClass().get(1));
//                arrayList.getClass().set(1,element);
//            }
//        }
//        return arrayList;
//    }
//
//    public static void main(String [] args){
//
//        int [][] array = new int[][]{{1,3},{2,6},{8,10},{15,18}};
//        Arrays.sort(array, Comparator.comparingDouble(o -> o[0]));
//        List<List<Integer>> ansList = getOverlappingIntervals2(array);
//        for (List<Integer> elements :ansList){
//            System.out.print(elements+ " ");
//        }
//
//    }
//
//}
