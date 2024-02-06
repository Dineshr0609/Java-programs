package WithOutMain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RepeatedCharactersIdentifierTest {

    @Test
    public void testPrintRepeatedCharactersWithRepeats() {
        RepeatedCharactersIdentifier.printRepeatedCharacters("programming");
        // The output should indicate that 'g' repeats 2 times
        // and 'r' repeats 2 times.
    }

    @Test
    public void testPrintRepeatedCharactersWithoutRepeats() {
        RepeatedCharactersIdentifier.printRepeatedCharacters("abcdef");
        // The output should indicate that there are no repeated characters.
    }

    @Test
    public void testPrintRepeatedCharactersWithSpecialCharacters() {
        RepeatedCharactersIdentifier.printRepeatedCharacters("a!b@cd#e$f");
        // The output should correctly handle and count repeated special characters.
    }
}
