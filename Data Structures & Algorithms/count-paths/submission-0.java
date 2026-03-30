class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 1][n + 1];
        for (int a = 0; a < m + 1; a++) {
            for (int i = 0; i < n + 1; i++) {
                dp[a][i] = 0;
            }
        }
        dp[m - 1][n - 1] = 1;

        for (int i = m - 1; i >= 0; i--) {
            for (int j = n - 1; j >= 0; j--) {
                dp[i][j] += dp[i][j + 1] + dp[i + 1][j];
                // System.out.println("cur: " + dp[i][j]);
            }
        }
        return dp[0][0];
    }
}
