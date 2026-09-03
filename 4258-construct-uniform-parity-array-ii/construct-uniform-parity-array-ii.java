class Solution {
    public boolean uniformArray(int[] nums1) {
        int min = nums1[0];
        boolean hasOdd = (min & 1) == 1;
        boolean hasEven = !hasOdd;

        for (int i = 1; i < nums1.length; i++) {
            int x = nums1[i];

            if ((x & 1) == 1)
                hasOdd = true;
            else
                hasEven = true;

            if (x < min)
                min = x;
        }

        return !hasOdd || !hasEven || (min & 1) == 1;
    }
}