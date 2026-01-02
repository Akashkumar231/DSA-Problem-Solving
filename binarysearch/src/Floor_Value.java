import java.util.Enumeration;

public class Floor_Value {

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

    public static void main(String [] args){
        int [] array = new int[] {10,20,25,26,35,65,100,110};
        System.out.println(getFloorValue(array,65));
    }
}
