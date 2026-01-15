public class LargestNoInArray {

    public static int getMaxNumber(int [] array , int index){

        // base condition
        if (index == array.length-1){
            return array[index];
        }

        // faith
        int value = getMaxNumber(array,index+1);

        // Remaining Work
        int maxValue = Math.max(array[index],value);

        return maxValue;

    }

    public static void main(String [] args){

        int [] array = new int[]{25,65,80,3,6,7};

        System.out.println(getMaxNumber(array,0));

    }

}
