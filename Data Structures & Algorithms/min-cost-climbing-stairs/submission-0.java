class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int[] dp = new int[cost.length + 2];
        dp[dp.length - 1] = 0;
        dp[dp.length - 2] = 0;

        for (int i = cost.length - 1; i >= 0; i--) {
            dp[i] = Math.min(cost[i] + dp[i + 1], cost[i] + dp[i + 2]);
        }

        return Math.min(dp[0], dp[1]);
    }
}
