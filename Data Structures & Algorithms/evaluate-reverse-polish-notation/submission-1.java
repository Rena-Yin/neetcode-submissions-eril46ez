class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> sta = new Stack<>();

        for (int i = 0; i < tokens.length; i ++) {
            String t = tokens[i];
            int num;
            if (t.equals("+")) {
                sta.push(sta.pop() + sta.pop());
            } else if (t.equals("-")) {
                int a = sta.pop();
                int b = sta.pop();
                sta.push(b - a);
            } else if (t.equals("*")) {
                sta.push(sta.pop() * sta.pop());
            } else if (t.equals("/")) {
                int a = sta.pop();
                int b = sta.pop();
                sta.push(b / a);
            } else {
                num = Integer.parseInt(t);
                sta.push(num);
            }
        }
        return sta.peek();
    }
}
