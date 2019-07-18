package ie.sanshou.kata.lychrel;

public class Lychrel {
    public static int convergesAtIteration(int n, int limit) {
        if (!isPalindrome(n)) {
            int r = reverse(n);
            int sum = r + n;
            if (!isPalindrome(sum))
                return 2;
            return 1;
        }
        else
            return 0;
    }

    public static int reverse(int n) {
        char[] nDigits = Integer.toString(n).toCharArray();
        char[] rDigits = new char[nDigits.length];

        final int lastIndex = nDigits.length - 1;
        for (int i = lastIndex; i>=0; i--) {
            rDigits[lastIndex-i] = nDigits[i];
        }

        return Integer.valueOf(new String(rDigits));
    }

    public static boolean isPalindrome(int n) {
        String digits = Integer.toString(n);
        for (int i = 0, j = digits.length() - 1; i < j; i++, j--)
            if (digits.charAt(i) != digits.charAt(j))
                return false;
        return true;
    }
}
