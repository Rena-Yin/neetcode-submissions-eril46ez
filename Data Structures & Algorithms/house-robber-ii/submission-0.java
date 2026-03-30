class Solution {
    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];
        else {
            return Math.max(helper(Arrays.copyOfRange(nums, 1, nums.length)), helper(Arrays.copyOfRange(nums, 0, nums.length - 1)));
        }

    }

    private int helper(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int rob1 = nums[0];
        int rob2 = Math.max(nums[0], nums[1]); //cur max
        for (int i = 2; i < nums.length; i++) {
            int temp = rob2;
            rob2 = Math.max(rob2, rob1 + nums[i]);
            rob1 = temp;
        }
        return rob2;
    }
}
