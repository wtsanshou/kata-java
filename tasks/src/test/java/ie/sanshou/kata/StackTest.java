package ie.sanshou.kata;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack stack;

    @BeforeEach
     void setup(){
        stack = Stack.make(2);
    }

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

    @Test
    void whenPushedPastLimit_StackOverflows(){
        
    }
}
