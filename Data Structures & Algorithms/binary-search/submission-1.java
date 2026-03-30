class Solution {
    public int search(int[] nums, int target) {
        // binary search
        int l = 0;
        int r = nums.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            int cur = nums[m];
            if (cur < target) {
                l = m + 1;
            } else if (cur > target) {
                r = m - 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}
