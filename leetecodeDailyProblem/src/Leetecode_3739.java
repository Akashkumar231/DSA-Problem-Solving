public class Leetecode_3739 {
    public long countMajoritySubarrays(int[] nums, int target) {
        int n = nums.length;
        int[] freq = new int[2 * n + 1];
        int offset = n;

        freq[offset] = 1;
        long count = 0;
        long lessCount = 0;
        int prefix = 0;

        for (int j = 0; j < n; j++) {
            int prev = prefix;
            prefix += (nums[j] == target) ? 1 : -1;

            if (prefix > prev) {
                lessCount += freq[prev + offset];
            } else {
                lessCount -= freq[prefix + offset];
            }

            count += lessCount;
            freq[prefix + offset]++;
        }

        return count;
    }
}
