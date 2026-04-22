import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {



    public static void main(String [] args){

        Queue <Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.add(45);
        priorityQueue.add(9);
        priorityQueue.add(65);
        priorityQueue.add(301);
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue);

        System.out.println(priorityQueue.isEmpty());

    }

}
