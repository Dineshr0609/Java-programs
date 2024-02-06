package Strings;

import java.lang.String;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WordReverserTest {
    @Test
    public void testReverseWords() {
        // Test case 1: Normal input with multiple words
        String input1 = "Java J2EE Reverse Me";
        String expectedOutput1 = "avaJ EE2J esreveR eM";
        WordReverser WordReverser = null;
        assertEquals(expectedOutput1, WordReverser.reverseWords(input1));

        // Test case 2: Input with a single word
        String input2 = "Java";
        String expectedOutput2 = "avaJ";
        assertEquals(expectedOutput2, WordReverser.reverseWords(input2));

        // Test case 3: Input with an empty string
        String input3 = "";
        String expectedOutput3 = "";
        assertEquals(expectedOutput3, WordReverser.reverseWords(input3));

        // Test case 4: Input with null
        String input4 = null;
        String expectedOutput4 = null;
        assertEquals(expectedOutput4, WordReverser.reverseWords(input4));
    }
}

