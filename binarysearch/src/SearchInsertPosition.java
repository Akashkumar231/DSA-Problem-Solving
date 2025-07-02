public class SearchInsertPosition {

    public static int getInsertPosition(int [] array , int element)
    {

        if (array.length == 0){
            return -1;
        }

        int ans = -1;

        int low = 0;
        int high = array.length-1;


        while (low<=high){
            int mid = low + (high - low)/2;

            if (array[mid] >= element){
                ans = mid;
                high = mid - 1 ;
            }else {
                low = mid + 1 ;
            }

        }

        return ans;


    }

    public static void main(String [] args){

        int [] array = new int [] {2,3,6,7,8,8,11,11,11,12};

        System.out.println(getInsertPosition(array,10));

    }

}
