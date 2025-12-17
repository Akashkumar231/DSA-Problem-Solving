public class ToeplitzMatrix {

    public static boolean isToeplitzMatrix(int [][] matrix){


        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int index = 0;
        for (int diagonal = 1-colLength ; diagonal <= rowLength-1 ; diagonal++ ){

            int row = (diagonal<=0) ? 0 : diagonal;
            int col = (diagonal<=0) ? -diagonal:0;
            int val = matrix[row][col];
            while (row< rowLength && col<colLength){
               if (val!=matrix[row][col]){
                   return false;
               }
                row++;
                col++;
            }
        }
        return true;

    }

    public static void main(String [] args){

        int [][] matrix = new int[][]{
                {1,2,3,4},
                {5,1,2,3},
                {9,5,1,2},
        };
        System.out.println(isToeplitzMatrix(matrix));

    }

}
