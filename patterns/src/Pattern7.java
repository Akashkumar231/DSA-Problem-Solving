public class Pattern7 {

    public static void printPattern(int n ){

        int print = 1;

        for(int i = 0 ; i< n ; i++){

            for (int j = 0 ; j <= i ; j++){

                if (print == 1){
                    System.out.print(print + " ");
                    print=0;
                }else{
                    System.out.print(print+ " ");
                    print = 1;
                }


            }

            System.out.println();

        }

    }

    public static void main(String [] args){
        printPattern(5);
    }

}
