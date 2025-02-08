package Basics;

public class PrintAllElementsArray {

    public static void printArray(int [] array){

        for (int j : array) {

            System.out.print(j + " ");
        }

    }

    public static void main(String [] args){

    int [] array = new int [] {1,2,3,5,4,6,4,8,5};

    printArray(array);

    }


}
