import org.junit.Test;
import Strings.AnagramChecker;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AnagramCheckerTest {

    @Test
    public void testAreAnagrams() {
        // Arrange
        String str1 = "anagram";
        String str2 = "naagram";

        // Act & Assert
        assertTrue(AnagramChecker.areAnagrams(str1, str2));
    }

    @Test
    public void testAreNotAnagrams() {
        // Arrange
        String str1 = "hello";
        String str2 = "world";

        // Act & Assert
        assertFalse(AnagramChecker.areAnagrams(str1, str2));
    }
}