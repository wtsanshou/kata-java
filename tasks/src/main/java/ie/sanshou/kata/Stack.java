package ie.sanshou.kata;

class Stack {

    private int size;
    private int capacity;
    private int[] elements;

    static Stack make(int capacity) {
        if(capacity<0) throw new IllegalCapacity();
        return new Stack(capacity);
    }

    private Stack(int capacity) {
        this.capacity = capacity;
        elements = new int[capacity];
    }

    boolean isEmpty() {
        return size == 0;
    }

    int getSize() {
        return size;
    }

    void push(int element) {
        if (size == capacity) throw new Overflow();
        this.elements[size++] = element;
    }

    int pop() {
        if (size == 0) throw new Underflow();
        return elements[--size];
    }

    class Overflow extends RuntimeException {
    }

    class Underflow extends RuntimeException {
    }

    static class IllegalCapacity extends RuntimeException {
    }
}
