import java.util.ArrayList;
import java.util.List;

public class NearestGreaterToRIght {


    public static ArrayList<Integer> getNearestElementToRight(int [] array ){

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0 ; i < array.length ; i++){
            boolean isGreaterExist = false;
            for (int j = i +1 ; j < array.length ; j++){

                 if (array[i]<array[j]){
                     list.add(array[j]);
                     isGreaterExist = true;
                     break;
                 }

            }
            if (!isGreaterExist) list.add(-1);

        }
        return list;
    }


    public static void main(String [] args){
        int [] array  = new int [] {1,3,0,10,1,2,4};
        ArrayList<Integer> ans = getNearestElementToRight(array);
        for (int number : ans){
            System.out.print(number + " ");
        }
    }


}
