class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int area = 0;

        while(left < right) {
            int curArea = Math.min(heights[right], heights[left]) * (right - left);
            area = Math.max(area, curArea);
            if (heights[left] < heights[right]) {
                left++;
            } else {
                right--;
            }
        }
        return area;
    }
}