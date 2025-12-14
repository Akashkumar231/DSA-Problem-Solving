import java.util.Arrays;

public class OneDArrayToTwoDArray {

    public static int[][] convertArrayToMatrix1(int [] array , int m , int n){
        int [][] matrix = new int[m][n];


        int count = 0;

        for (int row = 0 ; row< m ; row++){

            for (int col = 0 ; col<n ; col++){
                matrix[row][col] = array[count];
                count++;
            }
        }

        for (int row = 0 ; row< m ; row++){


                System.out.println(Arrays.toString(matrix[row]));

        }

        return matrix;
    }

    public static int[][] convertArrayToMatrix2(int [] array , int m , int n){

        int [][] matrix =new int[m][n];

        for (int row = 0 ; row < m * n ; row++){

            matrix[row/n][row%4]=array[row];

        }

        for (int row = 0 ; row< m ; row++){



            System.out.println(Arrays.toString(matrix[row]));

        }

        return matrix;

    }

    public static void main(String [] args){

        int [] array = new int[]{10,20,30,40,50,60,70,80,90,100,110,120};
        System.out.println(Arrays.toString(convertArrayToMatrix1(array,3,4)));
        System.out.println(Arrays.toString(convertArrayToMatrix2(array,3,4)));

    }

}
