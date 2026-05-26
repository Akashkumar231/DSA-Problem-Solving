import java.util.LinkedList;
import java.util.Queue;

public class Jump_Game_VII_1871 {



    public boolean canReach(String s,
                            int minJump,
                            int maxJump) {

        int n = s.length();

        /*
            Queue for BFS
        */
        Queue<Integer> queue = new LinkedList<>();

        /*
            Start from index 0
        */
        queue.offer(0);

        /*
            Visited array
        */
        boolean[] visited = new boolean[n];

        visited[0] = true;

        /*
            IMPORTANT OPTIMIZATION

            Tracks the farthest index
            already processed
        */
        int farthest = 0;

        while (!queue.isEmpty()) {

            int current = queue.poll();

            /*
                Calculate next jump range
            */
            int start = Math.max(current + minJump,
                    farthest + 1);

            int end = Math.min(current + maxJump,
                    n - 1);

            /*
                Process only NEW indices
            */
            for (int next = start;
                 next <= end;
                 next++) {

                /*
                    Valid landing spot
                */
                if (s.charAt(next) == '0'
                        && !visited[next]) {

                    /*
                        Reached end
                    */
                    if (next == n - 1) {

                        return true;
                    }

                    visited[next] = true;

                    queue.offer(next);
                }
            }

            /*
                Update farthest processed
            */
            farthest = Math.max(farthest, end);
        }

        return n == 1;
    }

}
