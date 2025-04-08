import java.util.LinkedList;
import java.util.Queue;

public class QueueBasicOperation {
    public static void main(String [] args){
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0 ; i<=10 ; i++){
            queue.add(i);
        }

        System.out.println(queue);

        // getting the first element in queue
        System.out.println(queue.poll());

        System.out.println(queue);

        // removing the element from the queue.
        System.out.println(queue.remove());

        System.out.println(queue);

        System.out.println(queue.peek());

    }
}
