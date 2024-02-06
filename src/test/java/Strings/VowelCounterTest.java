package Strings;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class VowelCounterTest {

    @Test
    public void testCountVowels() {
        // Given
        String inputString = "My Name Is Dinesh RavipAti";

        // When
        int result = VowelCounter.countVowels(inputString);

        // Then
        assertEquals(9, result); // Adjust the expected value based on the inputString
    }
}