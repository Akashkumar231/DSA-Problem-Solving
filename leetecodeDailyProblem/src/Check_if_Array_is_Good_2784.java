public class Check_if_Array_is_Good_2784 {

    public int getMax(int [] nums){
        int max = 0;
        for( int element : nums){
            if(element > max){
                max = element;
            }
        }
        return max;
    }

    public int countMax(int [] nums , int max){
        int count  = 0 ;
        for(int element: nums){
            if(max == element){
                count++;
            }
        }

        return count;
    }

    public boolean containsElement(int [] nums , int key){

        for(int element : nums){
            if(element == key){
                return true;
            }
        }
        return false;

    }

    public boolean isGood(int[] nums) {

        int length = nums.length;
        int maxElement = nums.length - 1 ;
        int max = getMax(nums);
        if(max != maxElement){
            return false;
        }

        int countMax = countMax(nums,maxElement);
        if(countMax !=2 ){
            return false;
        }

        for(int index = 1 ; index <=length-1 ; index++){
            if(!containsElement(nums,index)){
                return false;
            }
        }

        return true;
    }

    public static void main(String [] args){

    }

}
