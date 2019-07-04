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
        if (size == 0) throw new Empty();
        return elements[--size];
    }

    @Override
    public Integer find(int element) {
        for (int i = size - 1; i >= 0; i--)
            if (elements[i] == element) return (size - 1) - i;
        return null;
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
            throw new Empty();
        }

        @Override
        public Integer find(int element) {
            return null;
        }
    }

}
