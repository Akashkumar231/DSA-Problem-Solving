public class Matrix_2D_Array {

    public static void transpose_Matrix(int [][] matrix){

        for(int row = 0 ; row< matrix.length ; row++){

            for (int col = row ; col < matrix[0].length ; col++){
                int temp = matrix[row][col];
                matrix[row][col]= matrix[col][row];
                matrix[col][row]=temp;
            }
        }

    }

    public static void main(String [] args){
        Matrix.printMatrix();
     transpose_Matrix(Matrix.matrix);
        System.out.println("------------");
     Matrix.printMatrix();

    }

}
