import java.util.Arrays;

public class FirstAndLastOccurrence {

    public static int [] getFirstAndLastOccurrence(int [] array ,int target, int index){

        if (array.length-1 == index){
            return new int [] {-1,-1};
        }

        int result [] = getFirstAndLastOccurrence(array,target,index+1);

        if (array[index]== target){
            if (result[0]!=-1){
                result[0]=index;
            }else{
                result[0]=result[1]=index;
            }


        }

        return result;
    }

    public static  void main(String [] args){

        int [] array = new int[]{0,2,3,2,2,2};
        System.out.println(Arrays.toString(getFirstAndLastOccurrence(array,2,0)));

    }

}
