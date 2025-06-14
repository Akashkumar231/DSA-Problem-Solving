package array;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindRepeatingAndMissingNumber {

    public static void printMissing1(int [] array){
        List<Integer> list =new ArrayList<>();
        Set<Integer> set =new HashSet<>();
        for (int i= 0; i < array.length ; i++){
            if (!set.add(array[i])){
                list
                        .add(array[i]);

            }
        }
        System.out.println(list);

        for (int i = 1 ; i<=array.length ;i++){
            if (!set.contains(i)){
                list.add(i);
            }
        }

        System.out.println(list);

    }

    public static void main(String [] args){
        int [] array = new int[]{3,1,2,5,4,6,7,5};
        printMissing1(array);

    }


}
