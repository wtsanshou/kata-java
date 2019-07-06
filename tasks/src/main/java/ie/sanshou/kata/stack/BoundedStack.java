package ie.sanshou.kata.stack;

class BoundedStack implements Stack {

    private int top;
    private int[] elements;
    private int capacity;

    private BoundedStack(int capacity) {
        if (capacity < 0) throw new IllegalCapacity();
        this.capacity = capacity;
        elements = new int[capacity];
    }

    static synchronized Stack MAKE(int capacity) {
        if (capacity == 0) return new EmptyStack();
        return new BoundedStack(capacity);
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public void push(int element) {
        if (top == capacity) throw new Overflow();
        this.elements[top++] = element;
    }

    @Override
    public int pop() {
        if (top == 0) throw new Underflow();
        return elements[--top];
    }

    @Override
    public int getSize() {
        return top;
    }

    private static class EmptyStack implements Stack {
        @Override
        public boolean isEmpty() {
            return true;
        }

        @Override
        public void push(int element) {
            throw new Overflow();
        }

        @Override
        public int pop() {
            throw new Underflow();
        }

        @Override
        public int getSize() {
            return 0;
        }
    }
}
