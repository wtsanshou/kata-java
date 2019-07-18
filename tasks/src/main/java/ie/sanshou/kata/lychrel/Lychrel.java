package ie.sanshou.kata.lychrel;

public class Lychrel {
    public static int convergesAtIteration(int n, int limit) {
        if (!isPalindrome(n)) {
            int r = reverse(n);
            n = r + n;
            if (!isPalindrome(n))
                return 2;
            return 1;
        }
        else
            return 0;
    }

    public static int reverse(int n) {
        char[] digits = Integer.toString(n).toCharArray();

        for (int i = 0, j = digits.length - 1; i < j; i++, j--) {
            char temp = digits[i];
            digits[i] = digits[j];
            digits[j] = temp;
        }

        return Integer.valueOf(new String(digits));
    }

    public static boolean isPalindrome(int n) {
        String digits = Integer.toString(n);
        for (int i = 0, j = digits.length() - 1; i < j; i++, j--)
            if (digits.charAt(i) != digits.charAt(j))
                return false;
        return true;
    }
}
