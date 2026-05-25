public class Jump_V {


    // Using Recursion
    public static boolean isReachable(int [] array){
        return solve(array,0);
    }

    public static boolean solve(int [] array , int index){

        if (index >= array.length-1){
            return true;
        }

        int maxJump = array[index];

        for(int jump = 1 ; jump <= maxJump ; jump++){

            if (solve(array,index+jump)){
                return true;
            }


        }
        return false;

    }

    public boolean canJump(int[] nums) {

        int maxLength = 0;

        for(int index = 0 ; index < nums.length ; index++){
            if(index > maxLength){
                return false;
            }

            maxLength = Math.max(maxLength , index + nums[index]);

            if(maxLength >= nums.length -1){
                return true;
            }
        }

        return true ;
    }

    public static void main(String [] args){

        int [] array =new int[]{2,3,1,1,4};

        System.out.println(isReachable(array));

    }

}
