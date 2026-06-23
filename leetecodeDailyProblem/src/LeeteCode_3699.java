public class LeeteCode_3699 {
    private static final int MOD = 1_000_000_007;

    public int zigZagArrays(int n, int l, int r) {

        // Number of distinct values available in [l, r]
        int m = r - l + 1;

        // Special case:
        // If length = 1, every single value itself forms a valid array.
        if (n == 1) {
            return m;
        }

        // prevUp[v]   = number of valid arrays of current previous length
        //               ending at value v, where last movement was UP
        //
        // prevDown[v] = number of valid arrays of current previous length
        //               ending at value v, where last movement was DOWN
        //
        // We use indices 1..m for convenience.
        long[] prevUp = new long[m + 1];
        long[] prevDown = new long[m + 1];

        // ----------------------------------------------------------
        // Base case: length = 2
        //
        // up[2][v]   = number of smaller values before v = v - 1
        // down[2][v] = number of bigger values before v = m - v
        // ----------------------------------------------------------
        for (int v = 1; v <= m; v++) {
            prevUp[v] = v - 1;     // pairs (x, v) where x < v
            prevDown[v] = m - v;   // pairs (x, v) where x > v
        }

        // If n == 2, answer is simply all pairs with different adjacent values.
        if (n == 2) {
            long ans = 0;
            for (int v = 1; v <= m; v++) {
                ans = (ans + prevUp[v] + prevDown[v]) % MOD;
            }
            return (int) ans;
        }

        // ----------------------------------------------------------
        // Build lengths from 3 to n
        // ----------------------------------------------------------
        for (int len = 3; len <= n; len++) {

            // Prefix sums of previous arrays
            long[] prefUp = new long[m + 1];
            long[] prefDown = new long[m + 1];

            for (int v = 1; v <= m; v++) {
                prefUp[v] = (prefUp[v - 1] + prevUp[v]) % MOD;
                prefDown[v] = (prefDown[v - 1] + prevDown[v]) % MOD;
            }

            // Current DP arrays for this length
            long[] currUp = new long[m + 1];
            long[] currDown = new long[m + 1];

            for (int v = 1; v <= m; v++) {

                // --------------------------------------------------
                // currUp[v]:
                // To end at v with an UP move,
                // previous value x must be < v,
                // and previous move must have been DOWN.
                //
                // So:
                // currUp[v] = sum(prevDown[x]) for x in [1 .. v-1]
                //           = prefDown[v-1]
                // --------------------------------------------------
                currUp[v] = prefDown[v - 1];

                // --------------------------------------------------
                // currDown[v]:
                // To end at v with a DOWN move,
                // previous value x must be > v,
                // and previous move must have been UP.
                //
                // So:
                // currDown[v] = sum(prevUp[x]) for x in [v+1 .. m]
                //             = prefUp[m] - prefUp[v]
                // --------------------------------------------------
                currDown[v] = (prefUp[m] - prefUp[v] + MOD) % MOD;
            }

            // Move current arrays into previous for next iteration
            prevUp = currUp;
            prevDown = currDown;
        }

        // ----------------------------------------------------------
        // Final answer = all arrays of length n ending at any value,
        // with either last move UP or DOWN
        // ----------------------------------------------------------
        long answer = 0;
        for (int v = 1; v <= m; v++) {
            answer = (answer + prevUp[v] + prevDown[v]) % MOD;
        }

        return (int) answer;
    }
}
