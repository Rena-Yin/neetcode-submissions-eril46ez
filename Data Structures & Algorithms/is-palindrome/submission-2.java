class Solution {
    public boolean isPalindrome(String s) {
        // check alphanumeric?
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            char lC = s.charAt(left);
            char rC = s.charAt(right);
            // System.out.println("Left char = " + lC + " Right char = " + rC + " right index = " + right);
            while (left < right && !isValid(lC)) {
                left++;
                lC = s.charAt(left);
            }
            while (right > left && !isValid(rC)) {
                right--;
                rC = s.charAt(right);
            }
            if (left < right && !(Character.toLowerCase(lC) == Character.toLowerCase(rC))) {
                // System.out.println("Left char = " + lC + " Right char = " + rC);
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    private boolean isValid(char c) {
        if (c >= 'A' && c <= 'Z' || c >= 'a' && c <='z' || c >= '0' && c <= '9') {
            return true;
        }
        return false;
    }
}
