package Basics;

public class ConditionalStatements {

    public static int getMinimum(int a , int b){

        int min = 0;

        min = (a>b) ? b : a;
        return min;

    }

    public static void main(String [] args){
        // Ternary Operator

        String result = (10%2==0)?"even":"odd";

        System.out.println(getMinimum(50,60));

    }

}
