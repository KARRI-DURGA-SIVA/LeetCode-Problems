
class Solution {
    public long minimumCost(
        int cost1,
        int cost2,
        int costBoth,
        int need1,
        int need2
    ) {

        // Choice 1: Buy only Type 1 and Type 2
        long option1 =
            (long) need1 * cost1 +
            (long) need2 * cost2;

        // Find the common requirement
        long common = Math.min(need1, need2);

        // Choice 2: Buy Type 3 for common requirements
        // and separate items for the remaining requirements
        long option2 =
            common * costBoth +
            (need1 - common) * cost1 +
            (need2 - common) * cost2;

        // Choice 3: Buy only Type 3 items
        long option3 =
            (long) Math.max(need1, need2) * costBoth;

        // Return the cheapest option
        return Math.min(option1,
               Math.min(option2, option3));
    }
}
