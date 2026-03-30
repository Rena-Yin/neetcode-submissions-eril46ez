class Solution {
    public int trap(int[] height) {
        // set 2 ptrs: l&r. lMax & rMax track the block height
        // while l < r, compute how much water each block can hold
        if (height.length == 0) {
            return 0;
        }
        
        int l = 0;
        int r = height.length - 1;
        int lMax = height[l];
        int rMax = height[r];
        int result = 0;

        while (l < r) {
            if (lMax <= rMax) { //shift l -> l + 1
                l = l + 1;
                lMax = Math.max(height[l], lMax);
                result += lMax - height[l];
            } else { // rMax > lMax, shift r -> r - 1
                r = r - 1;
                rMax = Math.max(height[r], rMax);
                result += rMax - height[r];
            }
        }

        return result;
    }
}
