import java.util.HashSet;
import java.util.Set;

public class Minimum_Common_Value_2540 {


    public static int getCommon(int[] nums1, int[] nums2) {

        Set<Integer> set = new HashSet<>();
        for(int index = 0 ; index < nums1.length ; index++){

            set.add(nums1[index]);

        }

        for(int index = 0 ; index < nums2.length ; index++){

            if(set.contains(nums2[index])){
                return nums2[index];
            }

        }

        return -1;

    }

    public static void main(String [] args){

      int []   nums1 = {1,2,3};
      int [] nums2 = {2,4};

        System.out.println(getCommon(nums1,nums2));

    }

}
