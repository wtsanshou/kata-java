package ie.sanshou.kata.stack;

public interface Stack {
    boolean isEmpty();

    void push(int element);

    int pop();

    int getSize();

    final class Overflow extends RuntimeException {
    }

    final class Underflow extends RuntimeException {
    }

    final class IllegalCapacity extends RuntimeException{
    }
}
