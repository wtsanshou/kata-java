package ie.sanshou.kata.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack stack = new Stack();

    @Test
    void createStack() {
        assertTrue(stack.isEmpty());
    }

    @Test
    void stackCanPushOne() {
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    void stackPushOne_canGetOne(){
        stack.push(1);
        final int one = stack.pop();
        assertEquals(1, one);
    }

}
