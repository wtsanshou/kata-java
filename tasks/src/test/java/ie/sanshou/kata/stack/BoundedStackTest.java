package ie.sanshou.kata.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoundedStackTest {

    private Stack stack = BoundedStack.MAKE(2);

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
        assertThrows(BoundedStack.Overflow.class, () -> stack.push(1));
    }

    @Test
    void afterPopOneFromEmptyStack_shouldThrowUnderflowException() {
        assertThrows(BoundedStack.Underflow.class, () -> stack.pop());
    }

    @Test
    void whenCreatingStackWithNegativeCapacity_shouldThrowIllegalCapacityException() {
        assertThrows(BoundedStack.IllegalCapacity.class, () -> BoundedStack.MAKE(-1));
    }

    @Test
    void whenCreatingStackWithZeroCapacityAndPushOne_shouldOverflowException() {
        stack = BoundedStack.MAKE(0);
        assertThrows(BoundedStack.Overflow.class, () -> stack.push(1));
    }

    @Test
    void whenCreatingStackWithZeroCapacityAndPop_shouldUnderflowException() {
        stack = BoundedStack.MAKE(0);
        assertThrows(BoundedStack.Underflow.class, () -> stack.pop());
    }

    @Test
    void whenCreatingStackWithZeroCapacity_sizeShouldBeZero() {
        stack = BoundedStack.MAKE(0);
        assertEquals(0, stack.getSize());
    }

    @Test
    void whenCreatingStackWithZeroCapacity_stackShouldBeEmpty() {
        stack = BoundedStack.MAKE(0);
        assertTrue(stack.isEmpty());
    }
}
