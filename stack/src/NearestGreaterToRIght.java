import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class NearestGreaterToRIght {


    public static ArrayList<Integer> getNearestElementToRight(int [] array ){

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0 ; i < array.length ; i++){
            boolean isGreaterExist = false;
            for (int j = i +1 ; j < array.length ; j++){

                 if (array[i]<array[j]){
                     list.add(array[j]);
                     isGreaterExist = true;
                     break;
                 }

            }
            if (!isGreaterExist) list.add(-1);

        }
        return list;
    }

    public static List<Integer> getNearestElementByUsingStack(int [] array){

        List<Integer> answer = new ArrayList<>();

        Stack<Integer> stack = new Stack<>();

        int size = array.length - 1;

        while(size>=0)
        {

            if (stack.isEmpty()){
                answer.add(-1);
            } else if (!stack.isEmpty() && stack.peek() > array[size] ) {
              answer.add(stack.peek());
            }else if (!stack.isEmpty() && stack.peek() <= array[size]){

                while(!stack.isEmpty() && stack.peek()<= array[size]){
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
        ArrayList<Integer> ans = getNearestElementToRight(array);
        for (int number : ans){
            System.out.print(number + " ");
        }

        System.out.println();
        List<Integer>  answer = getNearestElementByUsingStack(array);
        Collections.reverse(answer);
        for (int number : answer){
            System.out.print(number + " ");
        }
    }


}
