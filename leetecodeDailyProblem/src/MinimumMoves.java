import java.util.Arrays;

public class MinimumMoves {




        public static  int minMoves(int[] nums, int limit) {

            int n = nums.length;

            /*
             * Possible sums:
             * 2 -> 2*limit
             */
            int[] diff = new int[2 * limit + 2];



            /*
             * Process each pair
             */
            for (int i = 0; i < n / 2; i++) {

                int a = nums[i];
                int b = nums[n - 1 - i];

                int low = Math.min(a, b);
                int high = Math.max(a, b);

                /*
                 * Initially every sum needs 2 moves
                 */
                diff[2] += 2;

                /*
                 * 1 move range
                 */
                diff[low + 1] -= 1;
                diff[high + limit + 1] += 1;

                /*
                 * Exact sum needs 0 move
                 */
                diff[a + b] -= 1;
                diff[a + b + 1] += 1;
                System.out.println(Arrays.toString(diff));
            }
            System.out.println(Arrays.toString(nums));

            System.out.println(Arrays.toString(diff));

            int answer = Integer.MAX_VALUE;

            int currentMoves = 0;

            /*
             * Sweep through all target sums
             */
            for (int sum = 2; sum <= 2 * limit; sum++) {

                currentMoves += diff[sum];

                answer = Math.min(answer, currentMoves);
            }

            return answer;
        }


    public static void main(String [] args){

            int [] nums = {1,2,4,3};
            int limit = 4;
        System.out.println(minMoves(nums,4));

    }

}
