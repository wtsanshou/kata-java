package ie.sanshou.kata.stack;

public interface Stack {

    boolean isEmpty();

    int getSize();

    void push(int element);

    int pop();

    int top();

    int find(int element);

    class IllegalCapacity extends RuntimeException {
    }

    class Empty extends RuntimeException {
    }

    class Overflow extends RuntimeException {
    }

    class Underflow extends RuntimeException {
    }
}
