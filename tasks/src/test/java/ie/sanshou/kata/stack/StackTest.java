package ie.sanshou.kata.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StackTest {

    @Test
    void createStack() {
        MyStack stack = new MyStack();
        assertTrue(stack.isEmpty());
    }

    @Test
    void stackCanPushOne() {
        MyStack stack = new MyStack();
        stack.push(1);
        assertFalse(stack.isEmpty());
    }
}
