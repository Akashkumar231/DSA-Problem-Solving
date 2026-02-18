import java.util.Arrays;

public class SquaresOfSortedArray {

    public static void swap(int [] array , int firstIndex ,int secondIndex){

        int temp = array[firstIndex];
        array[firstIndex]=array[secondIndex];
        array[secondIndex]=temp;

    }

    public static int[] sort(int [] nums){
        int left = 0;
        int right = nums.length -1;
        int [] result = new int[nums.length];

        for(int index = nums.length - 1 ; index>= 0 ; index--){
            if(nums[left]*nums[left] > nums[right]*nums[right]){
                result[index]= nums[left] * nums[left];
                left++;
            }else{
                result[index]=nums[right]*nums[right];
                right--;
            }
        }

        return result;
    }

    public static void main(String [] args){
        int [] array = new int[]{-4,-1,0,3,10};
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(sort(array)));
    }


}
