public class Pattern8 {

    public static void printPattern(int n ){

        for(int i = 1 ; i<= n ; i++){

            for (int j = 1 ; j<= i ; j++){
                System.out.print(j);
            }
            for (int j = 1 ; j<= (2*n) - (2*i) ;j++ ){
                System.out.print(" ");
            }
            for (int j = i ; j>= 1 ; j--){
                System.out.print(j);
            }
            System.out.println();

        }


    }

    public static void main(String [] args){

     printPattern(5);


    }

}
