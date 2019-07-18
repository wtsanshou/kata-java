package ie.sanshou.kata.lychrel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LychrelTest {

    private final int LIMIT = 1000;

    @Test
    public void facts() {
        isNotLychrel(1, 0, LIMIT);
        isNotLychrel(2, 0, LIMIT);
    }

    private void isNotLychrel(int n, int iteration, int limit) {
        assertEquals(iteration, Lychrel.convergesAtIteration(n, limit));
    }
}
