public class Pattern6 {

    public  static void print(int n){

        for(int i = 0 ; i<n ; i++){

            for (int j =0 ; j < i ; j++){
                System.out.print(" ");
            }

            for (int j = 0 ;j<2*n-1-2*i ; j++){
                System.out.print("*");

            }
            for (int j =0 ; j < i ; j++){
                System.out.print(" ");
            }
            System.out.println();

        }



    }

    public  static void main(String [] args){

   print(5);
    }

}
