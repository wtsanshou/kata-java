package ie.sanshou.kata;

import java.util.ArrayList;
import java.util.List;

class Stack {

    private int size;
    private int capacity;
    private List<Integer> elements = new ArrayList<>();

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
        this.elements.add(element);
    }

    int pop() {
        if (size == 0) throw new Underflow();
        size--;
        return elements.get(size);
    }

    class Overflow extends RuntimeException {
    }

    class Underflow extends RuntimeException {
    }
}
