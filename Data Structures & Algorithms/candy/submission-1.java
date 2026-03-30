class Solution {
    public int candy(int[] ratings) {
        // initialize the candy arr all 1
        // forward path: compare curr with left val, if greater + 1
        // backward path: start from second last, compare to its right val
        // also compare candy amount

        int[] res = new int[ratings.length];
        int sum = 0;
        for (int i = 0; i < res.length; i++) {
            res[i] = 1;
        }

        for (int f = 1; f < res.length; f++) {
            if (ratings[f] > ratings[f - 1]) {
                res[f] = res[f - 1] + 1;
                System.out.println(Arrays.toString(res));
            }
        }

        for (int b = res.length - 2; b >= 0; b--) {
            if (ratings[b] > ratings[b + 1]) {
                if (res[b] <= res[b + 1]) {
                    res[b] = Math.max(res[b], res[b + 1] + 1);
                }
            }
        }

        // System.out.println(Arrays.toString(res));

        for (int j = 0; j < res.length; j++) {
            sum += res[j];
        }
        return sum;
    }
}