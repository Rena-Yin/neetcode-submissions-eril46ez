class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> height = new Stack<>();
        Stack<Integer> index = new Stack<>();
        int max = 0;

        for (int i = 0; i < heights.length; i++) {
            int curHeight = heights[i];
            int start = i;
            while (!height.isEmpty() && curHeight < height.peek()){
                int prevHeight = height.pop();
                int prevIndex = index.pop();
                int area = prevHeight * (i - prevIndex);
                max = Math.max(max, area);

                start = prevIndex;
            }
            height.push(curHeight);
            index.push(start);
        }

        int n = heights.length;

        while (!height.isEmpty()) {
            int curH = height.pop();
            int curI = index.pop();
            int area = curH * (n - curI);
            max = Math.max(max, area);
        }
        return max;
        // Stack<Integer> max = new Stack<>();
        // Arrays.sort(heights);
        // int counter = 1;
        // for (int i = heights.length - 1; i >= 0; i--) {
        //     int area = counter * heights[i];
        //     counter++;
        //     if (max.isEmpty()) {
        //         max.push(area);
        //     } else {
        //         int prev = max.pop();
        //         if (area <= prev) {
        //             // max.push(max);
        //             max.push(prev);
        //         } else {
        //             // max.push(prev);
        //             max.push(area);
        //         }
        //     }
        // }
        // return max.peek();
    }
}
