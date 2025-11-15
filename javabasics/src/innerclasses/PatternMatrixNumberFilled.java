package innerclasses;

public class PatternMatrixNumberFilled {

    public static void printPatternRepresentation(int n){

        for (int row = 0 ; row< n ;row ++){

            for(int col = 0 ; col < n ; col++){

                System.out.print(" " + (row+col) + " ");

            }

            System.out.println();

        }

    }

    public static void  main(String []args){
        printPatternRepresentation(5);

    }

}
