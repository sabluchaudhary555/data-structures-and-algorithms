class myStack {
    private int[] arr;
    private int top;
    private int capacity;
    
    public myStack(int n) {
        capacity = n;
        arr = new int[capacity];
        top = -1;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public boolean isFull() {
        return top == capacity - 1;
    }
    
    public void push(int x) {
        if (!isFull()) {
            arr[++top] = x;
        }
    }
    
    public void pop() {
        if (!isEmpty()) {
            top--;
        }
    }
    
    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        return -1;
    }
}