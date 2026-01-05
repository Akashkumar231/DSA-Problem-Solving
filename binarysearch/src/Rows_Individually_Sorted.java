import java.util.Arrays;

public class Rows_Individually_Sorted {

    public static int [] binarySearch( int [][] array , int row , int target){
        int left = 0;
        int right = array[0].length - 1;
        while(left <= right){
            int mid = left + ( right - left)/2 ;
            if (array[row][mid]==target){
                return new int[]{row,mid};
            }else if(array[row][mid]< target){
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return  new int [] {-1,-1};
    }

    public static int[] getMatrixElement(int [] [] matrix ,int target){
        int row_Length = matrix.length;
        int col_Length = matrix[0].length;
        for ( int row = 0 ;  row < row_Length ; row++){
            if (matrix[row][0]<=target && matrix[row][col_Length-1]>=target){
                return binarySearch(matrix,row,target);
            }
        }
        return  new int [] {-1,-1};
    }

    public static void main(String [] args){
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {17, 20, 25}
        };
        System.out.println(Arrays.toString(getMatrixElement(matrix,19)));
    }
}
