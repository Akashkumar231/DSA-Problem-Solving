package Basics;

/*
You are given a cubic dice with 6 faces. All the individual faces have a number printed on them. The numbers are in the range of 1 to 6, like any ordinary dice. You will be provided with a face of this cube, your task is to guess the number on the opposite face of the cube.

Examples:

Input: n = 2
Output: 5
Explanation: For dice facing number 5 opposite face will have the number 2.


Input: 6 = 6
Output: 1
Explanation: For dice facing number 6 opposite face will have the number 1.

 */
public class DiceProblem {

    public static int getOppFace(int dicNumber){

        return (6-dicNumber)+1;



    }

    public static void main(String [] args){

        System.out.println(getOppFace(1));

    }
}
