class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = 1; // smallest positive int
        int l = nums.length;
        // if there exist negative val, make it 0
        for (int i = 0; i < l; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;
            }
        }

        for (int i = 0; i < l; i++) {
            int cur = Math.abs(nums[i]);
            if (cur >= 1 && cur <= l) {
                int idx = cur - 1;
                if (nums[idx] > 0) {
                    nums[idx] = -1 * nums[idx];
                } else if (nums[idx] == 0) {
                    nums[idx] = -1 * (l + 1);
                }
            }
        }

        for (int i = 1; i <= l; i++) {
            if (nums[i - 1] >= 0) {
                return i;
            }
        }
        return l + 1;
    }
}