package searching;

public class BinarySearchAlgorithm {

    public static int binarySearch(int [] array , int target){

        int low = 0;
        int high = array.length-1;

        while (low<=high){

            int mid = low + (high - low)/2;

            if (array[mid] == target){
                return mid;
            }else if (array[mid] < target){
                low=mid+1;
            }else {
                high=mid-1;
            }

        }
        return -1;
    }
    public static void main(String [] args){
        int [] array = new int[]{1,2,5,6,8,10,15,19};
        System.out.println(binarySearch(array,1500));
    }

}
