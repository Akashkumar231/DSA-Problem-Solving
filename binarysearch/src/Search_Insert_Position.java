public class Search_Insert_Position {

    public static int getPosition(int [] array , int element ){

        int left = 0;

        int right = array.length - 1;

        if (element > array[right]){
            return right+1;
        }

        if (element < array[left]){
            return left;
        }

        while (left<=right){
            int mid = left + (right - left)/2;
            if (array[mid]==element){
                right = mid - 1;
            }else if (array[mid] < element){
                left = mid +1;
            }else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String [] args){
        int [] array = new int[] {10,20,25,26,35,65,100,110};
        System.out.println(getPosition(array,0));
    }

}
