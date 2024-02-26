package LineCoverageTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.src.Palindrome;

public class LineCoverageTest {
@Test
    public void testchainenull(){
        Assertions.assertThrows(NullPointerException.class, ()->Palindrome.isPalindrome(null));
}
    @Test
    public void testchainepalindrome(){
        boolean result = Palindrome.isPalindrome("kayak");
        Assertions.assertTrue(Palindrome.isPalindrome("kayak"));
    }
    @Test
    public void testchaineisnotpalindrome(){
        boolean result = Palindrome.isPalindrome("hamza");
        Assertions.assertEquals(false,Palindrome.isPalindrome("hamza"));
    }
}
