import java.util.ArrayList;
import java.util.List;

public class Lucky_Number_In_A_Matrix {

    public static boolean isMinimumInRow(int [][] matrix , int value, int row){
        int minElement = Integer.MAX_VALUE;
        for (int col = 0 ;  col < matrix[0].length ; col++){
            if (minElement>matrix[row][col]){
                minElement= matrix[row][col];
            }
        }

        return minElement==value;
    }
    public static boolean isMaximumColumn(int [][] matrix , int value, int col){
        int maxElement = Integer.MIN_VALUE;
        for (int row = 0 ;  row < matrix.length ; row++){
            if (maxElement<matrix[row][col]){
                maxElement=matrix[row][col];
            }
        }

        return maxElement==value;
    }

    public static int getLuckyNumber(int [][] matrix){

        int value = -1;
        boolean isSmallInRow = false;
        boolean isLargestInCol = false;
        for (int row = 0 ; row<matrix.length ; row++){
            for (int col = 0; col<matrix[0].length ; col++){
                isSmallInRow=isMinimumInRow(matrix,matrix[row][col],row);
                isLargestInCol=isMaximumColumn(matrix,matrix[row][col],col);
                if (isSmallInRow && isLargestInCol){
                    return matrix[row][col];
                }
            }
        }
        return -9999;
    }

    public static List<Integer> getLuckyNumber2(int [][] matrix){

        for (int row = 0 ;  row< matrix.length ; row++){

            int min = 0;

            for (int col = 0 ;  col < matrix[0].length ; col++){
                if (matrix[row][col] < matrix[row][min]){
                    min = col;
                }
            }
            int max = 0;
            for (int r = 0 ; r< matrix.length ; r++){
                if (matrix[r][min]> max){
                    max = matrix[r][min];
                }
            }

            if (max == matrix[row][min]){
                List<Integer> result =new ArrayList<>();
                result.add(max);
                return result;
            }

        }

        return new ArrayList<Integer>();
    }

    public static void main(String [] args){

        System.out.println(getLuckyNumber2(Matrix.matrix));

    }

}
