package ie.sanshou.kata.lychrel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LychrelTest {

    @Test
    public void facts() {
        isNotLychrel(1, 0, 1000);
    }

    private void isNotLychrel(int n, int iteration, int limit) {
        assertEquals(iteration, Lychrel.convergesAtIteration(n, limit));
    }
}
