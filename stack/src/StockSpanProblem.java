import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class StockSpanProblem {

    public static List<Integer> getListOptimizer(int [] array){


        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int size = array.length - 1;
        int index = 0;
        while (index <= size){

            if (stack.isEmpty()){
                result.add(-1);
            }else if(!stack.isEmpty() && array[stack.peek()] > array[index]){
                result.add(stack.peek());
            } else if (!stack.isEmpty() && array[stack.peek()]<=array[index]) {
                while (!stack.isEmpty() && array[stack.peek()]<=array[index]){
                    stack.pop();
                }

                if (stack.isEmpty()){
                    result.add(-1);
                }else {
                    result.add(stack.peek());
                }
            }
            stack.push(index);
            index++;

        }


        return result;
    }

    public static List<Integer> getList(int [] array){

        List<Integer> result = new ArrayList<>();

        for(int i = 0 ; i < array.length ; i++){

            int j = i ;
            int count = 0;
            while(j>=0){
                if(array[i]>= array[j]){
                    count++;
                }else {
                    break;
                }
                j--;
            }
            result.add(count);

        }
        return result;
    }

    public static void main(String [] args){
        int [] array = new int[] {100,80,60,70,60,75,85};
        List<Integer> ans = getListOptimizer(array);

        for (int index = 0 ; index < array.length ; index++){
            array[index]= index - ans.get(index);
        }

        System.out.println(Arrays.toString(array));
    }

}
