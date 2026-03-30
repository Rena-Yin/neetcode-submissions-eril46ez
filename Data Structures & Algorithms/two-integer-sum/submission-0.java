class Solution {
    public int[] twoSum(int[] nums, int target) {
        // use a for loop each time get an index value
        // target - cur, then find out are there needed value

        for (int i = 0; i < nums.length; i++) {
            int want = target - nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] == want) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0, 0};
    }
}
