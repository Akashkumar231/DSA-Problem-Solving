import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cyclically_Rotating_a_Grid {

    public static void rotateGrid(int [] [] array , int k){

        // Getting row and col
        int row = array.length;
        int col = array[0].length;

        int layers = Math.min(row,col)/2;

        for (int layer = 0 ; layer <  layers ; layer++){

            // top , left , right , bottom

            int top = layer;
            int left = layer;
            int bottom = row - layer - 1;
            int right = col - layer - 1;

            List<Integer> list = new ArrayList<>();
            // Traversing top row
            for(int index = left ; index <= right ; index++){
                list.add(array[top][index]);
            }

            // Traversing right col in layer i;
            for(int index = top +1 ; index <= bottom ; index++ ){
                list.add(array[index][right]);
            }

            // Traversing bottom row in layer i ;
            for(int index = right - 1 ; index>=left ; index--){
                list.add(array[bottom][index]);
            }

            // Traversing left column in layer i;
            for(int index = bottom -1 ; index > top ; index--){
                list.add(array[index][left]);
            }

            int size = list.size();
            int rotation  =  k % size;

            // Reversing the list ;
            List<Integer> rotate  =new ArrayList<>();
            for (int i = 0 ; i < size; i++){
                rotate.add(list.get((i+rotation)%size));
            }

            int i = 0;

            // Refilling back the layers row and cols
            // Traversing top row
            for(int index = left ; index <= right ; index++){
               array[top][index]=rotate.get(i);
               i++;
            }

            // Traversing right col in layer i;
            for(int index = top +1 ; index <= bottom ; index++ ){
               array[index][right]=rotate.get(i);
               i++;
            }

            // Traversing bottom row in layer i ;
            for(int index = right - 1 ; index>=left ; index--){
                array[bottom][index]=rotate.get(i);
                i++;
            }

            // Traversing left column in layer i;
            for(int index = bottom - 1 ; index > top ; index--){
                array[index][left]=rotate.get(i);
                i++;
            }


        }




    }

    public static void main(String [] args){

        int [][] matrix = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};

        rotateGrid(matrix,2);

        for (int [] array : matrix){
            System.out.println(Arrays.toString(array));
        }



    }

}
