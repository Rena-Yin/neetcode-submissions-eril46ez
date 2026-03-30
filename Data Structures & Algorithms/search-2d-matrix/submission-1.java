class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int ROW = matrix.length;
        int COL = matrix[0].length;

        int top = 0;
        int bot = ROW - 1;
        int left = 0;
        int right = COL - 1;
        while (top <= bot) {
            int row = (top + bot) / 2;
            if (target < matrix[row][0]) {
                // go down
                bot = row - 1;
            } else if (target > matrix[row][COL - 1]) {
                // go up
                top = row + 1;
            } else {
                break;
            }
        }
        if (!(top <= bot)) {
            return false;
        }

        int row = (top + bot) / 2;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (matrix[row][mid] < target) {
                left = mid + 1;
            } else if (matrix[row][mid] > target) {
                right = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
