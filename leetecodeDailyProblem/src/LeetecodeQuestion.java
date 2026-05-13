import java.util.Arrays;

/*
You are given an array tasks where tasks[i] = [actuali, minimumi]:
actuali is the actual amount of energy you spend to finish the ith task.
minimumi is the minimum amount of energy you require to begin the ith task.
For example, if the task is [10, 12] and your current energy is 11, you cannot
start this task. However, if your current energy is 13, you can complete this task,
and your energy will be 3 after finishing it.
You can finish the tasks in any order you like.
 */

public class LeetecodeQuestion {

    public int minimumEffort(int[][] shop) {
        Arrays.sort(shop, (a, b) -> b[1] - b[0] - (a[1] - a[0]));
        int start = shop[0][1];
        int bal = shop[0][1] - shop[0][0];
        int loan = 0;

        for (int i = 1; i < shop.length; i++) {
            int cost = shop[i][0];
            int thresh = shop[i][1];

            if (bal < thresh) {
                loan += thresh - bal;
                bal = thresh;
            }

            bal -= cost;
        }

        return start + loan;
    }

    public int minimumEffortGreedy(int[][] tasks) {

        /*
         * Sort by:
         * (minimum - actual) descending
         */
        Arrays.sort(tasks, (a, b) ->
                (b[1] - b[0]) - (a[1] - a[0])
        );

        int currentEnergy = 0;

        int answer = 0;

        for (int[] task : tasks) {

            int actual = task[0];
            int minimum = task[1];

            /*
             * If current energy is not enough,
             * increase initial energy.
             */
            if (currentEnergy < minimum) {

                answer += (minimum - currentEnergy);

                currentEnergy = minimum;
            }

            /*
             * Perform task
             */
            currentEnergy -= actual;
        }

        return answer;
    }


    /*
     * Check if given initial energy
     * can finish all tasks
     */
    public boolean canFinish(int[][] tasks, int energy) {

        for (int[] task : tasks) {

            int actual = task[0];
            int minimum = task[1];

            /*
             * Cannot start task
             */
            if (energy < minimum) {

                return false;
            }

            /*
             * Finish task
             */
            energy -= actual;
        }

        return true;
    }

    public int minimumEffortBinary(int[][] tasks) {

        /*
         * Greedy sorting
         *
         * Larger (minimum - actual)
         * should come first
         */
        Arrays.sort(tasks, (a, b) ->
                (b[1] - b[0]) - (a[1] - a[0])
        );

        /*
         * Binary Search Range
         */
        int low = 1;

        int high = 0;

        for (int[] task : tasks) {

            high += task[1];
        }

        int answer = high;

        /*
         * Binary Search
         */
        while (low <= high) {

            int mid = low + (high - low) / 2;

            /*
             * If possible,
             * try smaller answer
             */
            if (canFinish(tasks, mid)) {

                answer = mid;

                high = mid - 1;
            }

            /*
             * Otherwise need more energy
             */
            else {

                low = mid + 1;
            }
        }

        return answer;
    }

    public static void main(String [] args){
//        int[][] tasks = {
//                {1,7},
//                {2,8},
//                {3,9},
//                {4,10},
//                {5,11},
//                {6,12}
//        };
//       System.out.println(minimumEffortBinarySearch(tasks));
       Integer [] array =new Integer[]{1,2,3,65,78,23,0};
       Arrays.sort(array,(a,b)->a-b);
       System.out.println(Arrays.toString(array));
        Arrays.sort(array,(a,b)->b-a);
   }

}