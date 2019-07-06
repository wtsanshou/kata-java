package ie.sanshou.kata.stack;

class Stack {

    private int size;

    boolean isEmpty() {
        return size==0;
    }

    void push(int element) {
        size++;
    }
}
