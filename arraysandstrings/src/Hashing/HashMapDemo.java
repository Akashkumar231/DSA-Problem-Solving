package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static  int getCounts(int [] array , int number){

        Map<Integer, Integer> hashMapDemo = new HashMap<>();

        for (int i = 0; i < array.length ; i++){

            hashMapDemo.put(array[i], hashMapDemo.getOrDefault(array[i],0)
            +1);

        }
        System.out.println(hashMapDemo);
        return hashMapDemo.get(number);


    }

    public static void main(String [] args){

        int [] array = new int[]{1,2,3,2,2,5,2,5,4,5,5,5,5};
        System.out.println(getCounts(array,2));

    }

}
