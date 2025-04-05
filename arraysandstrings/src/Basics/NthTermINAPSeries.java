package Basics;
/*
Given two integers a1 and a2, the first and second terms of an Arithmetic Series respectively, the problem is to find the nth term of the series.
Examples :

Input : a1 = 2,  a2 = 3,  n = 4
Output : 5
Explanation : The series is 2, 3, 4, 5, 6, ....   , thus the 4th term is 5.

Input : a1 = 1, a2 = 3, n = 10
Output : 19
Explanation:  The series is: 1, 3, 5, 7, 9, 11, 13, 15, 17, 19, 21..... Thus,10th term is 19.
 */
public class NthTermINAPSeries {

    public static int getNthTerm1(int a1  , int a2 , int n){

        int diff = a2-a1;
        int number = a2;

        for(int i=3 ; i<=n ; i++){
            number = number + diff;
        }

        return number;

    }

    public static int getNthTerm2(int a1  , int a2 , int n){

        int diff = a2-a1;


        return a1+((n-1)*diff);

    }
    public static void main(String [] args){

        System.out.println(getNthTerm1(1,3,10));
        System.out.println(getNthTerm2(1,3,10));


    }
}
