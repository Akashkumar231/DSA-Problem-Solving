package array;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    public static void main(String [] args){
        List<Integer> arrayList = new ArrayList<>();

        for (int i = 1 ; i<= 10 ; i++ ){
            arrayList.add(i);
        }

        System.out.println(arrayList);

        // to add a element

        arrayList.add(45);

        System.out.println(arrayList);

        // to remove a object.

        arrayList.remove((Object)7);

        System.out.println(arrayList);

        // to remove a index
        arrayList.remove(2);

        System.out.println(arrayList);

        // to set a value at a particular index

        arrayList.set(4,36);

        System.out.println(arrayList);

        // to get the lastIndex of arrayList

        System.out.println(arrayList.lastIndexOf((Object)(45)));

        // to get last element
        System.out.println(arrayList.getLast());

        // to get first element
        System.out.println(arrayList.getFirst());

        // Iterating through the arrayList using Iterator

        Iterator<Integer> iterator = arrayList.iterator();

        System.out.print("[");
        while (iterator.hasNext()){
            System.out.print(iterator.next()+ " ,");
        }
        System.out.print("]");

        // to clear all elements from the arrayList;
        arrayList.clear();

        System.out.println(arrayList);

    }

}
