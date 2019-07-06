package ie.sanshou.kata.stack;

public interface Stack {
    boolean isEmpty();

    void push(int element);

    int pop();

    int getSize();

    int peek();

    final class Overflow extends RuntimeException {
    }

    final class Underflow extends RuntimeException {
    }

    final class IllegalCapacity extends RuntimeException{
    }

    final class EmptyStackException extends RuntimeException{}
}
