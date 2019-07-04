package ie.sanshou.kata.stack;

public class BoundedStackStack implements Stack {

    private int size;
    private int capacity;
    private int[] elements;

    static Stack make(int capacity) {
        if (capacity < 0) throw new IllegalCapacity();
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

    class Overflow extends RuntimeException {
    }

    class Underflow extends RuntimeException {
    }

}
