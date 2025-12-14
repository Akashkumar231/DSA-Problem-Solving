public class Matrix {

    public static int [][]matrix = new int[][]{
        {1,2,3,4},
        {5,6,7,8},
        {9,10,11,12},
        {13,14,15,16},
    };

    public static void printMatrix(){
        for (int row = 0 ; row< matrix.length ; row++){

            for (int col = 0 ; col < matrix[0].length ; col++){

                System.out.print(matrix[row][col]+ " ");

            }
            System.out.println();
        }
    }
}
