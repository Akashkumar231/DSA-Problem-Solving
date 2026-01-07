package binarysearch_on_answers;

public class CocoEatingBanana {


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

        long maxSpeed =(long) 1e9;
        for (int speed  = 1 ; speed < maxSpeed ; speed++){

            if (isPossible(array,hours,speed)){
                return speed;
            }

        }
        return -1;
    }

    public static void main(String [] args){

        int [] piles = new int[] {3,7,6,11};
        System.out.println(getMinimumSpeed(piles,8));
    }

}
