import java.math.BigInteger;

class Solution {

    public String smallestPalindrome(String s, int k) {
        int[] freq = new int[26];

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }

        int[] half = new int[26];
        int halfLen = 0;
        char mid = 0;

        for (int i = 0; i < 26; i++) {
            half[i] = freq[i] / 2;
            halfLen += half[i];
            if ((freq[i] & 1) == 1) {
                mid = (char) ('a' + i);
            }
        }

        BigInteger[] fact = new BigInteger[halfLen + 1];
        fact[0] = BigInteger.ONE;

        for (int i = 1; i <= halfLen; i++) {
            fact[i] = fact[i - 1].multiply(BigInteger.valueOf(i));
        }

        BigInteger total = countWays(half, fact);

        if (BigInteger.valueOf(k).compareTo(total) > 0) {
            return "";
        }

        StringBuilder first = new StringBuilder();

        for (int pos = 0; pos < halfLen; pos++) {
            for (int c = 0; c < 26; c++) {
                if (half[c] == 0) {
                    continue;
                }

                half[c]--;

                BigInteger ways = countWays(half, fact);

                if (BigInteger.valueOf(k).compareTo(ways) <= 0) {
                    first.append((char) ('a' + c));
                    break;
                } else {
                    k -= ways.intValue();
                    half[c]++;
                }
            }
        }

        String second = first.reverse().toString();
        first.reverse();

        if (mid != 0) {
            return first.toString() + mid + second;
        }

        return first.toString() + second;
    }

    private BigInteger countWays(int[] half, BigInteger[] fact) {
        int total = 0;

        for (int x : half) {
            total += x;
        }

        BigInteger res = fact[total];

        for (int x : half) {
            res = res.divide(fact[x]);
        }

        return res;
    }
}