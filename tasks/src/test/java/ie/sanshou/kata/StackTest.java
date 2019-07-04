package ie.sanshou.kata;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class StackTest {

    @Test
    public void createStack() {
        Stack stack = new Stack();
        assertTrue(stack.isEmpty());
    }
}
