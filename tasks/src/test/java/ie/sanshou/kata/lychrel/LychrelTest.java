package ie.sanshou.kata.lychrel;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LychrelTest {

    private final int LIMIT = 1000;

    @Disabled
    @Test
    public void facts() {
        convergesAtIteration(1, 0);
        convergesAtIteration(2, 0);
        convergesAtIteration(10, 1);
        convergesAtIteration(11, 0);
    }

    private void convergesAtIteration(int n, int iteration) {
        assertEquals(iteration, Lychrel.convergesAtIteration(n, LIMIT));
    }

    @Test
    public void palindromes() {
        isPalindrome(1);
        isPalindrome(11);
        isPalindrome(121);
        isPalindrome(12321);
    }

    @Test
    public void nonPalindromes(){
        isNotPalindrome(10);
        isNotPalindrome(12331);
    }

    private void isPalindrome(int n) {
        assertTrue(Lychrel.isPalindrome(n));
    }

    private void isNotPalindrome(int n) {
        assertFalse(Lychrel.isPalindrome(n));
    }
}
