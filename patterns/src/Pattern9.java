public class Pattern9 {

    public static void printPattern(int n){

        int count = 1;
        for (int i = 0 ; i< n ; i++){

            for (int j = 0 ; j<=i ; j++){

                System.out.print(count+" ");
                count++;

            }
            System.out.println();
        }




    }

    public static void main(String [] args){

        printPattern(5);

    }

}
