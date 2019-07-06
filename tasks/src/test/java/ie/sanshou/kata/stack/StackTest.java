package ie.sanshou.kata.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack stack = Stack.MAKE(2);

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
    void afterPushOneAndPopOne_stackShouldBeEmpty() {
        stack.push(1);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    void afterPushOneExceedStackLimit_shouldThrowOverflowException() {
        stack.push(1);
        stack.push(1);
        assertThrows(Stack.Overflow.class, () -> stack.push(1));
    }

    @Test
    void afterPopOneFromEmptyStack_shouldThrowUnderflowException(){
        assertThrows(Stack.Underflow.class, () -> stack.pop());
    }

    @Test
    void whenCreatingStackWithNegativeCapacity_shouldThrowIllegalCapacityException(){
        assertThrows(Stack.IllegalCapacity.class, () -> Stack.MAKE(-1));
    }

}
