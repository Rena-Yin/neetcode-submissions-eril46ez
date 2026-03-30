class Solution {
    public void sortColors(int[] nums) {
        // bucket sort
        //go thru this array, record how many 0s,1s,2s
        //then print out
        int[] arr = new int[3];
        for (int num: nums) {
            arr[num]++;
        }

        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            while (arr[j]-- > 0) {
                nums[index++] = j;
            }
        }
    }
}