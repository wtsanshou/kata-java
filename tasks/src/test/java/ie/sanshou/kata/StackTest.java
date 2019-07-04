package ie.sanshou.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void newlyCreateStack_ShouldBeEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }

    @Test
    void afterOnePush_StackSize_ShouldBeOne(){
        Stack stack = new Stack();
        stack.push(1);
        assertEquals(1, stack.getSize());
        assertFalse(stack.isEmpty());
    }
}
