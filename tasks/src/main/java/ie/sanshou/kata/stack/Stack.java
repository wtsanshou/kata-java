package ie.sanshou.kata.stack;

class Stack {

    private int size;
    private int element;
    private int capacity;

    static synchronized Stack MAKE(int capacity){
        return new Stack(capacity);
    }

    private Stack(int capacity) {
        this.capacity = capacity;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void push(int element) {
        if(size == capacity) throw new Overflow();
        size++;
        this.element = element;
    }

    int pop() {
        size--;
        return element;
    }

    int getSize() {
        return size;
    }

    static final class Overflow extends RuntimeException {
    }
}
