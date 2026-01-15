public class PrintArray {


    public static void printArray(int [] array , int index){
        if (index == array.length){
            return ;
        }

        System.out.print(" " + array[index]+ "  ");

        printArray(array,index+1);

    }

    public static void main(String [] args){
        int [] array = new int[]{5,10,20,30,40,50,60,70,80,90,100};
        printArray(array,0);
    }

}
