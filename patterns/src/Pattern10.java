public class Pattern10 {
    public static void print(int n){



        for (int i = 0 ; i< n ;i++){
            char ch = 'A';
            for (int j = 0; j<=i ; j++){

                System.out.print((char)(ch+j));

            }
            System.out.println();
        }

    }

    public static void main(String [] args){

        print(5);
    }
}
