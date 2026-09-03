class Solution {
    public boolean uniformArray(int[] nums1) {
        boolean odd = false, even = false;

        for (int num : nums1) {
            if (num % 2 == 0) even = true;
            else odd = true;
        }

        if (!odd || !even) return true;

        int min = Integer.MAX_VALUE;

        for (int num : nums1) {
            min = Math.min(min, num);
        }

        return min % 2 == 1;
    }
}