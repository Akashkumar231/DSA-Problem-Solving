import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Separate_the_Digits_in_an_Array {

//    public List<Integer> getList(int number ){
//
//
//
//
//
//    }
//
//    public static int[] separateDigits( List<Integer> list ,int[] nums) {
//
//
//        for ( int index = 0 ; index < nums.length ; index++){
//
//            int number = nums[index];
//
//            while(number!=0){
//                int firstDigit = number / 10;
//
//            }
//
//        }
//
//
//    }
//

    public static void main(String [] args){
        List<Integer> ans = new ArrayList<>();
        int [] nums = new int[]{128,568,985,59,65};
        String answer = "";
        for (int i = 0; i< nums.length ; i ++){
            answer = answer + nums[i];
        }
        char [] array = answer.toCharArray();
        System.out.println(Arrays.toString(array));
        int [] values = new int[array.length];
        for (int index = 0 ; index <values.length ; index++){
            values[index]= array[index]-'0';
        }
        System.out.println(Arrays.toString(values
        ));
        System.out.println(answer);

    }
}
