class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> sta = new Stack<>();
        Map<Character, Character> m = new HashMap<>();

        m.put(')', '(');
        m.put(']', '[');
        m.put('}', '{');

        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (m.containsKey(cur)) {
                if (!sta.isEmpty() && sta.peek() == m.get(cur)) {
                    sta.pop();
                } else {
                    return false;
                }
            } else {
                sta.push(cur);
            }
        }

        return sta.isEmpty();
    }
}
