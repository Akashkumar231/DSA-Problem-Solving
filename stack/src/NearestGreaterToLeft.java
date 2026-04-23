import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NearestGreaterToLeft {

    public static List<Integer> NearestGreaterToLeftUsingStack(int [] array){

        List<Integer> result = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int size = array.length - 1;
        int index = 0;
        while (index <= size){

            if (stack.isEmpty()){
                result.add(-1);
            }else if(!stack.isEmpty() && stack.peek() > array[index]){
                result.add(stack.peek());
            } else if (!stack.isEmpty() && stack.peek()<=array[index]) {
                while (!stack.isEmpty() && stack.peek()<=array[index]){
                    stack.pop();
                }

                if (stack.isEmpty()){
                    result.add(-1);
                }else {
                    result.add(stack.peek());
                }
            }
           stack.push(array[index]);
            index++;

        }


        return result;
    }

    public static void main(String [] args){
        int [] array  = new int [] {1,3,0,10,1,2,4};
        List<Integer> ans =NearestGreaterToLeftUsingStack(array);
        for (int number : ans){
            System.out.print(number + " ");
        }

    }

}
