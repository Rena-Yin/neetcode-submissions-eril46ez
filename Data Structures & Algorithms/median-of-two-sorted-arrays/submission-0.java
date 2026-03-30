class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        // make sure we always dealing with the smaller array
        if (nums1.length > nums2.length) return findMedianSortedArrays(nums2, nums1);

        int m = nums1.length;
        int n = nums2.length;
        int total = m + n;
        int half = (total + 1) / 2;

        int left = 0, right = m;
        while (left <= right) {
            int middle1 = (left + right) / 2;
            int remain = half - middle1;

            int leftA = (middle1 == 0) ? Integer.MIN_VALUE : nums1[middle1 - 1];
            int rightA = (middle1 == m) ? Integer.MAX_VALUE : nums1[middle1];
            int leftB = (remain == 0) ? Integer.MIN_VALUE : nums2[remain - 1];
            int rightB = (remain == n) ? Integer.MAX_VALUE : nums2[remain];

            if (leftA <= rightB && leftB <= rightA) {
                if (total % 2 == 1) {
                    return (double) Math.max(leftA, leftB);
                } else {
                    return (Math.min(rightA, rightB) + Math.max(leftA, leftB)) / 2.0;
                }
            }
            else if (leftA > rightB) {
                right = middle1 - 1;
            } else { //leftB > rightA
                left = middle1 + 1;
            }
        }
        throw new IllegalArgumentException("Input arrays are not sorted or invalid.");
    }
}
