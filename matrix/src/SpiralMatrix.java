import java.util.Arrays;

public class SpiralMatrix {

    public static void printMatrixSpiral(int [][] matrix)
    {

        int left = 0;
        int right = matrix.length-1;
        int top = 0;
        int bottom = matrix[0].length-1;

        while(left<=right && top<=bottom){

            for (int i = left ; i<=right;i++){
                System.out.print(matrix[top][i] + " ");
            }
            top++;

            for (int i = top ; i<=bottom ; i++ ){
                System.out.print(matrix[i][right] + " ");
            }

            right--;

            if (top<=bottom){
                for(int i = right ; i>=left ; i--){
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            if(right<=left){
                for (int i = bottom ; i>=top ; i--){

                    System.out.print(matrix[left][i]+ " ");

                }
                left++;
            }

            System.out.println();

        }

    }

    public static void main(String [] args){

        int [][] matrix =new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        printMatrixSpiral(matrix);
        for (int [] a : matrix){
            System.out.println(Arrays.toString(a));
        }

    }

}
