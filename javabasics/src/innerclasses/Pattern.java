package innerclasses;

public class Pattern {

    public static void print(int n){

        for(int row = 0 ; row < n ; row++){

            for(int col = 0 ; col < n ;col++){

                if (col<row){
                    System.out.print(" ");
                }else{
                    System.out.print(" * ");
                }

            }
            System.out.println();

        }


    }

    public static void main(String [] args){

        print(5);

    }

}
