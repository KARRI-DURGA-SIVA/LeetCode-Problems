class Solution {
    public String lexPalindromicPermutation(String s, String target) {
        int n = s.length();
        int[] cnt = new int[26];

        for (char c : s.toCharArray())
            cnt[c - 'a']++;

        int odd = 0, middle = -1;

        for (int i = 0; i < 26; i++) {
            if (cnt[i] % 2 != 0) {
                odd++;
                middle = i;
            }
        }

        if (odd > 1)
            return "";

        int half = n / 2;
        int[] pair = new int[26];

        for (int i = 0; i < 26; i++)
            pair[i] = cnt[i] / 2;

        int[] used = new int[26];
        boolean valid = true;

        for (int i = 0; i < half; i++) {
            int x = target.charAt(i) - 'a';

            if (used[x] >= pair[x]) {
                valid = false;
                break;
            }

            used[x]++;
        }

        if (valid) {
            StringBuilder left = new StringBuilder();

            for (int i = 0; i < half; i++)
                left.append(target.charAt(i));

            String exact = build(left.toString(), middle, n);

            if (exact.compareTo(target) > 0)
                return exact;
        }

        for (int pivot = half - 1; pivot >= 0; pivot--) {
            used = new int[26];
            valid = true;

            for (int i = 0; i < pivot; i++) {
                int x = target.charAt(i) - 'a';
                used[x]++;

                if (used[x] > pair[x]) {
                    valid = false;
                    break;
                }
            }

            if (!valid)
                continue;

            int t = target.charAt(pivot) - 'a';

            for (int c = t + 1; c < 26; c++) {
                if (used[c] >= pair[c])
                    continue;

                used[c]++;

                StringBuilder left = new StringBuilder();

                for (int i = 0; i < pivot; i++)
                    left.append(target.charAt(i));

                left.append((char)('a' + c));

                for (int x = 0; x < 26; x++) {
                    int rem = pair[x] - used[x];

                    while (rem-- > 0)
                        left.append((char)('a' + x));
                }

                return build(left.toString(), middle, n);
            }
        }

        return "";
    }

    private String build(String left, int middle, int n) {
        StringBuilder ans = new StringBuilder(left);

        if (n % 2 != 0)
            ans.append((char)('a' + middle));

        for (int i = left.length() - 1; i >= 0; i--)
            ans.append(left.charAt(i));

        return ans.toString();
    }
}