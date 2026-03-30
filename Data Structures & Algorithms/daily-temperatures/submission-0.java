class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];
        Stack<int[]> stack = new Stack<>();

        for (int i = 0; i < res.length; i++) {
            res[i] = 0;
        }

        for (int i = 0; i < temperatures.length; i++) {
            int cur = temperatures[i];
            while (!stack.isEmpty() && cur > stack.peek()[0]) {
                //pop prev
                //store index diff
                int idx = stack.pop()[1];
                int diff = i - idx;
                res[idx] = diff;
            }
            //push
            stack.push(new int[]{temperatures[i], i});
        }

        return res;
    }
}
