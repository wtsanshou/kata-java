package ie.sanshou.kata.stack;

class BoundedStack implements Stack {

    private int size;
    private int element;
    private int capacity;

    private BoundedStack(int capacity) {
        if (capacity < 0) throw new IllegalCapacity();
        this.capacity = capacity;
    }

    static synchronized Stack MAKE(int capacity) {
        if (capacity == 0) return new EmptyStack();
        return new BoundedStack(capacity);
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void push(int element) {
        if (size == capacity) throw new Overflow();
        size++;
        this.element = element;
    }

    @Override
    public int pop() {
        if (size == 0) throw new Underflow();
        size--;
        return element;
    }

    @Override
    public int getSize() {
        return size;
    }

    private static class EmptyStack implements Stack {
        @Override
        public boolean isEmpty() {
            return false;
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
            return -1;
        }
    }
}
