public class CountZeros {

    public static int getNumberOfZeros(int [][] matrix , int target)
    {
        int row = 0;
        int col = matrix[0].length -1 ;
        int count_Zeros = 0;
        while(col >= 0 && row < matrix.length){

            if (matrix[row][col]==0){
                row++;
                count_Zeros+= (col + 1);
            }else {
                col--;
            }

        }
        return count_Zeros;
    }
    public static void main(String [] args){
        int [][]matrix = new int[][]{
                {0,0,0,0},
                {0,0,0,1},
                {0,0,0,1},
                {0,1,1,1},
                {1,1,1,1}
        };

        System.out.println(getNumberOfZeros(matrix,0));
    }

}
