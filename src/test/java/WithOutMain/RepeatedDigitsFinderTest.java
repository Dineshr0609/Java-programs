package WithOutMain;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RepeatedDigitsFinderTest {

    @Test
    public void testFindRepeatedDigits() {
        int inputNumber = 122345556;
        List<Integer> repeatedDigits = RepeatedDigitsFinder.findRepeatedDigits(inputNumber);

        List<Integer> expectedRepeatedDigits = Arrays.asList(2, 5);

        assertEquals(expectedRepeatedDigits, repeatedDigits);
    }
}
