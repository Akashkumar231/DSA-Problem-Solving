import java.util.ArrayList;
import java.util.List;

public class K_Closest_Element {


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

    public static List<Integer> findClosestElements(int [] array , int k ,int target){

        int floor = getFloorValue(array,target);
        int ciel  = floor + 1;

        for (int count = 0 ; count<k ; count++){

            int floorDist = (floor == -1)?Integer.MAX_VALUE : ( target - array[floor]);
            int cielDist  = (ciel == array.length) ? Integer.MAX_VALUE : ( array[ciel]-target);

            if (floorDist<=cielDist){
                floor--;
            }else {
                ciel++;
            }

        }
        List<Integer> result = new ArrayList<>();
        for (int index = floor+1; index < ciel ; index++){
            result.add(array[index]);
        }
        return result;
    }

    public static void main(String [] args){

      int []   arr = new int[]{1,2,3,4,5} ;
      int k = 4;
      int x = 3;
        System.out.println(findClosestElements(arr,k,x));
    }

}
