package ie.sanshou.kata.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack stack = new Stack();

    @Test
    void newlyCreatedStack_shouldBeEmpty() {
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }

    @Test
    void stackCanPushOne() {
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    void stackPushOneAndPopOne_shouldBeEmpty() {
        stack.push(1);
        stack.pop();
        assertTrue(stack.isEmpty());
    }


}
