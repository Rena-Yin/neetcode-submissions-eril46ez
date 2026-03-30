class Solution {
    public boolean hasDuplicate(int[] nums) {
        //use a for loop to loop through the array
        //use a HashMap to record value that already exists
        HashMap<Integer, Integer> exist = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (!exist.containsKey(curr)) {
                exist.put(curr, 1);
            } else {
                return true;
            }
        }
        
        return false;
    }
}