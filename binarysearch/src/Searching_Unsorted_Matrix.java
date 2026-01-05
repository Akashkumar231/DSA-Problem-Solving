import java.util.Arrays;

public class Searching_Unsorted_Matrix {

    public static int[] getMatrixElement(int [] [] matrix ,int target){
        int[] ans = new int[]{-1,-1};
        for(int row = 0 ;  row < matrix.length ; row++){

            for (int col = 0 ;  col< matrix.length ; col++){

                if (matrix[row][col]==target){
                    ans[0]=row;
                    ans[1]=col;
                    return ans;
                }

            }

        }

        return  new int[]{-1,-1};

    }

    public static void main(String [] args){

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(Arrays.toString(getMatrixElement(matrix,5)));

    }
}
