public class SearchInRotatedArray {
    // finding pivot element
    public static int getPivotElement(int [] array){

        int left = 0;

        int right = array.length - 1;

        if(array[left] <= array[right]){

            return left;

        }

        while(left<=right){

            int mid = left + (right -left) / 2;

            if(array[0] <= array[mid]){

                left = mid + 1;

            }
            else
            {
                right = mid -1;
            }
        }

        return left;
    }

    // Binary Search
    public static int binarySearch(int [] array , int target , int left  , int right){

        while(left <= right){

            int mid = left + ( right - left)/2;

            if(array[mid] == target){

                return mid;

            }else if(target < array[mid]){

                right = mid - 1;

            }
            else
            {

                left  = mid + 1;

            }

        }

        return -1;
    }

    public static int search(int[] array, int target) {

        int pivot  = getPivotElement(array);

        if(pivot == 0){

            return binarySearch(array,target,0,array.length-1);

        }
        else if( target < array[0] ){

            return binarySearch(array,target,pivot,array.length - 1);

        }
        else
        {

            return binarySearch(array , target , 0, pivot - 1);

        }

    }
    public static void main(String [] args){
        int [] array =new int[]{4,5,6,7,0,1,2};
        System.out.println(search(array,0));
    }

}
