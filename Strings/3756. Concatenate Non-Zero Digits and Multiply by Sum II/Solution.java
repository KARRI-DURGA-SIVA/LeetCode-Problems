class Solution {
    private static final int MOD = 1_000_000_007;

    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();
        int[] nonZeroCount = new int[n + 1];
        long[] concatenatedValue = new long[n + 1];
        int[] digitSum = new int[n + 1];
        long[] powerOfTen = new long[n + 1];
        powerOfTen[0] = 1;

        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';

            nonZeroCount[i + 1] = nonZeroCount[i];
            concatenatedValue[i + 1] = concatenatedValue[i];
            digitSum[i + 1] = digitSum[i];

            if (digit != 0) {
                nonZeroCount[i + 1]++;
                concatenatedValue[i + 1] =
                        (concatenatedValue[i] * 10 + digit) % MOD;
                digitSum[i + 1] += digit;
            }

            powerOfTen[i + 1] = (powerOfTen[i] * 10) % MOD;
        }

        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int left = queries[i][0];
            int right = queries[i][1];
            int length = nonZeroCount[right + 1] - nonZeroCount[left];
            long number = concatenatedValue[right + 1]
                    - concatenatedValue[left] * powerOfTen[length] % MOD;
            number = (number + MOD) % MOD;
            long sum = digitSum[right + 1] - digitSum[left];
            answer[i] = (int) (number * sum % MOD);
        }

        return answer;
    }
}
