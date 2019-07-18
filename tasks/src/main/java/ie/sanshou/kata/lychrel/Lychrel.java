package ie.sanshou.kata.lychrel;

public class Lychrel {
    public static int convergesAtIteration(int n, int limit) {
        if (isPalindrome(n))
            return 0;
        else
            return 1;
    }

    public static boolean isPalindrome(int n) {
        String digits = Integer.toString(n);
        final int lastIndex = digits.length() - 1;
        for (int i = 0; i < digits.length(); i++)
            if(digits.charAt(i) != digits.charAt(lastIndex-i))
                return false;
        return true;
    }
}
