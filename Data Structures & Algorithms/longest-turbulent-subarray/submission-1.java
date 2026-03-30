class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int l = 0, r = 1;
        int res = 1;
        String prev = "";

        while (l <= r && r < arr.length) {
            if (arr[r] > arr[r - 1] && prev != "<") {
                res = Math.max(res, r - l + 1);
                prev = "<";
                r++;
            } else if (arr[r] < arr[r - 1] && prev != ">") {
                res = Math.max(res, r - l + 1);
                prev = ">";
                r++;
            } else { // arr[r] = arr[r - 1]
                if (arr[r] == arr[r - 1]) {
                    l = r;
                    r = r + 1;
                } else {
                    l = r - 1;
                }
                prev = "";
            }
        }
        return res;
    }
}