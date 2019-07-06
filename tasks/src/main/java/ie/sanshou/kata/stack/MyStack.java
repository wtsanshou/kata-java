package ie.sanshou.kata.stack;

class MyStack {

    private int size;

    boolean isEmpty() {
        return size==0;
    }

    void push(int element) {
        size++;
    }
}
