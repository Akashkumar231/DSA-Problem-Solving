import java.util.Arrays;

public class Remove_Minimum_Element {

    public static int getFloorValue(int [] array , int target){

        int left = 0;
        int right = array.length - 1 ;
        while (left<=right){
            int mid =left + (right - left)/2;
            if (array[mid] == target){
                right = mid - 1;
            }else  if (array[mid] > target){
                right = mid  - 1;
            }else {
                left = mid + 1;
            }
        }
        return right;
    }

    public static int getMinimumElement(int [] array){
        int minRemoval = array.length;
        Arrays.sort(array);
        for (int min = 0; min < array.length ; min++){
            int max = getFloorValue(array,2*array[min]+1);
            int removals = array.length - (max -min + 1);
            System.out.print(removals + "        ");
            minRemoval = Math.min(minRemoval , removals);
        }
        return minRemoval;
    }

    public static void main(String [] args){
      int [] array = new int[]{4,5,100,9,10,11,12,15,200};

        System.out.println( "Ans  : " + getMinimumElement(array));
    }
}
