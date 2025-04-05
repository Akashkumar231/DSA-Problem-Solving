package Basics;

// Find the number closest to n and divisible by m

/*
Given two integers n and m (m != 0). Find the number closest to n and divisible by m. If there is more than one such number, then output the one having maximum absolute value.

Examples:

Input: n = 13, m = 4
Output: 12
Explanation: 12 is the closest to 13, divisible by 4.


Input: n = -15, m = 6
Output: -18
Explanation: Both -12 and -18 are closest to -15, but-18 has the maximum absolute value.


 */

public class FindingClosestNumber {

    public static int getClosestNumber1(int n , int m){
        int minDifference = Integer.MAX_VALUE;
        int closest = 0;
        for(int i = n-Math.abs(m)  ; i<= n+Math.abs(m) ; i++){
            if (i%m ==0){
                int diff = Math.abs(n-i);
                if(diff<minDifference || (diff==minDifference &&  Math.abs(i) > Math.abs(closest))){
                    minDifference=diff;
                    closest=i;
                }
            }
        }
        return closest;
    }

    public static int getClosetNumber2(int n , int m){

        int q = n/m;

        int n1= m*q;

        int n2 = n*m > 0 ? (m*(q+1)) : (m*(q-1));

        if (Math.abs(n-n1)>Math.abs(n-n2)){

            return n1;
        }

        return n2;
    }

    public static void main(String [] args){

        System.out.println(getClosestNumber1(-15,6));
        System.out.println(getClosetNumber2(-15,6));

    }
}
