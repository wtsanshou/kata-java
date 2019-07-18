package ie.sanshou.kata.lychrel;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

public class LychrelTest {

    private final int LIMIT = 1000;

    @Test
    public void facts() {
        convergesAtIteration(1, 0);
        convergesAtIteration(2, 0);
        convergesAtIteration(10, 1);
        convergesAtIteration(11, 0);
        convergesAtIteration(19, 2);
        convergesAtIteration(78, 4);
        convergesAtIteration(89, 24);
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
        assertTrue(Lychrel.isPalindrome(BigInteger.valueOf(n)));
    }

    private void isNotPalindrome(int n) {
        assertFalse(Lychrel.isPalindrome(BigInteger.valueOf(n)));
    }

    @Test
    public void reversals() {
        reversed(1, 1);
        reversed(12, 21);
        reversed(123, 321);
        reversed(1234, 4321);
    }

    private void reversed(int n, int r) {
        assertEquals(r, Lychrel.reverse(BigInteger.valueOf(n)).longValue());
    }
}
