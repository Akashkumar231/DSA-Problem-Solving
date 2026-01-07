public class Search_2D_Matrix {

    public static boolean isElementPresent(int [][] array , int target){

        int row= array.length;
        int col = array[0].length;
        int left = 0 ;
        int right = row * col - 1;
        while (left <= right){
             int mid = left + (right - left ) / 2 ;
             if (array[mid/col][mid%col] == target){
                 return true;
             }else if (array[mid/col][mid%col]< target) {
                 left = mid + 1;
             }else{
                 right = mid - 1;
             }
        }
        return false;
    }


    public static void main(String [] args){
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println(isElementPresent(matrix,4));
    }

}
