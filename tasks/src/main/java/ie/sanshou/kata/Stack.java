package ie.sanshou.kata;

class Stack {

    private int size;

    boolean isEmpty() {
        return size == 0;
    }

    int getSize() {
        return size;
    }

    void push(int element) {
        size++;
    }
}
