public class LeeteCode_3737 {

    public int countSubarrays(int[] nums, int target) {
        int n = nums.length;
        int answer = 0;

        // Try every possible starting index
        for (int start = 0; start < n; start++) {

            // countTarget will store how many times target appears
            // in current subarray nums[start..end]
            int countTarget = 0;

            // Extend subarray from start to end
            for (int end = start; end < n; end++) {

                // If current element is target, increase count
                if (nums[end] == target) {
                    countTarget++;
                }

                // Length of current subarray
                int length = end - start + 1;

                // target must appear strictly more than half
                if (countTarget > length / 2) {
                    answer++;
                }
            }
        }

        return answer;
    }

}
