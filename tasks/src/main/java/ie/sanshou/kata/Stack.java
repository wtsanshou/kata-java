package ie.sanshou.kata;

class Stack {

    private boolean empty = true;
private int size;
    boolean isEmpty() {
        return empty;
    }

    int getSize() {
        return size;
    }

     void push(int n) {
        size++;
    }
}
