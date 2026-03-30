class Solution {
    public int maxProfit(int[] prices) {
        if (prices.length == 1) {
            return 0;
        }
        // construct a window, if the profit < 0 pass it
        // record the max value and keep updating this value
        int max = 0, left = 0, right = 1;
        while (right < prices.length && left <= right) {
            int profit = prices[right] - prices[left];
            if (profit >= 0) {
                max = Math.max(profit, max);
            } else {
                left = right;
            }
            right++;
        }
        return max;
    }
}
