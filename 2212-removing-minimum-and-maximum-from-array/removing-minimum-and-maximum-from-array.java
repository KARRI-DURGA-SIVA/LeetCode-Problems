class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] < nums[minIndex]) {
                minIndex = i;
            }

            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }

        int a = Math.min(minIndex, maxIndex);
        int b = Math.max(minIndex, maxIndex);

        int front = b + 1;
        int back = n - a;
        int both = (a + 1) + (n - b);

        return Math.min(front, Math.min(back, both));
    }
}