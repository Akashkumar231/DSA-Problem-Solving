public class Placing_N_Queens {


     private static char [][] result ;

    public static void getPlaced(boolean [][] chess , int row , int col){

        if (row == chess[0].length){
            addOutput(chess);
            return;
        }

        for(int columns = 0 ; columns < chess[0].length ; columns++){

            if (!isSafe(chess,row, columns)) continue;

            chess[row][columns] = true;
            getPlaced(chess,row+1,col);
            chess[row][columns]=false;

        }

    }

    public static boolean isSafe(boolean [][] chess , int row , int col){

        // check in upper side if any Queen is placed or not.

         for (int upper_row = row  ; upper_row>=0 ; upper_row-- ){

             if (chess[upper_row][col]){
                 return false;
             }

         }

         // top left corner
         int left_corner_row = row;
         int left_corner_col = col;
         while (left_corner_row>=0 && left_corner_col>=0){
             if (chess[left_corner_row][left_corner_col]){
                 return false;
             }
             left_corner_row--;
             left_corner_col--;
         }

         // top right corner
         int right_corner_row = row;
         int right_corner_col = col;

         while (right_corner_row>=0 && right_corner_col< chess.length){
             if (chess[right_corner_row][right_corner_col]){
                 return false;
             }
             right_corner_row--;
             right_corner_col++;
         }

         return true;
    }

    public static void addOutput(boolean[][]chess){
        int row_length = chess.length;
        int col_length = chess[0].length;

        result = new char[row_length][col_length];

        for (int row =0 ; row < row_length ; row++ ){
            for (int col = 0 ; col < col_length ; col++){
                if (chess[row][col]){
                    result[row][col]='Q';
                }
            }
        }
    }

    public static void main(String [] args){

        getPlaced(new boolean[4][4],0,0);

        for (int row =0 ; row < 4 ; row++ ){
            for (int col = 0 ; col < 4 ; col++){
                System.out.print(result[row][col] + " ");
            }
            System.out.println();
        }

    }

}
