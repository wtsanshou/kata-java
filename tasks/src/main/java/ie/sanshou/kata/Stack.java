package ie.sanshou.kata;

class Stack {

    private int size;

    static Stack make(int capacity) {
        return new Stack(capacity);
    }

    private Stack(int capacity) {

    }

    boolean isEmpty() {
        return size == 0;
    }

    int getSize() {
        return size;
    }

    void push(int element) {
        size++;
    }

    void pop() {
        size--;
    }

}
