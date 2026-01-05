public class findPeakElement {

    public static int peakElement(int [] array){
        int left = 0;
        int right = array.length - 1;
        if (array[left] < array[left+1]){
            return left;
        }
        if (array[right] > array[right-1]){
            return right;
        }

        while(left <= right){
            int mid = left + (right - left)/2;
            if( array[mid-1] < array[mid] && array[mid+1] < array[mid]){
                return mid;
            }else if(array[mid] > array[mid-1]){
                left = mid + 1;
            }else{
                right = mid - 1;
            }
        }
        return -1;

    }

    public static void main(String [] args){

    }
}
