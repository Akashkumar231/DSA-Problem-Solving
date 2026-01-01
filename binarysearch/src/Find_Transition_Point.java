public class Find_Transition_Point {

    public static int getTransitionPoint(int [] array ){

        if (array.length == 0){
            return -1;
        }

        int low = 0;
        int high = array.length-1;


        while (low<=high){
            int mid = low + (high - low)/2;

            if (array[mid] == 1){
                high = mid - 1;
            }else {
                low = mid + 1 ;
            }

        }

        return low;

    }

    public static void main(String [] args){

        int [] biotonicArray = new int[]{0,0,0,1,1,1};
        System.out.println(getTransitionPoint(biotonicArray));

    }

}
