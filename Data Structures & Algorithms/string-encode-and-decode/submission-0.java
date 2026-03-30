class Solution {

    public String encode(List<String> strs) {
        // for each word record its length, add a "#" afterby
        // then store this as a new string
        String res = "";
        for (int i = 0; i < strs.size(); i++) {
            String cur = strs.get(i);
            int len = cur.length();
            res = res + len + "#" + cur;
        }
        return res;
    }

    public List<String> decode(String str) {
        // while i still in bound, set a j to be i-th further
        // when j parse "#", transfer the i to j as a int
        // then use this to decode the string length next
        if (str.isEmpty()) {
            return new ArrayList<>();
        }

        int i = 0;
        List<String> result = new ArrayList<>();
        while (i < str.length()) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int num = Integer.parseInt(str.substring(i, j));
            i = j + 1; //move pass #
            String res = "" + str.substring(j + 1, j + 1 + num);
            result.add(res);
            i += num;
        }

        return result;
    }
}
