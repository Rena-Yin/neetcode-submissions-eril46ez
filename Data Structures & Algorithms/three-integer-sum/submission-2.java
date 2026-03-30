class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        
        // a number + 2sum
        for (int a = 0; a < nums.length - 2; a++) {
            // skip dup for a
            if (a > 0 && nums[a] == nums[a - 1]) {
                continue;
            }
            int left = a + 1;
            int right = nums.length - 1;
            while (left < right) {
                int resultNum = nums[a] + nums[left] + nums[right];
                if (resultNum < 0) {
                    left++;
                } else if (resultNum > 0) {
                    right--;
                } else if (resultNum == 0){
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[a]);
                    l.add(nums[left]);
                    l.add(nums[right]);
                    res.add(l);
                    left++;
                    right--;
                    while(left < right && nums[left] == nums[left - 1]) { 
                        left++;
                    }
                    System.out.println(right);
                    while(left < right && nums[right] == nums[right + 1]) {
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
