package ie.sanshou.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack stack = new Stack();

    @Test
    void newlyCreateStack_ShouldBeEmpty() {
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }

    @Test
    void afterOnePush_StackSize_ShouldBeOne(){
        stack.push(1);
        assertEquals(1, stack.getSize());
        assertFalse(stack.isEmpty());
    }

    @Test
    void afterOnePushAndOnePop_ShouldBeEmpty(){
        stack.push(1);
        stack.pop();
        assertTrue(stack.isEmpty());
    }
}
