import java.util.Arrays;

public class Kadane_s_Algorithm {

    public static int maxSumOfMaxSubsequence(int [] array){

        int maximum = Integer.MIN_VALUE;

        int sum = 0;

        for(int i = 0 ; i< array.length ;i++){

            sum+=array[i];

            if (maximum<sum){
                maximum=sum;
            }

            if (sum<0){
                sum=0;
            }

        }

        return sum;

    }


    public static int[] maxSumOfMaxSubsequenceWithIndex(int [] array)
    {

        int [] num = new int[]{-1,-1};
        int maximum = Integer.MIN_VALUE;

        int sum = 0;

        for(int i = 0 ; i< array.length ;i++){

            if (sum==0){
                num[0]=i;
            }

            sum+=array[i];

            if (maximum<sum){
                maximum=sum;
                num[1]=i;
            }

            if (sum<0){
                sum=0;
            }

        }

        return num;

    }



    public static void main(String [] args){

        int [] array = new int[]{-2,-3,4,-1,-2,1,5,-3};

        System.out.println(maxSumOfMaxSubsequence(array));

        System.out.println(Arrays.toString(maxSumOfMaxSubsequenceWithIndex(array)));

        String s = "akashkumaryadav";
        char [] charArray = s.toCharArray();

        Arrays.sort(charArray);
        System.out.println(Arrays.toString(charArray));

    }

}
