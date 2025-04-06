package MediumQuesitons;

import java.util.ArrayList;
import java.util.List;

public class Pascal_Triangle {

    public static List<List<Integer>> getListOfInteger(int numberRows){

        List<List<Integer>> result = new ArrayList<>();

        if (numberRows == 0){
            return result;
        }

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        result.add(firstRow);
        if (numberRows == 1){
            return result;
        }

        for(int i = 1 ; i< numberRows ; i++){

            List<Integer> prevRow = result.get(i-1);
            List<Integer> row = new ArrayList<>();
            row.add(1);
            for (int j  = 0 ; j<i-1 ; j++){

                row.add(prevRow.get(j) + prevRow.get(j+1));

            }
            row.add(1);
            result.add(row);

        }
       return result;

    }


    public static void main(String [] args){

        List<List<Integer>> result = getListOfInteger(6);

        for (List<Integer> l : result){

            for (Integer e : l){
                System.out.print(e+" ");
            }
            System.out.println();
        }


    }

}
