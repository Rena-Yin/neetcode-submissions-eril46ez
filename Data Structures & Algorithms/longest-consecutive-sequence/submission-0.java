class Solution {
    public int longestConsecutive(int[] nums) {
        // put nums into a set
        // loop through each element in array
        // Start of sequence? -> cur-1 not in set
        // check cur+1 ?-> set
        int longest = 0;
        Set<Integer> setNums = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            setNums.add(cur);
        }

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            int curLong = 0;
            if (!setNums.contains(curr - 1)) {
                // start of a sequence
                while (setNums.contains(curr + curLong)) {
                    curLong++;
                }
                longest = Math.max(longest, curLong);
            }
        }
        return longest;
    }
}
