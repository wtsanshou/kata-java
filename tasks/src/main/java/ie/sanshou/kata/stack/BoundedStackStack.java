package ie.sanshou.kata.stack;

public class BoundedStackStack implements Stack {

    private int size;
    private int capacity;
    private int[] elements;

    static Stack make(int capacity) {
        if (capacity < 0) throw new IllegalCapacity();
        if (capacity == 0) return new ZeroStack();
        return new BoundedStackStack(capacity);
    }

    private BoundedStackStack(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void push(int element) {
        if (size == capacity) throw new Overflow();
        this.elements[size++] = element;
    }

    @Override
    public int pop() {
        if (size == 0) throw new Underflow();
        return elements[--size];
    }

    @Override
    public int top() {
        return elements[--size];
    }

    static class Overflow extends RuntimeException {
    }

    static class Underflow extends RuntimeException {
    }

    private static class ZeroStack implements Stack {

        @Override
        public boolean isEmpty() {
            return true;
        }

        @Override
        public int getSize() {
            return 0;
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
        public int top() {
            return -1;
        }
    }

}
