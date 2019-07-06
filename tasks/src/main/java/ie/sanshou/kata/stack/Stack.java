package ie.sanshou.kata.stack;

class Stack {

    private int size;
    private int element;

    boolean isEmpty() {
        return size == 0;
    }

    void push(int element) {
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
}
