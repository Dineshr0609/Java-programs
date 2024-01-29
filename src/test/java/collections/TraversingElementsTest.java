package collections;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static collections.TraversingElements.traverseWithForLoop;
import static org.junit.Assert.assertEquals;
import collections.TraversingElements;

public class TraversingElementsTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testArrayListTraversal() {
        // Create an ArrayList of Strings
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");
        stringList.add("Grapes");

        // Create an instance of the class to test
        TraversingElements arrayListTraversal = new TraversingElements();

        // Test traversing using for loop
        traverseWithForLoop(stringList);
        assertEquals("Apple\nBanana\nOrange\nGrapes\n", outContent.toString());

        // Reset the output content
        outContent.reset();

        // Test traversing using enhanced for loop
        arrayListTraversal.traverseWithEnhancedForLoop(stringList);
        assertEquals("Apple\nBanana\nOrange\nGrapes\n", outContent.toString());
    }
}