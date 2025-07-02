public class BinarySearch {

    public static int getIndex(int [] array , int target){

        if (array.length == 0){
            return -1;
        }

        int low = 0;
        int high = array.length-1;


        while (low<=high){
            int mid = low + (high - low)/2;

            if (array[mid] == target){
                return mid;
            }else if (array[mid]<target){
                low = mid + 1 ;
            }else {
                high = mid - 1 ;
            }

        }

        return -1;

    }

    public static void main(String [] args)
    {

        int [] array = new int [] {2,3,6,7,8,8,11,11,11,12};
        System.out.println(getIndex(array,11));

    }

}
