import java.util.*;

public class Jump_Game_IV_1345 {


    public static int minJumps(int[] arr) {
        int n = arr.length;
        if(arr.length == 1){
            return 0;
        }

        if(arr[0]== arr[arr.length-1]){
            return 1;
        }

        // Creating Map <Integer , List<Integer>> to store the same value indices
        Map<Integer , List<Integer>> maps = new HashMap<>();

        for (int i = 0; i < n; i++) {
            maps
                    .computeIfAbsent(arr[i], k -> new ArrayList<>())
                    .add(i);
        }

        // Creating Queue
        Queue<Integer> queue = new LinkedList<>();

        queue.offer(0);

        // Create Visited Array to track that index is visited.
        boolean[] visited = new boolean[n];
        visited[0]= true;

        int steps = 0;

        while(!queue.isEmpty()){

            int size= queue.size();

            for(int index = 0 ; index < size ; index++)
            {
                int currentIndex = queue.poll();

                if (currentIndex == n - 1) {
                    return steps;
                }

                // index + 1
                int nextIndex = currentIndex + 1;
                if(nextIndex< n && !visited[nextIndex]){
                    queue.offer(nextIndex);
                    visited[nextIndex]= true;
                }

                // index - 1
                int prevIndex = currentIndex - 1;
                if(prevIndex >=0 && !visited[prevIndex] ){
                    queue.offer(prevIndex);
                    visited[prevIndex] = true;
                }

                List<Integer> sameValueIndex = maps.get(arr[currentIndex]);

                for(int indx : sameValueIndex){
                    if(!visited[indx]){
                        visited[indx] = true;
                        queue.offer(indx);
                    }
                }

                sameValueIndex.clear();

            }
            steps++;
        }
        return -1;

    }

    public static void main(String [] args){

    }

}
