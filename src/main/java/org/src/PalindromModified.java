package org.src;

public class PalindromModified {
    public static boolean isPalindrome(String s) {
        if (s == null) {
            throw new NullPointerException("String must not be null");
        }
        s = s.toLowerCase().replaceAll("\\s+", "");
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            j--;  // Decrement j to move towards the middle
            i++;  // Increment i to move towards the middle
        }
        return true;
    }
}
