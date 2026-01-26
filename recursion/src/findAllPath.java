import java.util.ArrayList;
import java.util.List;

public class findAllPath {

   private static List<String> pathList ;

    public static void findPaths(int [][] matrix , int row , int col , String path){

        if (row < 0 || col < 0 || row == matrix.length || col == matrix[0].length){
            return;
        }

        if (matrix[row][col] == -1 || matrix[row][col]==0){
            return;
        }

        if (row == matrix.length -1 && col == matrix[0].length-1){
            pathList.add(path);
            return;
        }

        // marking as visited.
        matrix[row][col]=-1;

        // top
        findPaths(matrix,row-1,col,path+"T");


        // down
        findPaths(matrix,row + 1, col, path+"D");

        // left
        findPaths(matrix,row,col-1,path+"L");

        // right
        findPaths(matrix,row , col +1 , path +"R");

        // After the call marking the cell as not visited.
        matrix[row][col]=1;

    }

    public static void main(String [] args){
      pathList = new ArrayList<>();

      int [][] matrix = new int[][]{
              {1,1,1,0},
              {1,0,1,1},
              {1,0,0,1},
              {1,1,1,1},
              {1,1,0,1}
      };

      findPaths(matrix,0,0,"");

        System.out.println(pathList);
    }

}
