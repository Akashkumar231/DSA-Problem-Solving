package innerclasses;

public class CrissCross {

    public static void CrissCrossPattern(int n){

        for (int row = 1 ; row<= n ; row++){

            for (int col = 1 ; col <= n ; col++){

                if (row - col ==0 || row + col == n+1){
                     int left = col;
                     int right = n -col +1 ;
                     int min = Math.min(left,right);

                    System.out.print(min);
                }else{
                    System.out.print(" ");
                }

            }

            System.out.println();

        }

    }

    public static void main(String [] args){
        CrissCrossPattern(5);
    }


}
