package ie.sanshou.kata.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoundedStackTest {

    private BoundedStack boundedStack = BoundedStack.MAKE(2);

    @Test
    void newlyCreatedStack_shouldBeEmpty() {
        assertTrue(boundedStack.isEmpty());
        assertEquals(0, boundedStack.getSize());
    }

    @Test
    void stackCanPushOne() {
        boundedStack.push(1);
        assertFalse(boundedStack.isEmpty());
    }

    @Test
    void afterPushOneAndPopOne_stackShouldBeEmpty() {
        boundedStack.push(1);
        boundedStack.pop();
        assertTrue(boundedStack.isEmpty());
    }

    @Test
    void afterPushOneExceedStackLimit_shouldThrowOverflowException() {
        boundedStack.push(1);
        boundedStack.push(1);
        assertThrows(BoundedStack.Overflow.class, () -> boundedStack.push(1));
    }

    @Test
    void afterPopOneFromEmptyStack_shouldThrowUnderflowException(){
        assertThrows(BoundedStack.Underflow.class, () -> boundedStack.pop());
    }

    @Test
    void whenCreatingStackWithNegativeCapacity_shouldThrowIllegalCapacityException(){
        assertThrows(BoundedStack.IllegalCapacity.class, () -> BoundedStack.MAKE(-1));
    }

@Test
    void whenCreatingStackWithZeroCapacityAndPushOne_shouldOverflowException() {
        boundedStack = BoundedStack.MAKE(0);
        assertThrows(BoundedStack.Overflow.class, ()-> boundedStack.push(1));
    }
}
