import java.util.ArrayList;
import java.util.List;

public class FindAllMazePath {

    private static List<List<Integer>> result ;

    public static void findAllMazePath(int [][] maze , int row , int col , int rows, int cols , List<Integer> path){

        if (row == rows || col == cols){
            return;
        }

        if (row == maze.length-1 && col == maze[0].length-1){
            path.add(maze[row][col]);
            result.add(new ArrayList<>(path));
            path.remove(path.size()-1);
            return;
        }

        path.add(maze[row][col]); // Added the index to the path.
        // moving to right
        findAllMazePath(maze, row , col+1 , rows , cols , path);

        // moving to down
        findAllMazePath(maze, row+1 , col , rows , cols , path);
        path.remove(path.size()-1);

    }

    public static void main(String [] args){
        result = new ArrayList<>();
        int [][] maze = new int [][] {{5,10},{15,20}};
        List<Integer> path = new ArrayList<>();
        findAllMazePath(maze,0,0, maze.length,maze[0].length,path);
        System.out.println(result);
    }

}
