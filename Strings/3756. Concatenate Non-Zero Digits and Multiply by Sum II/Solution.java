class Solution {
    public int[] sumAndMultiply(String s, int[][] queries) {

        int mod = 1000000007;
        int n = s.length();

        int[] nonZero = new int[n + 1];
        int total = 0;

        for (int i = 0; i < n; i++) {
            nonZero[i + 1] = nonZero[i];
            if (s.charAt(i) != '0') {
                nonZero[i + 1]++;
                total++;
            }
        }

        long[] power = new long[total + 1];
        power[0] = 1;

        for (int i = 1; i <= total; i++) {
            power[i] = (power[i - 1] * 10) % mod;
        }

        long[] value = new long[total + 1];
        long[] digitSum = new long[total + 1];

        int index = 0;

        for (int i = 0; i < n; i++) {
            int digit = s.charAt(i) - '0';

            if (digit != 0) {
                index++;
                value[index] = (value[index - 1] * 10 + digit) % mod;
                digitSum[index] = digitSum[index - 1] + digit;
            }
        }

        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int left = queries[i][0];
            int right = queries[i][1];

            int start = nonZero[left];
            int end = nonZero[right + 1];

            int length = end - start;

            if (length == 0) {
                answer[i] = 0;
                continue;
            }

            long number = value[end] - (value[start] * power[length]) % mod;
            number = (number + mod) % mod;

            long sum = digitSum[end] - digitSum[start];

            answer[i] = (int) ((number * sum) % mod);
        }

        return answer;
    }
}