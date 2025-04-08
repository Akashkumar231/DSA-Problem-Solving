import java.util.Iterator;
import java.util.Stack;

public class StackBasicOperation {



    public static void main(String [] args){

        Stack<Integer> stack = new Stack<>();

        for (int i = 0 ; i<=10 ; i++){

            stack.push(i*2);

        }

        System.out.println(stack);

        // performing pop operation.
        System.out.println(stack.pop());

        System.out.println(stack);

        // get the top element of the stack.
        System.out.println(stack.peek());

        /*
         Return value -1 indicates that the object is not on the stack.
         */

        System.out.println(stack.search(16));

        // iterate over the stack using the iterator

        Iterator<Integer> itr = stack.iterator();
        while (itr.hasNext()){
            System.out.print(itr.next() + ",");
        }
        System.out.println();

        System.out.println(stack.isEmpty());

    }

}
