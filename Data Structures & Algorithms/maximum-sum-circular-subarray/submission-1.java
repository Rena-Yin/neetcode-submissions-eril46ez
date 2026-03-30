class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        // circular sum = total - portion sum
        // a value to track the totalMax, currentMax
        // total - minSubarraySum
        int globalMax = nums[0], globalMin = nums[0];
        int currMax = 0, currMin = 0, total = 0;

        for (int i: nums) {
            currMax = Math.max(currMax + i, i);
            currMin = Math.min(currMin + i, i);

            globalMax = Math.max(globalMax, currMax);
            globalMin = Math.min(globalMin, currMin);
            total = total + i;
        }

        // handle all negative case
        // if all negative, want to just return globalMax
        if (globalMax > 0) {
            return Math.max(globalMax, total - globalMin);
        } else {
            return globalMax;
        }
    }
}