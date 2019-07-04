package ie.sanshou.kata.stack;

public interface Stack {

    boolean isEmpty();

    int getSize();

    void push(int element);

    int pop();

    int top();

    class IllegalCapacity extends RuntimeException {
    }

}
