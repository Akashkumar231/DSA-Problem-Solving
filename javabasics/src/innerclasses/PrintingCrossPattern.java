package innerclasses;

public class PrintingCrossPattern {

    public static void PrintingCrissCrossPattern(int n){

        for (int row = 1 ; row<= n ; row++){

            for (int col = 1 ; col <= n ; col++){

               if (row - col ==0 || row + col == n+1){
                   System.out.print("*");
               }else{
                   System.out.print(" ");
               }

            }

            System.out.println();

        }

    }

    public static void main(String [] args){
        PrintingCrissCrossPattern(6);
    }

}
