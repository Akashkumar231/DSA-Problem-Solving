public class DiagonalTraversal {

    public static void main(String [] args){
        Matrix.printMatrix();
        int m = Matrix.matrix.length ;
        int n = Matrix.matrix[0].length;


        // iterating over the diagonal.
        for (int diagonal= 0 ;  diagonal<=m+n-2; diagonal++){

            int row = (diagonal<n) ? 0 : diagonal -n +1;
            int col = (diagonal<n) ? diagonal : n-1;
            while(row<m && col>=0){
                System.out.print(Matrix.matrix[row][col] + " ");
                row++;
                col--;
            }
            System.out.println();

        }
    }

}
