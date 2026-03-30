class MinStack {
    List<Integer> stack;
    Stack<Integer> minStack;

    public MinStack() {
        stack = new ArrayList<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        stack.add(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
        }
    }
    
    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        int top = stack.remove(stack.size() - 1);
        if (minStack.isEmpty()) {
            return;
        }
        if (top == minStack.peek()) {
            minStack.pop();
        }
    }
    
    public int top() {
        return stack.get(stack.size() - 1);
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
