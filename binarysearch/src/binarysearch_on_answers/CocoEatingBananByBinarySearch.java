package binarysearch_on_answers;

public class CocoEatingBananByBinarySearch {

    public static boolean isPossible(int [] piles, int hours , int speed){

        long totalTime = 0;

        for ( long pile : piles){

            totalTime+= (long) (pile/speed);
            if (pile % speed != 0)
                totalTime++;

        }
        return totalTime<=hours;
    }

    public static int getMinimumSpeed(int [] array , int hours){

        int ans = -1;
        int maxSpeed = Integer.MIN_VALUE;

        for (int index = 0; index < array.length ; index++)
        {
            maxSpeed = Math.max(maxSpeed,array[index]);
        }

        int minSpeed = 1;
        while (minSpeed<=maxSpeed){
            int mid = minSpeed + ( maxSpeed - minSpeed) / 2;
            if (isPossible(array,hours,mid)){
                ans = mid;
                maxSpeed = mid - 1;
            }else {
                minSpeed = mid + 1;
            }
        }

        return ans;
    }

    public static void main(String [] args){

        int [] piles = new int[] {3,7,6,11};
        System.out.println(getMinimumSpeed(piles,8));
    }

}
