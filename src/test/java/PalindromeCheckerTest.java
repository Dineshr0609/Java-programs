import org.junit.*;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeCheckerTest {

    @Test
    public void testIsPalindromeWithPalindromeNumber() {
        boolean result = PalindromeChecker.isPalindrome(1221);
        assertTrue(result);
    }

    @Test
    public void testIsPalindromeWithNonPalindromeNumber() {
        boolean result = PalindromeChecker.isPalindrome(12345);
        assertFalse(result);
    }

    @Test
    public void testIsPalindromeWithSingleDigitNumber() {
        boolean result = PalindromeChecker.isPalindrome(7);
        assertTrue(result);
    }

    @Test
    public void testIsPalindromeWithNegativeNumber() {
        boolean result = PalindromeChecker.isPalindrome(-121);
        assertFalse(result);
    }
}
