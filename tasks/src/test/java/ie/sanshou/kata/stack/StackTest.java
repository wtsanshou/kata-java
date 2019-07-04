package ie.sanshou.kata.stack;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    private Stack stack;

    @BeforeEach
    void setup() {
        stack = BoundedStackStack.make(2);
    }

    @Test
    void newlyCreateStack_ShouldBeEmpty() {
        assertTrue(stack.isEmpty());
        assertEquals(0, stack.getSize());
    }

    @Test
    void afterOnePush_StackSize_ShouldBeOne() {
        stack.push(1);
        assertEquals(1, stack.getSize());
        assertFalse(stack.isEmpty());
    }

    @Test
    void afterOnePushAndOnePop_ShouldBeEmpty() {
        stack.push(1);
        stack.pop();
        assertTrue(stack.isEmpty());
    }

    @Test
    void whenPushedPastLimit_StackOverflows() {
        stack.push(1);
        stack.push(1);
        assertThrows(BoundedStackStack.Overflow.class, () -> {
            stack.push(1);
        });
    }

    @Test
    void winEmptyStackIsPopped_ShouldThrowUnderflow() {
        assertThrows(BoundedStackStack.Underflow.class, () -> {
            stack.pop();
        });
    }

    @Test
    void whenOneIsPushed_OneIsPopped() {
        stack.push(1);
        assertEquals(1, stack.pop());
    }

    @Test
    void whenOneAndTwoArePushed_TwoAndOneArePopped() {
        stack.push(1);
        stack.push(2);
        assertEquals(2, stack.pop());
        assertEquals(1, stack.pop());
    }

    @Test
    void whenCreatingStackWithNegativeSize_ShouldThrowIllegalCapacity() {
        assertThrows(BoundedStackStack.IllegalCapacity.class, () -> {
            BoundedStackStack.make(-1);
        });
    }

    @Test
    void whenCreatingStackWithZeroCapacity_AnyPushShouldOverflow() {
        assertThrows(BoundedStackStack.Overflow.class, () -> {
            stack = BoundedStackStack.make(0);
            stack.push(1);
        });
    }
}
