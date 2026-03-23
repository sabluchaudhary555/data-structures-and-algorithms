class myQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int size;
    
    public myQueue(int n) {
        capacity = n;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == capacity;
    }
    
    public void enqueue(int x) {
        if (!isFull()) {
            rear = (rear + 1) % capacity;
            arr[rear] = x;
            size++;
        }
    }
    
    public void dequeue() {
        if (!isEmpty()) {
            front = (front + 1) % capacity;
            size--;
        }
    }
    
    public int getFront() {
        if (!isEmpty()) {
            return arr[front];
        }
        return -1;
    }
    
    public int getRear() {
        if (!isEmpty()) {
            return arr[rear];
        }
        return -1;
    }
}