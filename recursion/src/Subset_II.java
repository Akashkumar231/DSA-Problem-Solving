import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Subset_II {


    private static List<List<Integer>> resultList;

    public static void PrintSubsequences(int [] array ,int index ,List<Integer> list)
    {
        if (index == array.length){

//          resultList.add(list); --> This one is shallow copy
            resultList.add(new ArrayList<>(list));
            return;
        }

        // yes call
        list.add(array[index]);
        PrintSubsequences(array , index+1 , list );

        // removing the added element
        list.remove(list.size()-1);

        if (!list.isEmpty() && list.get(list.size()-1)==array[index])
            return;

        // No call.
        PrintSubsequences(array,index+1,list);

    }

    public static void main(String [] args){

        int [] array = new int[]{10,20,20,30};
        resultList = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        PrintSubsequences(array,0,ans);
        System.out.println(resultList);

    }



}
