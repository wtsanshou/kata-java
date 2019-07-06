package ie.sanshou.kata.stack;

class BoundedStack implements Stack {

    private int size;
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
        return size == 0;
    }

    @Override
    public void push(int element) {
        if (size == capacity) throw new Overflow();
        this.elements[size] = element;
        size++;
    }

    @Override
    public int pop() {
        if (size == 0) throw new Underflow();
        size--;
        return elements[size];
    }

    @Override
    public int getSize() {
        return size;
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
