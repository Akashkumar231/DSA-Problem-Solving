public class CheckingSortedArray {

    public  static boolean isSortedOrNot(int [] nums){

        int flag = 0 ;

        for(int index = 0 ; index < nums.length ; index++){
            if(nums[index]> nums[(index+1)%nums.length]){
                flag ++;
            }
        }
        if(flag >= 2){
            return false;
        }

        return true;
    }


    public static void main(String [] args){

       int []  nums = new int [] {2,1,3,4};

        System.out.println(isSortedOrNot(nums));

    }

}
