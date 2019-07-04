package ie.sanshou.kata;

class Stack {

    private int size;
    private int capacity;

    static Stack make(int capacity) {
        return new Stack(capacity);
    }

    private Stack(int capacity) {

        this.capacity = capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    int getSize() {
        return size;
    }

    void push(int element) {
        if (size == capacity) throw new Overflow();
        size++;
    }

    void pop() {
        if (size == 0) throw new Underflow();
        size--;
    }

    class Overflow extends RuntimeException {
    }

    class Underflow extends RuntimeException {
    }
}
