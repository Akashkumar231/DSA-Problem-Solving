import java.util.Arrays;


public class ZigZag_Traversal {

    public static int[] ZigZagTraversal(int [][] matrix){
        int rowLength = matrix.length;
        int colLength = matrix[0].length;
        int [] result = new int[rowLength*colLength];
        int idx =0 ;
        for (int d = 0 ;  d<= rowLength+colLength-2 ; d++){
            if (d%2 !=0){
                int row = (d<colLength) ? 0 : d -colLength + 1;
                int col = (d<colLength) ? d : colLength-1;
                while(col>=0 && row<rowLength){
                    result[idx++]=matrix[row][col];
                    row++;
                    col--;
                }
            }else{
                int row = (d< rowLength) ? d : rowLength-1;
                int col = (d<rowLength) ? 0 : d-rowLength+1;
                while(row>=0 && col<colLength){
                    result[idx++]=matrix[row][col];
                    row--;
                    col++;
                }
            }
        }
       return result;
    }

    public static void main(String [] args){
        int [][] matrix = new int[][]{
                                      {00,01,02,03},
                                      {10,11,12,13},
                                      {20,21,22,23},
                                      {30,31,32,33},
                                      {40,41,42,43}
                                     };
        System.out.println(Arrays.toString(ZigZagTraversal(matrix)));
    }

}
