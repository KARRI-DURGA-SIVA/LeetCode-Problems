class Solution {
    public String lexGreaterPermutation(String s, String target) {
        int[] cnt = new int[26];

        for (char c : s.toCharArray()) {
            cnt[c - 'a']++;
        }

        char[] ans = target.toCharArray();

        for (int i = 0; i < target.length(); i++) {
            int x = target.charAt(i) - 'a';

            if (cnt[x] > 0) {
                cnt[x]--;
                continue;
            }

            for (int c = x + 1; c < 26; c++) {
                if (cnt[c] > 0) {
                    ans[i] = (char) ('a' + c);
                    cnt[c]--;

                    int k = i + 1;

                    for (int z = 0; z < 26; z++) {
                        while (cnt[z] > 0) {
                            ans[k++] = (char) ('a' + z);
                            cnt[z]--;
                        }
                    }

                    return new String(ans);
                }
            }

            for (int j = i - 1; j >= 0; j--) {
                cnt[ans[j] - 'a']++;

                int p = target.charAt(j) - 'a';

                for (int c = p + 1; c < 26; c++) {
                    if (cnt[c] > 0) {
                        ans[j] = (char) ('a' + c);
                        cnt[c]--;

                        int k = j + 1;

                        for (int z = 0; z < 26; z++) {
                            while (cnt[z] > 0) {
                                ans[k++] = (char) ('a' + z);
                                cnt[z]--;
                            }
                        }

                        return new String(ans);
                    }
                }
            }

            return "";
        }

        for (int j = target.length() - 1; j >= 0; j--) {
            cnt[ans[j] - 'a']++;

            int p = target.charAt(j) - 'a';

            for (int c = p + 1; c < 26; c++) {
                if (cnt[c] > 0) {
                    ans[j] = (char) ('a' + c);
                    cnt[c]--;

                    int k = j + 1;

                    for (int z = 0; z < 26; z++) {
                        while (cnt[z] > 0) {
                            ans[k++] = (char) ('a' + z);
                            cnt[z]--;
                        }
                    }

                    return new String(ans);
                }
            }
        }

        return "";
    }
}