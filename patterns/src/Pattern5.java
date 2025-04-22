public class Pattern5 {

    public static void printPattern(int n){

        for(int i = 0 ; i< n ; i++){


            // space
            for(int j =0;j< n-1-i;  j++)
                System.out.print(" ");

            // stars
            for (int j = 0; j< 2*i+1 ; j++){
                System.out.print("*");
            }

            // space
            for(int j =0;j< n-1-i;  j++)
                System.out.print(" ");

            System.out.println();

        }


    }

    public static void main(String [] args){

        printPattern(5);

    }

}
