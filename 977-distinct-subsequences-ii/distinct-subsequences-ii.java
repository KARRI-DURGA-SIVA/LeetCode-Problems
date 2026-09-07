class Solution {
    public int distinctSubseqII(String s) {
        long mod = 1000000007;
        long[] last = new long[26];

        long total = 0;

        for (char c : s.toCharArray()) {
            int x = c - 'a';

            long add = (total + 1) % mod;
            total = (total + add - last[x] + mod) % mod;

            last[x] = add;
        }

        return (int) total;
    }
}