import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NearestSmallerToRight {


    public static List<Integer> getNearestElementSmallerToRight(int [] array){
        List<Integer> answer = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();

        int size = array.length - 1;

        while(size>=0)
        {

            if (stack.isEmpty()){
                answer.add(-1);
            } else if (!stack.isEmpty() && stack.peek() < array[size] ) {
                answer.add(stack.peek());
            }else if (!stack.isEmpty() && stack.peek() >= array[size]){

                while(!stack.isEmpty() && stack.peek() >= array[size]){
                    stack.pop();
                }

                if (stack.isEmpty()){
                    answer.add(-1);
                }else{
                    answer.add(stack.peek());
                }

            }
            stack.push(array[size]);
            size--;
        }
        return answer;
    }

   public static void main(String [] args){
       int [] array  = new int [] {1,3,0,10,1,2,4};
       List<Integer> ans = getNearestElementSmallerToRight(array);
       Collections.reverse(ans);
       for (int number : ans){
           System.out.print(number + " ");
       }
   }
}
