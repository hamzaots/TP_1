package LineCoverageTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.src.Palindrome;

public class PalyndromeTest {
@Test
    public void ShouldReturnExceptionIfIsNull(){
        Assertions.assertThrows(NullPointerException.class, ()->Palindrome.isPalindrome(null));
}
    @Test
    public void ShouldReturnTrueIfIsPalindrome(){
        boolean result = Palindrome.isPalindrome("kayak");
        Assertions.assertTrue(Palindrome.isPalindrome("kayak"));
    }
    @Test
    public void ShouldReturnFalseIfIsNotPalyndrome(){
        boolean result = Palindrome.isPalindrome("hamza");
        Assertions.assertEquals(false,Palindrome.isPalindrome("hamza"));
    }
}
