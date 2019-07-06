package ie.sanshou.kata.stack;

class Stack {

    private int size;
    private int element;
    private int capacity;

    private Stack(int capacity) {
        this.capacity = capacity;
    }

    static synchronized Stack MAKE(int capacity) {
        return new Stack(capacity);
    }

    boolean isEmpty() {
        return size == 0;
    }

    void push(int element) {
        if (size == capacity) throw new Overflow();
        size++;
        this.element = element;
    }

    int pop() {
        if (size == 0) throw new Underflow();
        size--;
        return element;
    }

    int getSize() {
        return size;
    }

    static final class Overflow extends RuntimeException {
    }

    static final class Underflow extends RuntimeException {
    }
}
