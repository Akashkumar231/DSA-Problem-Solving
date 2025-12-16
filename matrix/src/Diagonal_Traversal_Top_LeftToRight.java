import java.util.Arrays;

public class Diagonal_Traversal_Top_LeftToRight {

    public static int [] diagonalTraversal(int [][] matrix){
        int [] result = new int[matrix.length * matrix[0].length];
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int index = 0;
        for (int diagonal = 1-colLength ; diagonal <= rowLength-1 ; diagonal++ ){
            int row = (diagonal<=0) ? 0 : diagonal;
            int col = (diagonal<=0) ? -diagonal:0;
            while (row< rowLength && col<colLength){
                result[index++]=matrix[row][col];
                row++;
                col++;
            }
        }
       return result;
    }

    public static void main(String [] args){

        System.out.println(Arrays.toString(diagonalTraversal(Matrix.matrix)));

    }

}
