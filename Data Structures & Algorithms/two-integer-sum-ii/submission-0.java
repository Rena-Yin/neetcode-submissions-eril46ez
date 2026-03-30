class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (true) {
            int result = numbers[left] + numbers[right];
            if (result == target) {
                int[] res = new int[2];
                res[0] = left + 1;
                res[1] = right + 1;
                return res;
            }
            if (result < target) {
                //if the result is less than target, shift left to right 1 unit
                left++;
            } else {
                // the result is greater than target, shift right to left 1 unit
                right--;
            }
        }
    }
}
