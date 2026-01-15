public class CheckArraySortedOrNot {

    public static  boolean isSorted(int [] array , int index){

        if (index == array.length-1){
            return true;
        }

        if (array[index]>array[index+1]){
            return false;
        }

        return isSorted(array,index+1);
    }

    public static void main(String [] args){
        int [] array = new int [] { 10,20,30,40,50,80,70};
        System.out.println(isSorted(array,0));
    }

}
