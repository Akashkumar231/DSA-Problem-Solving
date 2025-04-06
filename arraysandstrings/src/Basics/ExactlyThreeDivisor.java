package Basics;

/*
Given a number n, print all numbers in the range from 1 to n having exactly 3 divisors.

Examples:

Input: n = 16
Output: 4 9
Explanation: 4 and 9 have exactly three divisors.


Input: n = 49
Output: 4 9 25 49
Explanation: 4, 9, 25 and 49 have exactly three divisors.


 */

public class ExactlyThreeDivisor{

    public static void printNumber(int n){

        for (int i = 1 ; i<= n ; i++){

            int count = 0;

            for(int  j = 1 ; j<=i ; j++){

                if (i%j==0){
                    count++;
                }

            }
            if (count==3){
                System.out.print(i+" ");
            }

        }

    }

    public static void main(String [] args){

        printNumber(49);

    }
}
