import java.util.Arrays;

public class SetMatrixToZero {

    public static void setZeroes(int[][] matrix) {

        if(matrix.length==0){
            return;
        }

        boolean isAllOne = true;

        int [][] result = new int [matrix.length][matrix[0].length];
        for(int i= 0; i< matrix.length ; i++){
            for(int j = 0 ; j<matrix[i].length; j++){
                if(matrix[i][j]==0)
                {isAllOne=false;}
                result[i][j]=matrix[i][j];
            }
        }

        if(isAllOne == true){
            return ;
        }

        for(int i = 0; i< matrix.length ; i++){
            for(int j = 0 ; j<matrix[i].length; j++){
                if(result[i][j]==0){
                    int row = 0;
                    int col = 0;
                    while(row<matrix.length ){
                        matrix[row][j]=0;
                        row++;
                    }

                    while( col<matrix[i].length){
                        matrix[i][col]=0;
                        col++;
                    }

                }
            }
        }
    }

    public static void main(String [] args){
        int [][] matrix =new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroes(matrix);
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
    }

}
