package binarysearch_on_answers;

import java.util.Arrays;

public class FindSmallestMaximumDistance {

    public static int maxAdjacent(int [] gasStations){

        int maxDistance = Integer.MIN_VALUE;

        for (int i = 0 ; i < gasStations.length - 1 ; i++){

            maxDistance = Math.max(maxDistance,gasStations[i+1]-gasStations[i]);

        }

        return maxDistance;

    }

    public static boolean isPossible(int [] stations , int allowedStations , double distance){
        int requiredStations = 0;
        for (int index = 0 ; index < stations.length-1 ; index++){

            double gap = (stations[index+1]-stations[index])/distance;
            requiredStations += (int)Math.ceil(gap)-1;
        }
        return (requiredStations <= allowedStations);
    }

    public static double findSmallestMaximumDistance(int [] gasStations , int allowedStations){
        Arrays.sort(gasStations);
        double left = 0.0 , right = maxAdjacent(gasStations);
        while(right - left > 1e-6){
            double mid = left + ( right -left)/2.0;
            if (isPossible(gasStations,allowedStations,mid)){
                right = mid;
            }else{
                left = mid;
            }
        }
        return left;
    }

    public static void main(String [] args){
        int [] gasStation = new int[]{10,15,25,34,72,80};
        System.out.println(findSmallestMaximumDistance(gasStation,4));
    }

}
