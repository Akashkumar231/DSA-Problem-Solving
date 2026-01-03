public class SearchInRotatedArray {

    public static int getMinimumIndex(int [] array){

        int left = 0;
        int last = array.length-1;
        if(array[left]<=array[last]){
            return array[left];
        }

        while (left<last){
            int mid = left + (last - left)/2;
            if (array[0] < array[mid]){
                left = mid+1;
            }else {
                last= mid - 1;
            }


        }
        return  left;

    }

    public static void main(String [] args){
        int [] array =new int[]{4,5,6,7,0,1,2};
        System.out.println(getMinimumIndex(array));
    }

}
