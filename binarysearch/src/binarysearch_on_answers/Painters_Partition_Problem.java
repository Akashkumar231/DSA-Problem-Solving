package binarysearch_on_answers;

/*
Problem Description
 Given 2 integers A and B and an array of integers C of size N. Element C[i] represents the length of ith board.
 You have to paint all N boards [C0, C1, C2, C3 … CN-1]. There are A painters available and each of them takes B units of time
 to paint 1 unit of the board.

Calculate and return the minimum time required to paint all boards under the constraints that any painter will only paint contiguous sections of the board.
 NOTE:
 1. 2 painters cannot share a board to paint. That is to say, a board cannot be painted partially by one painter, and partially by another.
 2. A painter will only paint contiguous boards. This means a configuration where painter 1 paints boards 1 and 3 but not 2 is invalid.

 Return the ans % 10000003.

 Input 1:

 A = 2
 B = 5
 C = [1, 10]

 Input 2:

 A = 10
 B = 1
 C = [1, 8, 11, 3]

 */

public class Painters_Partition_Problem {


    public static int getMaximumLengthBoard(int [] boards)
    {
        int maxBoardLength = Integer.MIN_VALUE;
        for (int board : boards) {
            maxBoardLength = Math.max(maxBoardLength, board);
        }
        return maxBoardLength;
    }

    public static int getTotalBoardLength(int [] boards)
    {
        int totalBoardLength = 0;
        for (int board : boards) {
            totalBoardLength += board;
        }
        return totalBoardLength;
    }

    public static boolean isPossible(int[] boards , int painters , int maxLoad ){

        int reqdPainters = 1;
        int totalBoards  = 0;

        for ( int board : boards){
            if (totalBoards+board<=maxLoad){
                totalBoards+=board;
            }else{
                totalBoards = board;
                reqdPainters++;
            }

        }
        return reqdPainters<=painters;

    }

    public static int getMinimumTime(int [] boards , int painters , int timeTaken){

        int left = getMaximumLengthBoard(boards);
        int right = getTotalBoardLength(boards);

        while (left<=right){

            int mid = left + (right -left)/2;

            if (isPossible( boards ,  painters ,  mid)){
                right = mid - 1;
            }else{
                left = mid + 1;
            }

        }

        return left*timeTaken;

    }

    public static void main(String [] args){
     int [] boards = new int[]{1, 8, 11, 3};
     int painters = 10 ;
     int timeTaken = 1;
        System.out.println("The minimum time required to paint all boards : " + getMinimumTime(boards,painters,timeTaken));
    }

}
