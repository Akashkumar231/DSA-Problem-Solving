import java.util.ArrayList;
import java.util.List;

public class SnakePattern {


    public static void printSnake(int [][] matrix){

        List<Integer> integerList = new ArrayList<>();
        for (int row = 0 ; row< matrix.length ; row++){

            if (row%2==0){

                for (int col = 0 ; col < matrix[row].length ;col++){
                    System.out.print(matrix[row][col] + "->");
                    integerList.add(matrix[row][col]);
                }

            }else{
                for (int col = matrix[row].length-1 ; col >=0 ;col--){
                    System.out.print(matrix[row][col] + "->");
                    integerList.add(matrix[row][col]);
                }
            }
            System.out.println("|");

        }
        System.out.println(integerList);

    }

    public static void main(String [] args){
        int [][] row = new int[][]{{10,20,30,40},{50,60,70,80},{90,100,120,140}};
        printSnake(row);

    }

}
