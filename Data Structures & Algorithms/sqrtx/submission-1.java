class Solution {
    public int mySqrt(int x) {
        // BST
        int l = 0;
        int r = x;
        int res = 0;

        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid > x) {
                r = mid - 1;
            } else if ((long) mid * mid < x) {
                l = mid + 1;
                res = mid;
            } else {
                return mid;
            }
        }
        return res;
    }
}

/* Brute force
        if (x == 0) {
            return 0;
        }
        
        int k = 1;
        int cur = k;

        while (x >= k * k) {
            if (x >= k * k && x < (k+1) * (k+1)) {
                cur = k;
                return cur;
            }
            k++;
        }
        return 0; */