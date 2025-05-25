import java.util.Arrays;

public class RotateImage {


    public static void swapMatrix(int [][] matrix, int i , int j){
        int temp = matrix [i][j];
        matrix [i][j]= matrix[j][i];
        matrix[j][i]=temp;
    }

    public static void swap(int [][] matrix, int i , int j){
        int temp = matrix[i][j];
        matrix[i][j]=matrix[i][matrix.length-1-j];
        matrix[i][matrix.length-1-j]=temp;
    }
    public static void reverseRow(int [][] matrix){
        for (int i= 0 ; i< matrix.length ; i++){
            for (int j = 0 ; j<= matrix.length/2 ; j++){
              swap(matrix,i,j);
            }
        }
    }

    public static void rotate1(int[][] matrix)
    {
        int ans [][] = new int[matrix.length][matrix[0].length];
        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0 ; i< row ; i++){
            for(int j = 0 ; j< col ; j++){
                ans [i][j]= matrix[i][j];
            }
        }
        for (int i = 0 ; i<row ;i++){
            for (int j = 0 ; j<col ; j++){
                matrix[i][j]=ans[col-1-j][i];
            }
        }
    }

    public static void rotate2(int [][] matrix){

        int row = matrix.length;
        int col = matrix[0].length;
        for(int i = 0 ; i<=row/2 ; i++){
            for(int j = 0+i ; j<col ; j++){
               swapMatrix(matrix,i,j);
            }
        }

        reverseRow(matrix);
    }

    public static void main(String [] args){
    int [][] matrix= new int [][]  {{1,2,3},{4,5,6},{7,8,9}};
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }

//        rotate1(matrix);
        System.out.println("after operation" +
                "");
//        for (int[] ints : matrix) {
//            System.out.println(Arrays.toString(ints));
//        }

        rotate2(matrix);

        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }

}
