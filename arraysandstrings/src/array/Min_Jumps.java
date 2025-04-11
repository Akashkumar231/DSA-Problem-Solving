package array;
/*
   Minimum Jumps
   You are given an array arr[] of non-negative numbers. Each number tells you the maximum number of steps you can jump forward from that position.

    For example:

    If arr[i] = 3, you can jump to index i + 1, i + 2, or i + 3 from position i.
    If arr[i] = 0, you cannot jump forward from that position.
    Your task is to find the minimum number of jumps needed to move from the first position in the array to the last position.

    Note:  Return -1 if you can't reach the end of the array.

    Examples :

    Input: arr[] = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]
    Output: 3
    Explanation: First jump from 1st element to 2nd element with value 3. From here we jump to 5th element with value 9, and from here we will jump to the last.

 */

 // link : https://www.geeksforgeeks.org/problems/minimum-number-of-jumps-1587115620/1?page=1&category=Arrays&sortBy=submissions
public class Min_Jumps {

    public static int getMinElements(int [] array ){
        int n = array.length ;
        int des = n-1;
        int window = 0;
        int coverage =0;
        int numberOfJumps = 0;
        for(int i = 0 ;i < array.length-1 ; i++){
            coverage = Integer.max(coverage,i+array[i]);
            if (i == window){
                window=coverage;
                numberOfJumps++;
            }
            if(window>=des){
                return numberOfJumps;
            }
        }
        return  -1;
    }
    public static void main(String [] args)
    {
        int [] array = new int[]{1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        System.out.println(getMinElements(array));

    }

}
