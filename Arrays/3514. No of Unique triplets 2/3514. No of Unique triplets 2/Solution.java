class Solution {
    public int uniqueXorTriplets(int[] nums) {
        final int MAX = 2048;

        boolean[][] dp = new boolean[4][MAX];
        dp[0][0] = true;

        for (int val : nums) {
            boolean[][] next = new boolean[4][MAX];

            for (int c = 0; c <= 3; c++) {
                System.arraycopy(dp[c], 0, next[c], 0, MAX);
            }

            for (int used = 0; used <= 3; used++) {
                for (int xr = 0; xr < MAX; xr++) {
                    if (!dp[used][xr]) continue;

                    for (int take = 1; take + used <= 3; take++) {
                        int newXor = xr;
                        if ((take & 1) == 1) {
                            newXor ^= val;
                        }
                        next[used + take][newXor] = true;
                    }
                }
            }

            dp = next;
        }

        int ans = 0;
        for (boolean b : dp[3]) {
            if (b) ans++;
        }

        return ans;
    }
}