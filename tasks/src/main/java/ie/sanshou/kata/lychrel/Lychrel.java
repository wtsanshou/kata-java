package ie.sanshou.kata.lychrel;

import java.math.BigInteger;

public class Lychrel {
    public static int convergesAtIteration(int n, int limit) {
        return converge(BigInteger.valueOf(n), 0);
    }

    private static int converge(BigInteger n, int iteration) {
        if (!isPalindrome(n))
            return converge(n .add(reverse(n)), iteration + 1);
        else
            return iteration;
    }

    public static BigInteger reverse(BigInteger n) {
        char[] digits = n.toString().toCharArray();

        for (int i = 0, j = digits.length - 1; i < j; i++, j--) {
            char temp = digits[i];
            digits[i] = digits[j];
            digits[j] = temp;
        }

        return new BigInteger(new String(digits));
    }

    public static boolean isPalindrome(BigInteger n) {
        String digits = n.toString();
        for (int i = 0, j = digits.length() - 1; i < j; i++, j--)
            if (digits.charAt(i) != digits.charAt(j))
                return false;
        return true;
    }
}
