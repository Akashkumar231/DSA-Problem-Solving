package MediumQuesitons;

/*
Given an integer n, write a program to find and print all the prime factors of n. A prime factor is a prime number that divides n exactly (without leaving a remainder).

Examples:
Input: n = 36
Output: 2 2 3 3
Explanation: For n = 36, dividing by 2 twice and 3 twice gives the prime factors 2, 2, 3, 3.


Input: n=97
Output: 97
Explanation: Since 97 is a prime number, it is its own prime factor.


Input: n = 50
Output: 2 5 5
Explanation: Dividing 50 by 2 once and 5 twice gives the prime factors 2, 5, 5.
 */

public class gettingPrimeFactorsInNumber {


    public static void getAllFactors(int n){

        if (n == 0 ||  n==1){
            System.out.println("No prime Factors.");
            return;
        }

        while (n%2 == 0){
            System.out.print(2 + " ");
            n=n/2;
        }

        for (int i = 3 ; i<=Math.sqrt(n); i+=2){

            while (n%i==0){
                System.out.print(i+" ");
                n=n/i;
            }

        }

        if (n>2){
            System.out.print(n);
        }



    }

    public static void main(String [] args){


        getAllFactors(50);


    }

}
