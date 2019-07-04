package ie.sanshou.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {

    @Test
    public void newlyCreateStack_ShouldBeEmpty() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }
}
