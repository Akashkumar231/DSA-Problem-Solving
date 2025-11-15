package innerclasses;

public class Floyds_Triangle {

    public static void printFloyd_Triangle(int n){

        for (int row = 0; row < n ;  row++){

            for (int col = 0 ; col <= row ; col++){

                System.out.print(row+1+col);

            }
            System.out.println();

        }


    }

    public static void main(String [] args){
     printFloyd_Triangle(5);
    }

}
